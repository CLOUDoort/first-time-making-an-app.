package com.example.myapplication.Kotlin

// 10. 제어흐름

//When
//if와 같이 정말 많이 사용됨
//if안의 조건문은 결과가 반드시 True나 False 둘중에 하나가 나와야 하지만  when은 아니다

fun main(args: Array<String>){

    val value : Int = 3

    //코틀린에서는 중괄호 안의 내용이 작을경우 생략가능하다
    // 1 ->{
    //            println("value is 1")
    //        }
    //1 -> println("value is 1")
    when(value){
        1 -> println("value is 1")
        2 -> println("value is 2")
        3 -> println("value is 3")
        else -> println("I do not know value")
    }

    //위의 when 구문을 if/else 구문으로 바꾸면 아래와 같다.
    //같은 내용이라면 위의 when문으로 정리하는 것이 더 깔끔
    if (value == 1) println("value is 1")
    else if (value == 2) println("value is 2")
    else if (value == 3) println("value is 3")
    else println("I do not know value")

    //값을 리턴하는 when구문
    val value2 = when(value){
        1->10
        2->20
        3->30
        else->100

    }
    println(value2)


}








