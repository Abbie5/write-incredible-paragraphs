package me.lunaluna

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

object LunaTheme {
    private val LightColors = lightColors(
        primary = Color.White,
        secondary = Color.White
    )

    @Composable
    operator fun invoke(content: @Composable () -> Unit) {
        MaterialTheme(colors = LightColors, typography = Typography(button = TextStyle(Color.Black), body1 = TextStyle(color = Color.Black)), content = content)
    }
}