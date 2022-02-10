package com.example.myapplication.Kotlin

//12. 배열


//배열이 필요한 이유
// - 그룹(모음집)이 필요할 때
//쓰는 곳이 매우 많음
//숙달 필요
fun main(array: Array<String>) {

    //배열을 생성(만든다는 의미)하는 방법(1)
    //var number: Int = 1 이것은 변수를 선언하는 것, 생성과 특별히 다르지 않다
    var group1 = arrayOf<Int>(1, 2, 3, 4, 5)
    println(group1 is Array)

    //배열을 생성하는 방법(2) / 타입을 적지 않으면 아무 타입이나 가능
    //그러나 추천하지 않는 방법
    var group2 = arrayOf(1, 2, 3.5, "Hello")

    // Index 란
    // -> 순서(번째)
    // [1,2,3,4,5]
    // 0부터 시작, 배열의 0번째는 1, 1번째는 2 이런식
    // index 0 -> 1, index 1 -> 2

    //배열의 값을 꺼내는 방법(1)
    val test1 = group1.get(0)
    val test2 = group1.get(4)
    println(test1)
    println(test2)

    //배열의 값을 꺼내는 방법(2)
    val test3 = group1[0]
    println(test3)

    //배열의 값을 바꾸는 방법(1)
    //group1의 0번째 값을 100으로 바꿈
    group1.set(0, 100)
    println(group1[0])

    //배열의 값을 바꾸는 방법(2)
    group1[0] = 200
    println(group1[0])

}
