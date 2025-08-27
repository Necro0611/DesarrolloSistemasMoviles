package com.example.articulocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.articulocompose.ui.theme.ArticuloComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArticuloComposeTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    ArticuloCompose()
                }
            }
        }
    }
}

@Composable
fun ArticuloCompose() {
    ElementosArticulo(
        _titulo = "Jetpack Compose tutorial",
        _subtitulo = "Jetpack Compose is a modern toolkit for building native Android UI. " +
                "Compose simplifies and accelerates UI development on Android with less code, " +
                "powerful tools, and intuitive Kotlin APIs.",
        _descripcion = "In this tutorial, you build a simple UI component with declarative functions. " +
                "You call Compose functions to say what elements you want and the Compose compiler " +
                "does the rest. Compose is built around Composable functions. These functions let " +
                "you define your app\\'s UI programmatically because they let you describe how it " +
                "should look and provide data dependencies, rather than focus on the process of the " +
                "UI\\'s construction, such as initializing an element and then attaching it to a " +
                "parent. To create a Composable function, you add the @Composable annotation to the " +
                "function name.",
        imagePainter = painterResource(R.drawable.bg_compose_background)
    )
}

@Composable
private fun ElementosArticulo(
    _titulo: String,
    _subtitulo: String,
    _descripcion: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        Image(painter = imagePainter, contentDescription = null)
        Text(
            text = _titulo,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = _subtitulo,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = _descripcion,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ArticuloComposeTheme {
        ArticuloCompose()
    }
}