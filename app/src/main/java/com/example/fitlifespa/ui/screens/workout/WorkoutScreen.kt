package com.example.fitlifespa.ui.screens.workout

@Composable
fun WorkoutScreen() {
    val viewModel: WorkoutViewModel = viewModel()
    val state by viewModel.uiState.collectAsState()

    Column(modifier = Modifier.fillMaxSize()) {
        // Header
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
                    "Tu Plan de Entrenamiento",
                    style = MaterialTheme.typography.titleLarge,
                    color = FitLifeColors.Black
                )
                Text(
                    "Actualizado hoy",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }

        // Workout List
        LazyColumn(modifier = Modifier.padding(16.dp)) {
            items(state.workoutPlans) { plan ->
                WorkoutPlanCard(plan)
            }
        }
    }
}