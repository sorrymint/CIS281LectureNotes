package com.example.wattconvert
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class WattCalculatorAppUITest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testEnterTextInVoltsField() {
        composeTestRule.setContent {
            WattCalculatorApp()
        }

        val testText = "5.0"

        composeTestRule
            .onNodeWithText("Enter Volts")
            .performTextInput(testText)

        composeTestRule
            .onNodeWithText("Enter Volts")
            .assert(hasText(testText, ignoreCase = true))
    }

    @Test
    fun testEnterTextInAmpField(){
        composeTestRule.setContent {
            WattCalculatorApp()
        }

        val testText = "2.0"

        composeTestRule
            .onNodeWithText("Enter Amps")
            .performTextInput(testText)

        composeTestRule
            .onNodeWithText("Enter Amps")
            .assert(hasText(testText, ignoreCase = true))
    }

    @Test
    fun testCalculateWatts() {
        composeTestRule.setContent {
            WattCalculatorApp()
        }

        val voltsText = "5.0"
        val ampsText = "2.0"
        val expectedWattsText = "Watts: 10.0"

        composeTestRule
            .onNodeWithText("Enter Volts")
            .performTextInput(voltsText)

        composeTestRule
            .onNodeWithText("Enter Amps")
            .performTextInput(ampsText)

        composeTestRule
            .onNodeWithText("Calculate Watts")
            .performClick()


        composeTestRule
            .onNodeWithText(expectedWattsText)
            .assertIsDisplayed()
    }
}
