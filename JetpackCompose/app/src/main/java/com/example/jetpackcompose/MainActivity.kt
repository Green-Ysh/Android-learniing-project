package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    GreetingImage(
                        title = stringResource(R.string.title),
                        firstBody = stringResource(R.string.firstBody),
                        secondbody = stringResource(R.string.secondbody)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(title: String,firstBody: String, secondbody: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)
        )
        Text(
            text = firstBody,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(start = 16.dp, end = 16.dp),
        )
        Text(
            text = secondbody,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(16.dp),
        )
    }
}

@Composable
fun GreetingImage(title: String, firstBody: String, secondbody: String, modifier: Modifier = Modifier) {
    Column {
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
        )
        GreetingText(title, firstBody, secondbody, modifier = Modifier)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTheme {
        GreetingImage(
            title = stringResource(R.string.title),
            firstBody = stringResource(R.string.firstBody),
            secondbody = stringResource(R.string.secondbody)
        )
    }
}