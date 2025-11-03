package com.example.fitlifespa.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.fitlifespa.data.local.entity.NutritionPlan
import kotlinx.coroutines.flow.Flow

@Dao
interface NutritionPlanDao {
    @Query("SELECT * FROM nutrition_plans WHERE userId = :userId ORDER BY createdAt DESC")
    fun getNutritionPlansByUser(userId: String): Flow<List<NutritionPlan>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNutritionPlan(plan: NutritionPlan)

    @Query("DELETE FROM nutrition_plans WHERE id = :planId")
    suspend fun deleteNutritionPlan(planId: String)

    @Query("SELECT * FROM nutrition_plans WHERE userId = :userId AND isActive = 1 LIMIT 1")
    fun getActiveNutritionPlan(userId: String): Flow<NutritionPlan?>
}