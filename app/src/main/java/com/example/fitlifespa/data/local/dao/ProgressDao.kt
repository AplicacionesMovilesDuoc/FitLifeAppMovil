package com.example.fitlifespa.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.fitlifespa.data.local.entity.Progress
import kotlinx.coroutines.flow.Flow

@Dao
interface ProgressDao {
    @Query("SELECT * FROM progress WHERE userId = :userId ORDER BY date DESC")
    fun getProgressByUser(userId: String): Flow<List<Progress>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProgress(progress: Progress)

    @Query("DELETE FROM progress WHERE id = :progressId")
    suspend fun deleteProgress(progressId: String)

    @Query("SELECT * FROM progress WHERE userId = :userId AND date = :date")
    fun getProgressByDate(userId: String, date: Long): Flow<Progress?>
}