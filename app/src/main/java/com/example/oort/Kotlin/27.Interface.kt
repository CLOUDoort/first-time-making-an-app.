package com.example.myapplication.Kotlin

// 27. Interface
// 상속과 인터페이스는 엄청 중요한 개념

// - 인터페이스는 약속! -> 네가 이것을 구현하면 너도 이 타입이다!
// 상속과 비슷하지만 다른 기능
// 인터페이스는 물려받는 다는 의미가 아닌 구현한다는 의미
// 내용물을 채워준다는 뜻, 인터페이스가 가지고 있는 함수의 구체적인 기능을 만들어줘야 한다는 의믜
// 상속과 헷갈릴 수 있다.
// 인터페이스는 인터페이스와 구현 클래스의 기능이 많이 달라도 된다. 그럴 때는 인터페이스가 어울림
// 상속은 기능이 같거나, 조금 변화할 때 어울린다.
// 인터페이스는 약속일뿐이기 때문


// (매우 중요) -자식 클래스는 부모 클래스의 타입이다.
// 그러나 반대로 부모 클래스는 자식 클래스의 타입이 아니다!
//-> interface와 이를 구현하는 클래스에도 적용된다.
// 인터페이스르 사용하는 이유: 그냥 미리 만들어놓으면 나중에 사용하면 되기 때문

// 인터페이스의 특징
// - 생성자가 없다 -> 인스턴스화 시킬 수 없다 -> 설명서가 아니다!
// - 지침서 -> 네가 이것을 구현하고 싶다면 반드시 아래 기능을 구현해라!
// 함수에 중괄호 {} 가 없다. 구현하는 클래스가 내용물을 담당하기 때문
// 인터페이스는 하나의 약속이기 때문에 타 개발자와 협업할 때 굉장히 편리하다
// 같이 모여서 인터페이스 정의
// 기능만 만들어 놓고 그 안의 내용물은 각자 채움

// 상속과 다른 점
// - 상속은 조상을 찾아가는 느낌
// - 인터페이스는 종의 특징

fun main(array: Array<String>) {

    val student_: Student_ = Student_()
    student_.eat()
    student_.sleep()


}


// eat과 sleep을 구현하면 Person_ 타입이라는 것을 의미

interface Person_ {
    fun eat()
    fun sleep()

}

class Student_ : Person_ {

    //generate 들어가서 implement(구현) methods 선택(인터페이스 함수를 구현하기 위해)
    override fun eat() {

    }

    override fun sleep() {

    }
}

class SoccerPlayer : Person_ {
    override fun eat() {
    }

    override fun sleep() {
    }
}


open class Person() {
    fun eat() {


    }

    fun sleep() {


    }

}

class Student() : Person() {


}

class Teacher() : Person() {


}