package com.example.wattconvert

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.wattconvert.ui.theme.WattConvertTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WattConvertTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    WattCalculatorApp()
                }
            }
        }
    }
}

@Composable
fun WattCalculatorApp() {
    var volts by remember { mutableStateOf("") }
    var amps by remember { mutableStateOf("") }
    var watts by remember { mutableStateOf(0.0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        NumberInput(
            labelText = "Enter Volts",
            input = volts,
            inputOnChanged = {
                    newVolts -> volts = newVolts
            }
        )
        Spacer(modifier = Modifier.height(16.dp))
        NumberInput(
            labelText = "Enter Amps",
            input = amps,
            inputOnChanged = {
                newAmp -> amps = newAmp
            }
        )

        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                watts = calculateWatts(volts = volts, amps = amps)
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Calculate Watts")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Watts: $watts",
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NumberInput(labelText:String, input: String, inputOnChanged: (String) -> Unit) {
    TextField(
        value = input,
        onValueChange = { value ->
            inputOnChanged(value)
        },
        label = { Text(labelText) },
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
    )
}

fun calculateWatts(volts: String, amps: String): Double {
    val voltsDouble = volts.toDoubleOrNull() ?: 0.0
    val ampsDouble = amps.toDoubleOrNull() ?: 0.0
    return voltsDouble * ampsDouble
}

@Preview(showBackground = true)
@Composable
fun PreviewWattCalculatorApp() {
    WattCalculatorApp()
}
