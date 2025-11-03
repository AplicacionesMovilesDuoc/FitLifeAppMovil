package com.example.fitlifespa.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "workout_plans")
data class WorkoutPlan(
    @PrimaryKey
    val id: String,
    val userId: String,
    val trainerId: String,
    val name: String,
    val description: String,
    val exercises: String, // JSON string de lista de ejercicios
    val duration: Int, // en minutos
    val difficulty: String, // "beginner", "intermediate", "advanced"
    val isActive: Boolean = true,
    val createdAt: Long = System.currentTimeMillis()
)