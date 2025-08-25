package com.example.introtoviewmodelinclass

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.MutableStateFlow

class LightSwitchViewModel : ViewModel() {
    private val _screenState = MutableStateFlow(ScreenState(true))
    val screenState: StateFlow<ScreenState> = _screenState.asStateFlow()

    fun toggleLightSwitch() {
        val currentState = _screenState.value
        _screenState.value = currentState.copy(isLightOn = !currentState.isLightOn)
    }
}


