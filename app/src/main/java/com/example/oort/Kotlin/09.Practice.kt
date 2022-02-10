package com.example.myapplication.Kotlin

fun main(args: Array<String>) {

    val a: Int? = null
    val b: Int = 10
    val c: Int = 100


    if (a == null) {
        println("a is null")
    } else {
        println("a is not null")
    }

    if (b + c == 110) {
        println("b plus c is 110 ")
    } else {
        println("b plus c is not 110")
    }


    // 엘비스 연산자 ?:
    // 익숙해지면 쓸 곳이 많다. null에 잘 대응할 수 있는 능력을 기르는 방향
    //코틀린의 특징인 null safe 특징이 잘 드러난다.
    //number가 null일 경우에 10이 들어가서 number2 값이 10이 되고
    // null이 아니라면 number 값이 number2가 된다
    val number: Int? = null
    val number2 = number ?: 10
    println()
    println(number2)

    //값을 리턴하는 if

    val num1 : Int = 10
    val num2 : Int = 20

    val max = if(num1>num2){
        num1
    }else if (num1 == num2){
        num2
    }else{
        100
    }

        //val max = if(num1>num2){
    //        num1
    //    }else if (num1 == num2){
    //        num2
        //이 두가지만 쓰면 에러가 뜸, 왜냐면 리턴되는 값이 없기 때문
            //따라서 else를 써줌으로써 값을 리턴한다.

}