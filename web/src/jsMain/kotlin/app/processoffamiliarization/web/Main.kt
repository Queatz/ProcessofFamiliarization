package app.processoffamiliarization.web

import androidx.compose.runtime.Composable
import app.processoffamiliarization.sayHello
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable

fun main() {
    renderComposable(rootElementId = "root") {
        Style(Styles)
        App()
    }
}

@Composable
fun App() {
    Div(attrs = { classes(Styles.appRoot) }) {
        Div(attrs = { classes(Styles.page) }) {
            H1(attrs = { classes(Styles.title) }) {
                Text("Process of Familiarization")
            }
            P(attrs = { classes(Styles.subtitle) }) {
                Text("Deep-familiarization sessions for phrases that need to stick.")
            }
            Div(attrs = { classes(Styles.card) }) {
                P {
                    Text(sayHello("Compose HTML"))
                }
            }
        }
    }
}
