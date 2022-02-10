package com.example.myapplication.Kotlin

var a = 1+2+3+4+5 // 연산의 결과값을 변수에 넣어줄 수 있다.
var b = "1"
var c = b.toInt()   // b를 Int로 바꾸겠다는 의미
var d = b.toFloat()

var e = "John"
var f = "My name is $e Nice to meet you"

//Null
// - 존재 하지 않는다

//var abe : Int = null //Null을 받을 수 없는  Int형이기 때문에 Null을 받을 수 없다
var abc1 : Int? = null //?를 붙여주면 null을 받을 수 있는 자료형이 된다.
//"null" (x) 문자열 null은 절대 아니다
var abc2: Double? = null

var g = a+3 // 이러한 변수값도 가능


fun main(array: Array<String>){
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(abc1)
    println(g)
}

