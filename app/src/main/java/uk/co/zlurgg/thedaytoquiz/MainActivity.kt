package uk.co.zlurgg.thedaytoquiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import uk.co.zlurgg.thedaytoquiz.presentation.questions.QuestionsScreen
import uk.co.zlurgg.thedaytoquiz.ui.theme.TheDayToQuizTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TheDayToQuizTheme {
                QuestionsScreen()
            }
        }
    }
}