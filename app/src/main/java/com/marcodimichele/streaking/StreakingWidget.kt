package com.marcodimichele.streaking

import android.content.Context
import androidx.glance.GlanceId
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.text.Text
import androidx.glance.layout.*
import androidx.compose.ui.unit.dp
import androidx.glance.GlanceModifier
import androidx.glance.background.ColorProvider
import androidx.graphics.drawable.toDrawable
import androidx.glance.unit.ColorProvider
import androidx.compose.ui.graphics.Color

class StreakingWidget : GlanceAppWidget() {
    override suspend fun provideContent(context: Context, id: GlanceId) {
        // Here we define the UI of the widget on the Home Screen
        provideContent {
            Column(
                modifier = GlanceModifier
                    .fillMaxSize()
                    .padding(8.dp),
                horizontalAlignment = Alignment.Horizontal.CenterHorizontally,
                verticalAlignment = Alignment.Vertical.CenterVertically
            ) {
                Text(text = "Current Streak", style = androidx.glance.text.TextStyle(color = ColorProvider(Color.White)))
                // In a real scenario, we would fetch the data from a database here
                Text(text = "🔥 5 Days", style = androidx.glance.text.TextStyle(color = ColorProvider(Color.Yellow)))
            }
        }
    }
}