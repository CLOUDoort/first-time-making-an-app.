package com.example.myapplication.Kotlin

// class부터 interface강의까지 매우 중요한 내용
// oop의 가장 중요한 기능

// 함수 기능 내용이 비슷할 때, 상속으로 바꾸는 것이 좋겠지만
// 사람들과의 협업을 위해 인터페이스를 사용해야 할 때가 있다.
// 인터페이스에서 구현이 된 함수는 클래스에서 구현할 필요가 없다.


// 28. 인터페이스
// - 인터페이스도 구현이 있는 함수를 만들 수 있다.
// - 인터페이스에 구현이 된 함수는 그 인터페이스를 구현하는 클래스에서 그 함수를 구현할 필요가 없다.
// 인터페이스 내에 있는 함수는 구현해도 되고 안 해도 된다. 구현하지 않았다면 그 클래스 내에서 무조건 구현해야 한다.


fun main(args: Array<String>) {
    val student__ = Student__()
    student__.sleep()


}


interface Person__ {
    fun eat() {
        println("먹는다.")
    }

    fun sleep() {
        println("잔다.")
    }

    abstract fun study()
    // abstract는 구현해야 하는 클래스에서 반드시 구현해야 한다는 의미를 가짐

}

class Student__ : Person__ {
    override fun study() {
    }
}

class Teacher__ : Person__ {
    override fun study() {

    }
}