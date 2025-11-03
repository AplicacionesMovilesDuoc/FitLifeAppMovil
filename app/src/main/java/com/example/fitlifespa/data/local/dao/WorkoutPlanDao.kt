package com.example.fitlifespa.data.local.dao


import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.fitlifespa.data.local.entity.WorkoutPlan
import kotlinx.coroutines.flow.Flow

@Dao
interface WorkoutPlanDao {
    @Query("SELECT * FROM workout_plans WHERE userId = :userId ORDER BY createdAt DESC")
    fun getWorkoutPlansByUser(userId: String): Flow<List<WorkoutPlan>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWorkoutPlan(plan: WorkoutPlan)

    @Query("DELETE FROM workout_plans WHERE id = :planId")
    suspend fun deleteWorkoutPlan(planId: String)

    @Query("SELECT * FROM workout_plans WHERE userId = :userId AND isActive = 1 LIMIT 1")
    fun getActiveWorkoutPlan(userId: String): Flow<WorkoutPlan?>
}