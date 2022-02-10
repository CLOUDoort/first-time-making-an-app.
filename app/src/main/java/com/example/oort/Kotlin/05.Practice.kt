package com.example.myapplication.Kotlin

//아주 기본적 함수 형식
fun plusThree(first: Int, second: Int, third: Int): Int {
    return first+second+third
}

//그러나 더 줄일 수 있다,
//val result = first+second+third
//    return result
//=return first+second+three

//마이너스를 사용한 함수식, 함수를 더 간단히 표현

fun minusThree(first: Int, second: Int, third: Int)= first-second-third

//곱하기를 사용한 함수식, 디폴트 값을 갖는 방식으로 표현

fun multiplyThree(first: Int=1, second: Int=1, third: Int=1): Int{
    return first * second * third
}

//내부함수
//함수 안에 함수가 있다!
//자주 사용되지는 않지만 알아두면 나중에 바로 사용가능하다
//first 또는 second의 위치를 알고 싶으면 컨트롤 키 누른 상태에서 키워드 누르면 위치 찾아가짐
fun showMyPlus(first: Int, second: Int): Int {
    println(first)
    println(second)

    fun plus(first: Int, second: Int): Int {
        return first+second
    }
    return plus(first, second)
}



fun main(array: Array<String>){
    val result= plusThree(1,2,3)
    println(result)

    val result2= minusThree(10,1,2)
    println(result2)

    val result3 = multiplyThree(2,2,2)
    println(result3)

    val result4 = multiplyThree()
    println(result4)

    println()

    val result5 = showMyPlus(4,5)
    println(result5)

}

