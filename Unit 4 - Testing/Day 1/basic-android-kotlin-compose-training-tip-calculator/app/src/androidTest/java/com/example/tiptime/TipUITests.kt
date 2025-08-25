/*
 * Copyright (C) 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.tiptime

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.assert
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.example.tiptime.ui.theme.TipTimeTheme
import org.junit.Rule
import org.junit.Test
import java.text.NumberFormat

class TipUITests {

    @get:Rule
    val composeTestRule = createComposeRule()





    @Test
    fun calculate_10_bill_25_percent_tip() {
        composeTestRule.setContent {
            TipTimeTheme {
                Surface (modifier = Modifier.fillMaxSize()){
                    TipTimeScreen()
                }
            }
        }
        composeTestRule.onNodeWithText("Bill Amount").performTextInput("10")
        composeTestRule
            .onNodeWithText("Tip (%)")
            .performTextInput("25")
        val expectedTip = NumberFormat.getCurrencyInstance().format(2.50)
        composeTestRule.onNodeWithText("Tip Amount: $expectedTip")
            .assertIsDisplayed()
    }

    @Test
    fun calc_20_percent_tip_round(){
        composeTestRule.setContent {
            TipTimeTheme {
                Surface {
                    TipTimeScreen()
                }
            }
        }

        composeTestRule.onNodeWithText("Bill Amount").performTextInput("10")
        composeTestRule.onNodeWithText("Tip (%)").performTextInput("22")
        composeTestRule.onNodeWithTag("round").performClick()
        val expectedTip = NumberFormat.getCurrencyInstance().format(3)
        composeTestRule.onNodeWithText("Tip Amount: $expectedTip")
            .assertIsDisplayed()
    }


    @Test
    fun input_bill_amount_20(){
        composeTestRule.setContent {
            TipTimeTheme {
                Surface (modifier = Modifier.fillMaxSize()){
                    TipTimeScreen()
                }
            }
        }
        val testVal = "$20.00"

        composeTestRule
            .onNodeWithText("Bill Amount")
            .performTextInput(testVal)

        composeTestRule
            .onNodeWithText("Bill Amount")
            .assert(hasText(testVal, ignoreCase = true))
    }

    @Test
    fun input_tip_amount_20(){
        composeTestRule.setContent {
            TipTimeTheme {
                Surface (modifier = Modifier.fillMaxSize()){
                    TipTimeScreen()
                }
            }
        }
        val testVal = "2"

        composeTestRule
            .onNodeWithText("Tip (%)")
            .performTextInput(testVal)

        composeTestRule
            .onNodeWithText("Tip (%)")
            .assert(hasText(testVal, ignoreCase = true))
    }
}
