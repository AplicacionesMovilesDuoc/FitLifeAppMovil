package com.example.fitlifespa.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

val FitLifeColorScheme = lightColorScheme(
    primary = Color(0xFFFFD700),     // Amarillo vibrante - Energía
    onPrimary = Color(0xFF000000),   // Negro - Elegancia
    primaryContainer = Color(0xFFFFEB3B), // Amarillo claro
    onPrimaryContainer = Color(0xFF000000),

    secondary = Color(0xFF212121),   // Negro grisáceo - Profesionalismo
    onSecondary = Color(0xFFFFFFFF), // Blanco - Pureza
    secondaryContainer = Color(0xFF424242),
    onSecondaryContainer = Color(0xFFFFFFFF),

    background = Color(0xFFFFFFFF),  // Blanco - Limpieza
    onBackground = Color(0xFF000000),
    surface = Color(0xFFFAFAFA),     // Blanco casi puro
    onSurface = Color(0xFF000000),

    error = Color(0xFFB00020),
    onError = Color(0xFFFFFFFF)
)

// Colores personalizados adicionales
val FitLifeCustomColors = object {
    val fitnessYellow = Color(0xFFFFD700)
    val energyYellow = Color(0xFFFFC400)
    val jetBlack = Color(0xFF000000)
    val charcoal = Color(0xFF212121)
    val pureWhite = Color(0xFFFFFFFF)
    val offWhite = Color(0xFFFAFAFA)
}

val FitLifeTypography = Typography(
    displayLarge = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Bold,
        fontSize = 57.sp,
        lineHeight = 64.sp,
        letterSpacing = (-0.25).sp
    ),
    headlineMedium = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.SemiBold,
        fontSize = 28.sp,
        lineHeight = 36.sp
    ),
    titleLarge = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp,
        lineHeight = 28.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    labelLarge = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    )
)

@Composable
fun FitLifeTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = Typography,
        content = content
    )
}