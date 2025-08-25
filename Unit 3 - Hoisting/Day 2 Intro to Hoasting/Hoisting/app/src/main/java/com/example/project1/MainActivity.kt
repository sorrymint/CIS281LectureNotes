package com.example.project1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.project1.ui.theme.Project1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Project1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NameLayoutPreview()
                }
            }
        }
    }
}


@Composable
fun NameLayout() {
    var nameInput by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.padding(40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        EditNameField(
//            value = nameInput,
//            onValueChange = {nameInput = it},
            modifier = Modifier.padding(bottom = 32.dp).fillMaxWidth()
        )
        //I want to output the nameInput here
        Text(
            text = "Hi My Name is $nameInput",
            style = MaterialTheme.typography.displaySmall
        )
        Spacer(modifier = Modifier.height(150.dp))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditNameField(
    modifier: Modifier = Modifier,
//    value: String,
//    onValueChange: (String) -> Unit,
) {
    var nameInput by remember { mutableStateOf("") }
    //move to layout
    TextField(
        //change to generic
//        value = value,
//        onValueChange = onValueChange,
        value = nameInput,
        onValueChange = {nameInput = it},
        modifier = modifier,
        label = { Text("Name") }
    )
}

//https://developer.android.com/codelabs/basic-android-kotlin-compose-using-state?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-2-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-using-state#7

@Preview(showBackground = true)
@Composable
fun NameLayoutPreview() {
    Project1Theme {
        NameLayout()
    }
}
