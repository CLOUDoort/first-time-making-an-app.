package com.example.myapplication.Kotlin

import java.util.*

fun main(args: Array<String>) {
    /* This reads the input provided by user
         * using keyboard
         */
    /* This reads the input provided by user
         * using keyboard
         */
    val scan = Scanner(System.`in`)
    print("Enter first number: ")


    val num1: Int = scan.nextInt()

    print("Enter second number: ")
    val num2: Int = scan.nextInt()
    scan.close()

    val product = num1 * num2

    println("Output: $product")
}

// 자바 코드 코틀린으로 복붙하면 코드 자동변경 가능
// 그래서 복붙하면서 차이점을 알아두면 좋음