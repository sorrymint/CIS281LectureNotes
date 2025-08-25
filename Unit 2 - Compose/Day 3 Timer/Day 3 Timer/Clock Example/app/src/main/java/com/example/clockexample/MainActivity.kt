package com.example.clockexample
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TimeDisplay()
        }
    }
}

@Composable
fun Clock() {
    var currentTime by remember { mutableStateOf(System.currentTimeMillis()) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.clock),
            contentDescription = null,
            modifier = Modifier
                .size(200.dp)
                .clip(shape = MaterialTheme.shapes.medium),
            contentScale = ContentScale.Crop
        )
        Text(
            text = SimpleDateFormat("hh:mm:ss", Locale.getDefault()).format(currentTime),
            fontWeight = FontWeight.Bold
        )
        Button(
            onClick = {
                currentTime = System.currentTimeMillis()
            },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(stringResource(R.string.update_time))
        }
    }
}

@Preview
@Composable
fun TimeDisplay() {
    Clock()
}
