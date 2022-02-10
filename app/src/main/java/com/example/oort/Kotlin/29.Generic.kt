package com.example.myapplication.Kotlin

// 29. Generic(제너릭)
// 목적: 다양한 타입의 객체들을 다루는 메소드나 컬렉션
//       클래스에서 컴파일 시에 타입을 체크해주는 기능
// 간단히 타입을 체크하는 기능
// 제너릭은 만들기 어렵고 실제로 만들 일이 거의 없기 때문에 사용하는 방법과 목적만 숙지한다.

fun main(args: Array<String>) {
//fun main(args:Array<String>)에서 <String> 이 부분이 제너릭이다.

    // 제너릭을 사용하지 않은 경우
    // 자료형 변환을 해줘야 한다.
    val list1 = listOf(1, 2, 3, "가")
    val b: String = list1[2].toString() // 형변환(타입 변환)

    // 제너릭을 사용하는 경우 -> 타입이 안전하다. / .toString()과 같은 캐스팅 안 해도 되기 때문
    val list2 = listOf<String>("a", "b", "c")
    val c: String = list2[2] // String 이라는 것을 보장 받는다. <String>을 넣어줬기 때문

    // 강한 타입을 체크할 수 있다.
    val list3 = listOf(1, 2, 3, "가", "나", 3.0)
    // 이런 식이면 타입을 체크할 수 없다.
    val list4 = listOf<Int>(1, 2, 3) // 강한 타입 체크

    // 제너릭을 사용하지 않은 경우
    val list5 = listOf<Any>(1, 2, 3, "가") // -> 'Any' 라는 타입을 가지게 된다. 모든 것을 포함하는 타입
    // 부모: Any
    // 자식: String, Int, Float


}