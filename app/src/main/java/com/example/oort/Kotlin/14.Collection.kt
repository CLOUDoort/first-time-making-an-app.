package com.example.myapplication.Kotlin

// 14. Collection
// Immutable Colletion(변경불가능)과 Mutable Collection(변경가능)이 있다
//  -> list, set, map


fun main(args: Array<String>) {

//// 값을 변경할 수 없는 Collection -> Immutable Colletion(변경불가능)

    // List (중복을 허용한다)
    val numberList = listOf<Int>(1, 2, 3, 3)
    println(numberList)
    println(numberList.get(0))
    println(numberList[0])


    // Set (집합, 동일값, 중복을 허용하지 않음, set의 가장 큰 특징)
    // ->중복을 허용하지 않음
    // ->순서가 없다!! 때문에 인덱스도 존재하지 않는다
    val numberSet = setOf<Int>(1, 2, 3, 3, 3)
    println()
    numberSet.forEach {
        println(it)
    }

    // Map -> Key, value  방식으로 관리한다
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println()
    println(numberMap.get("one"))


    //Mutable Collection(변경가능)
    val mNumberList = mutableListOf<Int>(1, 2, 3)
    mNumberList.add(3, 4)
    println()
    println(mNumberList)

    // Set은 순서가 없기 떄문에 index 불필요, 그냥 넣고 싶은 숫자만 기입
    val mNumberSet = mutableSetOf<Int>(1, 2, 3, 4, 4, 4)
    mNumberSet.add(20)
    println(mNumberSet)

    val mNumberMap = mutableMapOf<String, Int>("one" to 1)
    mNumberMap.put("two", 2)
    println(mNumberMap)

}