package com.example.myapplication.Kotlin


fun main(array: Array<String>) {

    val point: Int = 80

    when (point) {
        in 80..100 -> println("A")
        in 70..79 -> println("B")
        in 60..69 -> println("C")
        else -> println("F")
    }

    val value: Int = 81
    fun plus1(a: Int, b: Int): Int = a + b
    val result = plus1(8,1)
    println(plus1(8,1))



}


// 1번 문제
// List를 두 개 만든다
// 첫 번째 List에는 0 부터 9까지 값을 넣는다 (반복문 사용)
// 두 번째 List에는 첫 번째 List의 값을 하나씩 확인한 후 짝수면 True 홀수면 false를 넣어준다

// 2번 문제
// 학점을 구하자
// 80-90 -> A
// 70-80 -> B
// 60-70 -> C
// 나머지 F

// 3번 문제
// 전달 받은 숫자의 각 자리 수의 합을 구하자
// 조건: 전달받은 숫자는 무조건 두 자리 숫자이다.

// 4번 문제
// 구구단을 출력하자

