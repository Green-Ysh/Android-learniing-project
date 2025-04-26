package com.example.composeprj

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import com.example.composeprj.ui.theme.ComposePrjTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposePrjTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    MainRunning(modifier = Modifier.fillMaxSize())
                }
            }
        }
    }
}

@Composable
fun LeftTopBox(title: String, desc: String,color: Color,modifier: Modifier){
    Column(horizontalAlignment = Alignment.CenterHorizontally,verticalArrangement =  Arrangement.Center, modifier = modifier.background(color).padding(16.dp)) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = desc,
            textAlign = TextAlign.Justify
        )
    }
}
@Composable
fun RightTopBox(title: String, desc: String,color: Color,modifier: Modifier){
    Column(horizontalAlignment = Alignment.CenterHorizontally,verticalArrangement =  Arrangement.Center, modifier = modifier.background(color).padding(16.dp)) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = desc,
            textAlign = TextAlign.Justify
        )
    }
}
@Composable
fun LeftBottomBox(title: String, desc: String,color: Color,modifier: Modifier){
    Column(horizontalAlignment = Alignment.CenterHorizontally,verticalArrangement =  Arrangement.Center, modifier = modifier.background(color).padding(16.dp))  {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = desc,
            textAlign = TextAlign.Justify
        )
    }
}
@Composable
fun RightBottomBox(title: String, desc: String,color: Color,modifier: Modifier){
    Column(horizontalAlignment = Alignment.CenterHorizontally,verticalArrangement =  Arrangement.Center, modifier = modifier.background(color).padding(16.dp))  {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = desc,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun MainRunning(modifier: Modifier = Modifier){
    Column(modifier = modifier,verticalArrangement = Arrangement.SpaceAround) {
        Row(modifier.weight(1f).fillMaxSize(),horizontalArrangement = Arrangement.SpaceAround) {
            LeftTopBox(
                "Text composable",
                "Displays text and follows the recommended Material Design guidelines.",
                color= Color(0xFFEADDFF),
                Modifier.weight(1f).fillMaxSize()
            )
            RightTopBox(
                "Image composable",
                "Creates a composable that lays out and draws a given Painter class object.",
                color= Color(0xFFD0BCFF),
                modifier.weight(1f).fillMaxSize()
            )
        }
        Row(modifier.weight(1f).fillMaxSize(),horizontalArrangement = Arrangement.SpaceAround) {
            LeftBottomBox(
                "Row composable",
                "A layout composable that places its children in a horizontal sequence.",
                color= Color(0xFFB69DF8),
                Modifier.weight(1f).fillMaxSize()
            )
            RightBottomBox(
                "Column composable",
                "A layout composable that places its children in a vertical sequence.",
                color= Color(0xFFF6EDFF),
                Modifier.weight(1f).fillMaxSize()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposePrjTheme {
        MainRunning()
    }
}