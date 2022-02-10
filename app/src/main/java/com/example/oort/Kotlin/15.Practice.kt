package com.example.myapplication.Kotlin

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main(array: Array<String>) {

    val a = mutableListOf<Int>(1, 2, 3)
    a.add(4)
    println(a)
    a.add(0, 100)
    println(a)
    a.set(0, 200)
    println(a)
    a.removeAt(1)
    println(a)

    val b = mutableSetOf<Int>(1, 2, 3)
    b.add(2)
    println(b)
    //2가 원래있으니까 중복허용하지 않는 set에서 2 추가 x
    b.remove(2)
    println(b)
    b.remove(100)
    println(b)
    //없는 값을 삭제하려해도 에러발생 x

    val c = mutableMapOf<String, Int>("one" to 1)
    c.put("two" , 2)
    println()
    println(c)
    c.replace("two", 3)
    println(c)
    println(c.keys)
    println(c.values)
    c.clear()
    println(c)

}