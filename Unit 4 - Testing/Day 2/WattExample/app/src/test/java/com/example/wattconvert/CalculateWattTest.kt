package com.example.wattconvert

import org.junit.Assert.assertEquals
import org.junit.Test

class CalculateWattTest {
    @Test
    fun testCalculateWatts() {
        // Test case 1: Valid input
        val result1 = calculateWatts("5.0", "2.0")
        assertEquals(10.0, result1, 0.001) // Expected result: 5.0 * 2.0 = 10.0

        // Test case 2: Invalid input ("" values)
        val result2 = calculateWatts("", "")
        assertEquals(0.0, result2, 0.001) // Expected result: 0.0 * 0.0 = 0.0

    }
}