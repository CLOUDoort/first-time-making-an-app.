package com.example.myapplication.Kotlin

// 전역, 지역변수
// 변수를 선언하는 위치에 따라서 변수에 접근할 수 있는 범위가 달라진다.
// 변수의 접근 범위
// 1. 전역 변수(어디에서나 접근 가능) ex) 변수 number100/ 종류가 하나
// 2. 지역 변수(해당 지역에서만 접근 가능) ex) 변수 name / 종류가 매우 다양
// 변수 설정할 떄 접근 범위 고려해야 함.
// 필요한 곳에서만 사용할 수 있도록 최소한으로 설정하는 것이 좋음
// 다시 강조, 우선 value로 설정하고 바꿀 일 있으면 variable로 변경하는 것이 좋음


var number100: Int = 10

fun main(args: Array<String>) {
    println(number100)

    val test = Test("홍길동")
    test.testFun()
    test.name
    println(number100)

}

class Test(var name: String) {
    // 변수 name에 접근할 수 있는 것은 두 가지가 있다

    fun testFun(){
        // 함수 안에서만 접근 가능한 변수 만들기 위해서 함수 안에 변수 선언하면 됨
        var birth: String = "2000/3/1"
        // 이 변수는 testFun 함수 안에서만 접근 가능
        name = "홍길동"
        number100 = 100
        // number100 변수는 여기서도 접근 가능
    }

    fun testFun2(){
        name
        // name은 접근 가능 그러나 birth는 불가능
    }
    // 클래스 안에 있는 함수는 클래스 내의 멤버변수에 접근할 수 있다

}