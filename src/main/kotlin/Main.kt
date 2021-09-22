import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        var text by remember { mutableStateOf("edit here") }
        BasicTextField(text, { text = it })
    }
}