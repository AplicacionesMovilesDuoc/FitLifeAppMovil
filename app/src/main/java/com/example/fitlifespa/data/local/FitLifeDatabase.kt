package com.example.fitlifespa.data.local


import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.yourname.fitlifespa.data.local.dao.*
import com.yourname.fitlifespa.data.local.entity.*

@Database(
    entities = [
        User::class,
        WorkoutPlan::class,
        NutritionPlan::class,
        Progress::class
    ],
    version = 1,
    exportSchema = false
)
abstract class FitLifeDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun workoutPlanDao(): WorkoutPlanDao
    abstract fun nutritionPlanDao(): NutritionPlanDao
    abstract fun progressDao(): ProgressDao

    companion object {
        @Volatile
        private var INSTANCE: FitLifeDatabase? = null

        fun getInstance(context: Context): FitLifeDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    FitLifeDatabase::class.java,
                    "fitlife_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}