package com.example.myapplication.Kotlin

// 16. Iterable 반복문
// 정말 많이 사용함, 숙달 필요
// 정말 중요함

fun main(array: Array<String>) {

    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // 반복하는 방법(1)
    // 원하는 값을 도출하기 위해 사용
    for (item in a) {
        if (item == 5) {
            println("item is five")
        } else {
            println("item is not five")
        }
    }
    println()

    // 반복하는 방법(2)
    // 값뿐만 아니라 index도 알고싶을 경우
    for ((index, item) in a.withIndex()) {
        println("index : " + index + "value: " + item)
        // 문자열 + Int(정수) = 문자열
        // 문자열 + 아무 타입 = 문자열
    }
    println()

    // 반복하는 방법(3) -> 람다라는 것을 알아둘 것
    a.forEach {
        println(it)
    }
    println()
    // 반복하는 방법(4)
    a.forEach { item ->
        println(item)
    }
    println()

    // 반복하는 방법(5), (2)와 동일, 방법(2)보다 명시적이고 직관적임
    // 람다라는 것을 인지할 것
    a.forEachIndexed { index, item ->
        println("index : " + index + "value: " + item)
    }

    // 반복하는 방법(6)/ index만을 순회하는 for문
    println(a.size)
    println()
    for (i in 0 until a.size) {
        //until은 마지막을 포함하지 않는다
        // 0부터 8까지 이다(굉장히 중요)
        println(a.get(i))
    }
    println()

    // 반복하는 방법(7)
    // 2씩 증가, 0,2,4,6,8,.. 이런식으로
    for (i in 0 until a.size step (2)) {
        println(a[i])
    }
    println()
    // 반복하는 방법(8)
    for (i in a.size - 1 downTo (0)) {
        //8부터 0까지 반복
        println(a[i])
    }
    println()

    // 반복하는 방법(9)
    for (i in a.size - 1 downTo (0) step (2)) {
        println(a[i])
    }
    println()

    // 반복하는 방법(10)
    for (i in 0..10) {
        println(i)
    }
    //-> ..은 마지막을 포함한다, until은 마지막을 포함하지 않음

    //until과 .. 의 차이점, 그리고 downto와 step의 기능 기억할 것

    println()
    // 반복하는 방법(11)
    var b: Int = 0 // ->1 ->2 ->3 ->4
    var c: Int = 4

    while (b < c) {
        b++ // while문을 정지시키기 위한 코드
        println("b")
    }
    //while 의 조건문이 true라면 그 안의 식이 무한반복된다.
    //때문에 그 조건을 깰 수 있는 코드가 반드시 들어가야 한다.

    var d: Int = 0
    var e: Int = 4

    println()
    // 반복하는 방법(12)
    do {
        println("hello")
        d++
    } while (d < e)

    // while의 조건이 false일지라도 do를 통해 한 번은 결과값이 나오게 한다.

}
