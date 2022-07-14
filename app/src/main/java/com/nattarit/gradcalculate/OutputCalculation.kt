package com.nattarit.gradcalculate

class OutputCalculation {
    fun getOutput(input: Int): Int {
        var output = 0
        if (input < 40) {
            output = input
        } else {
            if (input % 5 == 0) {
                output = input
            } else {
                var maxOutput = input
                while (true) {
                    if (maxOutput % 5 != 0) {
                        maxOutput += 1
                    } else {
                        break
                    }
                }
                output = if (input + 3 > maxOutput) {
                    maxOutput
                } else {
                    input
                }
            }
        }
        return output
    }
}