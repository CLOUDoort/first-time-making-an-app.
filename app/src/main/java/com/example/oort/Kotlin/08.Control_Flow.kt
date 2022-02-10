package com.example.myapplication.Kotlin


//08. 제어 흐름
//아래와 같은 메인문에서는 위에서부터 아래로 순차적으로 흐름
//제어흐름은 그러한 흐름을 제어하기 위한 문법을 말한다.

// - if, else
//a가 b보다 크다면 if문이 실행, 그러나 a가 b보다 작다면 else문이 실행된다.
// = 1실헹 이후 3실행 or 2실행 이후 3실행
//조건의 결과값이 True나 False 둘 중에 하나가 나와야 한다.

fun main(array: Array<String>){
    val a: Int = 5
    val b: Int = 10

    // if/else 사용하는 방법(1)
    if (a>b) {
        println("a가 b보다 크다")
    } else {
        println("a가 b보다 작다")
    }
    // if/else 사용하는 방법(2)(else를 안적는 것, if만 사용가능
    // else만 사용은 불가능, 따라서 a가 b보다 클 경우에만 실행됨)
    if (a>b) {
        println("a가 b보다 크다")
    }
    //if/else/else if 사용하는 방법
    if (a>b) {
        println("a가 b보다 크다")
    }else if (a<b){
        println("a가 b보다 작다")
    }else{
        println("a와 b는 같다")
    }

    //값을 리턴하는 if 사용방법
    val max = if(a>b){
        a
    }else{
        b
    }
    //값을 리턴하는 if 사용방법(2) 이렇게 간단히 표시 가능, 처음에는 중괄호 사용하여 구분하는 것이 이해하기 편함
    val max1 = if(a>b) a else b

    println()
    println(max)
 }