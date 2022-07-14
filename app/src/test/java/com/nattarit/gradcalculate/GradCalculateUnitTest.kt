package com.nattarit.gradcalculate

import org.amshove.kluent.shouldBeEqualTo
import org.junit.Before
import org.junit.Test

class GradCalculateUnitTest {
    lateinit var outputCalculation: OutputCalculation
    @Before
    fun setUp() {
        outputCalculation = OutputCalculation()
    }
    @Test
    fun `grad is fail`() {
        val output = outputCalculation.getOutput(30)
        output shouldBeEqualTo 30
    }

    @Test
    fun `grad is fail and not increase grad`() {
        val output = outputCalculation.getOutput(39)
        output shouldBeEqualTo 39
    }

    @Test
    fun `increase grad`() {
        val output = outputCalculation.getOutput(78)
        output shouldBeEqualTo 80
    }

    @Test
    fun `grad is same input`() {
        val output = outputCalculation.getOutput(76)
        output shouldBeEqualTo 76
    }
}