package com.example.dogrescue.data

import com.example.dogrescue.R
import com.example.dogrescue.model.Dog

object DataSource {
    val dogs = listOf(
        Dog(R.string.labrador, 2, R.drawable.labrador),
        Dog(R.string.german_shepherd, 2, R.drawable.germanshepherd),
        Dog(R.string.beagle, 2, R.drawable.beagle),
        Dog(R.string.poodle, 2, R.drawable.poodle),
    )
}