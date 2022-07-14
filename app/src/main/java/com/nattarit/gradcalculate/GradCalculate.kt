package com.nattarit.gradcalculate

fun main() {
    // input = [30, 78, 69, 70, 80, 82, 90, 100, 59, 57]
    // output = [30, 80, 70, 70, 80, 82, 90, 100, 60, 57]
    val input = listOf<Int>(30, 78, 69, 70, 80, 82, 90, 100, 59, 57)
    val output = ArrayList<Int>()
    input.forEach {
        output.add(OutputCalculation().getOutput(it))
    }
    print(output)
}

