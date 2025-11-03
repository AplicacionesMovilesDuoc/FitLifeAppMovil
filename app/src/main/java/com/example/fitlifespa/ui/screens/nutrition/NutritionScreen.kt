package com.example.fitlifespa.ui.screens.nutrition

@Composable
fun NutritionScreen() {
    val viewModel: NutritionViewModel = viewModel()
    val state by viewModel.uiState.collectAsState()

    Column(modifier = Modifier.fillMaxSize()) {
        // Nutrition Header
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = FitLifeColors.Yellow
            )
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    "Plan Nutricional",
                    style = MaterialTheme.typography.titleLarge,
                    color = FitLifeColors.Black
                )
                Text(
                    "Recomendaciones personalizadas",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }

        // Nutrition Cards
        LazyColumn(modifier = Modifier.padding(16.dp)) {
            items(state.nutritionPlans) { plan ->
                NutritionPlanCard(plan)
            }
        }
    }
}