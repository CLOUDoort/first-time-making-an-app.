package com.example.myapplication.Kotlin


//Array를 만들때는 타입을 적어주는 것이 좋고
//Array를 만드는 방법(3)처럼 타입을 명시하는 것이 더 좋은 방법이다
//개발은 명시적인 표현이 제일 좋다


fun main(array: Array<String>) {

    val array = arrayOf<Int>(1, 2, 3)

    // get, set
    val number = array.get(0)
    println(number)
//    val number1 = array.get(100) // 인덱스에 주의해야 한다, 오류발생, array의 바운즈 넘지 않게 주의


    array.set(0, 100)
    val number2 = array.get(0)
    println(number2)

    array.set(100, 100)
    //Array의 Bounds
    // - 처음 만들때 결정된다, 변경하기 힘듬, 처음부터 생각하고 사이즈 결정해야 한다

    //Array를 만드는 방법(3)/ 이 방식으로 사용하는 것이 좋다, 훨씬 명시적이다
    //char는 '', string은 "" 사용해야 함
    val a1 = intArrayOf(1, 2, 3)
    val a2 = charArrayOf('A', 'b')
    val a3 = doubleArrayOf(1.2, 100.345)
    val a4 = booleanArrayOf(true, false, true)

    //Array를 만드는 방법(4), 어려운 방법, 이해하기 힘드니 알고만 있자
    // lambda를 활용한 방법, 필수는 아님, 알아두면 좋은 정도가 끝
    //index가  0~9의 사이즈를 가진 배열을 의미
    var a5 = Array(size = 10, { 0 })
    //index 0~9 까지 전부 0만 들어감
    var a6 = Array(size = 5, { 1;2;3;4;5 })


}