package com.example.myapplication.Kotlin

// 11. 제어흐름 실습
//when은 다양한 용도로 사용 가능
//도움이 많이 됨
//조건식이 true나 false를 리턴한다면 어떤 식도 사용가능하다

fun main(args: Array<String>){

    val value : Int? = null

    when(value){
       null -> println("value is null")
        else -> println("value is not null")
    }

    // value2 값이 나올 수 있는 모든 상황에 대응해야 안전한 코드가 만들어진다
    val value2 : Boolean? = null

    //when 구문은 조건으로 가는 값의 모든 경우에 대응해주는 것이 좋다
    //value2는 null을 가질 수 있는 Boolean값이기 때문에 true, false, null 값을 모두 대응해야 한다
    when(value2){
        true -> println("")
        false -> println("")
        null -> println("")
    }

    //null 대신 else도 가능
    //값을 리턴하는 when 구문의 경우 반드시 값을 리턴해야 한다.
    val value3 = when(value2){
        true -> 1
        false -> 3
        null -> 4
    }

    val value4 : Int = 10


    //when의 다양한 조건식(1)
    //is는 타입을 물을 수 있는 연산자다
    //value4가 Int 타입이냐 묻는 것

    when(value4){
        is Int ->{
            println("value4 is Int")
        }
        else -> {
            println("value4 is not Int")
        }


    }

    //when의 다양한 조건식(2)
    val value5 : Int = 87
    when(value5){
        in 60 .. 70 ->{
            println("value is in 60-70")
        }
        in 70 .. 80 ->{
            println("value is in 70-80")
        }
        in 80 .. 90 -> {
            println("value is in 80-90")
        }
    }




}