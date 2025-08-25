package com.example.introtoviewmodel


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class SwitchViewModel(): ViewModel() {

    var backgroundColor by mutableStateOf(Color.Black)
        private set;

    fun changeBackgroundColor(){
        backgroundColor = Color.White;
    }
}