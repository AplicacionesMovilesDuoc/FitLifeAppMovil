package com.example.fitlifespa.data.local.entity


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "nutrition_plans")
data class NutritionPlan(
    @PrimaryKey
    val id: String,
    val userId: String,
    val trainerId: String,
    val name: String,
    val description: String,
    val meals: String, // JSON string de comidas
    val calories: Int,
    val protein: Int, // en gramos
    val carbs: Int, // en gramos
    val fats: Int, // en gramos
    val isActive: Boolean = true,
    val createdAt: Long = System.currentTimeMillis()
)