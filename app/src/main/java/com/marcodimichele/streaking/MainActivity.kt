package com.marcodimichele.streaking

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HabitScreen("Il mio Progetto StreaKing")
        }
    }
}

@Composable
fun HabitScreen(name: String) {
    var streak by remember { mutableStateOf(0) }
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = name, style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "🔥 $streak Giorni", style = MaterialTheme.typography.displayLarge)
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { streak = StreakManager.updateStreak(streak) }) {
            Text("Ho completato l'abitudine!")
        }
    }
}