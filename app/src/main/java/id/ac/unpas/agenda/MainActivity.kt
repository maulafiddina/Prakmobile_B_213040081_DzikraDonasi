package id.ac.unpas.agenda
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import id.ac.unpas.agenda.ui.screens.DonasiScreen
import id.ac.unpas.agenda.ui.theme.AgendaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AgendaTheme {
                // A surface container using the 'background' color from the theme
                DonasiScreen()
            }
        }
    }
}