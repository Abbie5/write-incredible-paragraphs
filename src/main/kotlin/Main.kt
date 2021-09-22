import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.*
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        EditableText("edit here!")
    }
}

@Composable
fun EditableText(value: String = "") {
    var text by remember { mutableStateOf(value) }
    BasicTextField(text, { text = it })
}