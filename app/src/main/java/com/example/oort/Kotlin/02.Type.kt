package com.example.myapplication.Kotlin


// 02. 자료형
// 정수형 → Long > Int > Short > Byte   - 표현할 수 있는 범위 순서
// 실수형 → Double > Float - 소수점 표현할 수 있음
// 문자 → Char - 문자는 문자 한 글자만 표현 가능
// 문자열 → String - 한 글자가 아니라 여러 자 표현 가능
// 논리형(참Ture/거짓False) → Boolean - 트루 또는 폴스만 가질 수 있다

//상자의 종류 두 가지 var/val

var number = 10

//변수 선언하는 방법(2)
// var/val 변수: 자료형 = 값
var number1: Int = 20
var hello1: String = "hello"
var point1: Double = 3.4

//자료형을 적어주는 것이 더 좋은 방법이다.

fun main(array: Array<String>){
    number = 20
    //number = 20.5

}

//변수 선언하는 방법(1)
//Variable/Value 변수명 = 값
// var/val 변수명 = 값

//변수 선언하는 방법(2)
// var/val 변수: 자료형 = 값

//자료형을 적어주는 것이 좋은 방법이다. 귀찮지만 나중에 더 편한 방법이다.

//Variable or Value?
// 1. 변하지는 않는 값이라면 Value
// 2. 변할지 안 변할지 진짜 모르겠다! → Value
//엄청 긴 코드로 인하여 무슨 값으로 들어있는지 모를 때, 내가 값을 바꾼 적이 있나 없나 모름
//그래서 값을 확인하기 위해서 value로 선언, 그리고 그때 가서 variable로 바꾸면 됨,