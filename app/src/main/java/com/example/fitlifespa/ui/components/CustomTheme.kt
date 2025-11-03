package com.example.fitlifespa.ui.components

@Composable
fun FitLifeTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = ColorScheme(
            primary = FitLifeColors.Yellow,
            onPrimary = FitLifeColors.Black,
            background = FitLifeColors.White,
            onBackground = FitLifeColors.Black,
            surface = FitLifeColors.White,
            onSurface = FitLifeColors.Black
        ),
        typography = Typography(),
        content = content
    )
}