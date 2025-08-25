package com.example.counter.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text

import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.counter.CounterViewModel

@Composable
fun CounterScreen(
    modifier: Modifier = Modifier,
    viewModel: CounterViewModel = viewModel()
) {
    val count by viewModel.count.collectAsState()

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Count: $count", modifier = Modifier.padding(bottom = 24.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(onClick = { viewModel.decrement() }) {
                Text("-")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Text(count.toString())
            Spacer(modifier = Modifier.width(16.dp))
            Button(onClick = { viewModel.increment() }) {
                Text("+")
            }
        }
    }
}

@Preview
@Composable
fun PreviewContent() {
    Surface(modifier = Modifier.fillMaxSize()) {
        CounterScreen()
    }
}



