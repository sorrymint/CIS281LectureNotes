package com.example.introtoviewmodelinclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.introtoviewmodelinclass.ui.theme.IntroToViewModelInClassTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntroToViewModelInClassTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen(lightSwitchViewModel: LightSwitchViewModel = viewModel()) {
    val screenState by lightSwitchViewModel.screenState.collectAsState()
    val isLightOn = screenState.isLightOn
    val backgroundColor = if (isLightOn) Color.White else Color.Black

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = backgroundColor),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = { lightSwitchViewModel.toggleLightSwitch() }) {
            Text("Toggle Light Switch")
        }
    }
}


@Composable
@Preview
fun MainScreenPreview(){
    MainScreen()
}




