package com.example.fitlifespa.ui.screens.progress

@Composable
fun ProgressScreen() {
    val viewModel: ProgressViewModel = viewModel()
    val state by viewModel.uiState.collectAsState()

    Column(modifier = Modifier.fillMaxSize()) {
        // Progress Header
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
                    "Tu Progreso",
                    style = MaterialTheme.typography.titleLarge,
                    color = FitLifeColors.Black
                )
                Text(
                    "Evolución de tus métricas",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }

        // Progress Metrics
        LazyColumn(modifier = Modifier.padding(16.dp)) {
            items(state.progressData) { progress ->
                ProgressCard(progress)
            }
        }

        // Add Progress Button
        FloatingActionButton(
            onClick = { /* Navegar a agregar progreso */ },
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.End),
            containerColor = FitLifeColors.Yellow,
            contentColor = FitLifeColors.Black
        ) {
            Icon(Icons.Default.Add, "Agregar Progreso")
        }
    }
}