package com.example.cuadrantecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantecompose.ui.theme.CuadranteComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CuadranteComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CuadroComposeFun()
                }
            }
        }
    }
}

@Composable
fun CuadroComposeFun() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            ComposeInfo(
                titulo = "Text composable",
                descripcion = "Displays text and follows the recommended Material Design guidelines.\n",
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            ComposeInfo(
                titulo = "Image composable ",
                descripcion = "Creates a composable that lays out and draws a given Painter class object.\n",
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            ComposeInfo(
                titulo = "Row composable",
                descripcion = "A layout composable that places its children in a horizontal sequence.\n",
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            ComposeInfo(
                titulo = "Column composable",
                descripcion = "A layout composable that places its children in a vertical sequence.\n",
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}



@Composable
private fun ComposeInfo(
    titulo: String,
    descripcion: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = titulo,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = descripcion,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuadranteComposeTheme {
        CuadroComposeFun()
    }
}