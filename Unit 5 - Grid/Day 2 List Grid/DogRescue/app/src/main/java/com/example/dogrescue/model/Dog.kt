package com.example.dogrescue.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Dog (
    @StringRes val name: Int,
    val age: Int,
    @DrawableRes val imageRes: Int
)