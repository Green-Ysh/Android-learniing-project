package com.example.codelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.codelab.ui.theme.CodelabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CodelabTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Greeting(
                        modifier = Modifier
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier) {
    Column(verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier.fillMaxSize().background(Color(0xFFc6e6cc))) {
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier.padding(bottom = 240.dp)) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = null,
                modifier = modifier
                    .background(color = Color(0xFF002a3c))
                    .width(100.dp)
                    .height(100.dp)
            )
            Text(
                text = "Jennifer Doe",
                fontSize = 40.sp,
                modifier = modifier.padding(top = 10.dp, bottom = 5.dp)

            )
            Text(
                text = "Android Developer Extraordinaire",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF00723c),
            )
        }


        Column(horizontalAlignment = Alignment.Start, modifier = modifier.padding(bottom = 60.dp)) {
            Row {
                Icon(Icons.Rounded.Call, contentDescription = "Localized description", tint = Color(0xFF006833))
                Text(
                    text = "+11 (123) 444 555 666",
                    modifier = modifier.padding(start = 20.dp)
                    )
            }
            Row(modifier = modifier.padding(top = 20.dp, bottom = 20.dp)) {
                Icon(Icons.Rounded.Share, contentDescription = "Localized description", tint = Color(0xFF006833))
                Text(
                    text = "@AndroidDev",
                    modifier = modifier.padding(start = 20.dp)
                    )
            }
            Row {
                Icon(Icons.Rounded.Email, contentDescription = "Localized description", tint = Color(0xFF006833))
                Text(
                    text = "linux.ysh@gmail.com",
                    modifier = modifier.padding(start = 20.dp)
                    )
            }
        }
    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CodelabTheme {
        Greeting(modifier = Modifier)
    }
}