package com.example.introtoviewmodel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.introtoviewmodel.ui.theme.IntroToViewModelTheme

class MainActivity : ComponentActivity() {
    // old way does not save state on refress
    private val viewModel = SwitchViewModel()



//    private val viewModel: SwitchViewModel by viewModels {
//        ViewModelProvider.NewInstanceFactory()
//    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            var viewModel = ViewModelProvider(this)[SwitchViewModel::class.java]
//            val viewModel = viewModels<SwitchViewModel> (
//                factory = object :ViewModelProvider.Factory{
//                    override fun <T: ViewModel> create(nodelClass : Class<T>): T{
//                        return SwitchViewModel(
//                            label = "On"
//                        ) as T
//                    }
//                }
//            )
            IntroToViewModelTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = viewModel.backgroundColor
                ) {
                    Button(onClick = {
                        viewModel.changeBackgroundColor()
                    }) {
                        Text("Turn on Light")
                    }
                }
            }
        }
    }
}