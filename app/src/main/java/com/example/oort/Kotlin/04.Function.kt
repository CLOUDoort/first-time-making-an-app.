package com.example.myapplication.Kotlin


//04. Function 메소드 A, B, 실습
// -함수란
//      -어떤 input을 넣어주면 어떤 output이 나오는 것
//      - y= x+2


// - 함수를 선언하는 방법
// fun 함수명 (변수명: 타입, 변수명:타입 ... ) 반환형 {
//     함수 내용
//     return 반환값
// }
fun plus(first: Int, second: Int): Int {
    println(first)
    println(second)
    val result: Int = first + second
    println(result)
    return result
}

//= fun plusShort(first: Int, second: Int) = first + second
//위와 동일한 값을 가짐, 함수를 간단하게 표시시
//-디폴트 값(기본 값, 특별히 어떤 값을 넣어주지 않으면 이 값을 그대로 사용하겠다.)을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

//-반환값이 없는 함수 만들기(1), 모든 함수가 반환값을 return해야하는 것은 아니다
// unit은 아무것도 리턴하지 않겠다는 의미 내포, 색깔이 회색인
//이유는 생략이 가능하기 때문이다. main함수처럼 생략 가능
fun printPlus(first: Int, second: Int): Unit {
    val result: Int = first + second
    println(result)

}

//-반환값이 없는 함수 만들기(2) main함수처럼 생략 가능
fun printPlus2(first: Int, second: Int) {
    val result: Int = first + second
    println(result)
}

//-간단하게 함수를 선언하는 방법
fun plusShort(first: Int, second: Int) = first + second
//강사는 이렇게 함축하지 않고, 맨 위에 표시된 기본형 사용하는 것을 선호

//-가변인자를 갖는 함수 선언하는 방법, vararg= variable argument
//가변인자란 인자의 개수와 타입이 미리 정해져 있지 않다는 의미이다.
fun  plusMany(vararg numbers: Int){
    for (number in numbers){
        println(number) //numbers의 값을 하나하나 출력하기 위해
    }
}




fun main(array: Array<String>) {
    // 함수를 호출하는 방법
    val result = plus(5, 10)
    println(result)
    //인수를 명시적으로 전달하는 방법
    val result2 = plus(first = 20, second = 30)
    println(result2)

    val result3 = plus(second = 100, first = 10)
    println(result3)

    //디폴트 값을 갖는 함수 호출하기
    println() // -위의 값과 구분하기 위해 표시
    val result4 = plusFive(10, 20)
    println(result4)
    val result5 = plusFive(10)
    println(result5)

    println()
    printPlus(10, 20)

    println()
    val result6 = plusShort(50, 50)
    println(result6)

    println()
    plusMany(1,2,3)
    plusMany(100)
}


