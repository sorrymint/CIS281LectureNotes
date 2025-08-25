package com.example.clockexampleinclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.clockexampleinclass.ui.theme.ClockExampleInClassTheme
import java.text.SimpleDateFormat
import java.util.Locale

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClockExampleInClassTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    TimeDisplay()
                }
            }
        }
    }
}

@Composable
fun Clock( modifier: Modifier = Modifier) {

    var currentTime by remember{ mutableStateOf(System.currentTimeMillis())};
    println(currentTime)
    Column (){
        Image(
            painter = painterResource(id = R.drawable.clock),
            contentDescription = "clock"
        )
        Text(
            text = SimpleDateFormat("hh:mm:ss", Locale.getDefault()).format(currentTime)
        )
        Button(
            onClick = {
                currentTime = System.currentTimeMillis()
                print(currentTime)
            }
        ){
            Text(stringResource(R.string.update_time_button))
        }
    }

}

@Preview(showBackground = true)
@Composable
fun TimeDisplay() {
    ClockExampleInClassTheme {
        Clock()
    }
}