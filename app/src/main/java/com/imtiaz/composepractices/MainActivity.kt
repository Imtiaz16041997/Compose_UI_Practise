package com.imtiaz.composepractices

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.imtiaz.composepractices.ui.theme.ComposeMeditationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeMeditationTheme {
                ByDefaultPreview()
            }
        }
    }
}

@Preview
@Composable
fun ByDefaultPreview(){
    HomeScreen()
}





