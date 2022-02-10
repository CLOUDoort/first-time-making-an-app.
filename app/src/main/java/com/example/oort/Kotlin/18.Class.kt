package com.example.myapplication.Kotlin


// 18. class
// 제일 중요한 강의, 모르면 앞으로 힘들어짐, 반드시 이해하고 넘어가야 함
// OOP -> Object Oriented Programing (객체지향 프로그래밍)
// 객체라는 하나의 큰 틀을 만들고 그 속성들을 지닌 존재들을 만들어내는 것
// 객체들이 만들어지고 각 객체들끼리 자기의 일을 하면서 다른 객체와 소통

// "객체"란?
// - 이름이 있는 모든 것

// 절차지향 프로그래밍
// - 코드를 위에서부터 아래로 실행을 하면 문제가 해결된다

// 객체지향 프로그래밍 문제 해결 방법
// - 객체를 만들어서 객체에게 일을 시켜 문제를 해결하는 방식
// - 선수, 심판, 경기장 ,관중 -> 축구 게임, 각각 필요한 역할 분담

// 객체를 만드는 방법
// 프레임워크가 제공해주지 않는 것을 만들 때 우리가 객체를 만들어야 한다.
// - 설명서가 있어야 한다. 설명서를 문법적으로 만드는 방법을 배워야 한다.
// 설명서 작성 방법이 매우 다양하다. 이것이 클래스


fun main(array: Array<String>) {

    // 클래스(설명서)를 통해서 실체를 만드는 방법
    // -> 인스턴스 (설명서를 통해서 실제로 만들어진 것), 만드는 과정을 '인스턴스화'
    // -> 인스턴스화를 통해 인스턴스(객체와 혼용해서 사용하는 단어)를 얻게 됨
    Car("v8 engine", "big")
    // 위의 실체를 변수에 넣을 수 있다
    val bigCar = Car("v8 engine", "big")

    // 우리가 만든 클래스(설명서)는 자료형이 될 수 있다.
    val bigCar1: Car = Car("v8 engine", "big")
    val superCar: SuperCar = SuperCar("good engine", "big", "white")

    val supeerCar2: Car2 = Car2("good engine", "big", "black")


    // 인스턴스화를 통해 인스턴스를 만듬
    val runableCar: RunableCar = RunableCar("simple engine", "short body")
    // 인스턴스가 가지고 있는 기능을 사용하는 방법
    // RunableCar.ride() -> 불가능 , 저거는 설명서일 뿐, 실체는 runableCar이다.
    runableCar.ride()
    runableCar.navi("부산")
    runableCar.drive()

    // 인스턴스 멤버변수(engine이나 door 따위를 이름)에 접근하는 방법
    // 함수와 접근하는 방법과 동일하다
    // 객체 안에 있는 멤버변수(부속품)와 기능에 접근하기 위해서 '객체.'을 사용하면 된다
    val runableCar2: RunableCar2 = RunableCar2("nice engine", "long body")
    println(runableCar2.engine)
    println(runableCar2.body)

    println()
    val testClass = TestClass()
    testClass.test(1)
    testClass.test(1,2)


}

// 클래스(객체 설명서) 만드는 방법(1)
// 단지 설명서일뿐 자동차가 만들어진 것은 아니다
// (2)방법을 짧게 쓴 것/ 축약방법
class Car constructor(var engine: String, var body: String) {

}

// 클래스(설명서) 만드는 방법(2)
// 긴 버전, 과정을 이해하는데 좋은 방법
// 처음에는 이렇게 사용할 것, 그러나 이후에는 1번 방식 사용
class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String) {
        println(engine)
        println(body)
        println(door)
        this.engine = engine
        this.body = body
        this.door = door

    }
//this는 SuperCar 설명서를 말한다
}

// 클래스(설명서) 만드는 방법(3) -> 1번 방법의 확장

// 이번에는 반드시 필요한 부품(engine, body)만 적어주는 방법
// 그리고 중괄호 안에 추가로 필요한 부품을 적어준다
// 방법이 두 가지인 경우라는 말이다.
// 첫 번째는 engine과 body만 넣어줬을 때, 두 번째는 engine과 body 그리고 door 까지 넣어주는 경우
// 첫 번째 경우는 class Car1(engine: String, body: String)에 this(engine, body) 넣어주어 조립하고
// 두 번째 경우의 door는 constructor(engine: String, body: String, door: String) : this(engine, body) {
//        this.door = door에 넣어주어 따로 조립하는 것이다
// 클래스 본문 안의 this(engine, body)가 중요하다

class Car1 constructor(engine: String, body: String) {
    var door: String = ""

    // 조립하는 방법 적어놓은 것을 생성자(constructor)라 한다
    // 때문에 constructor가 두 개라는 것은 조립 방법이 두 가지라는 것이다.
    // class 옆의 constructor는 반드시 필요한 부품을 적어주는 것이고
    // class 본문 안의 constructor는 반드시 필요한 부품뿐만 아니라 추가적으로 있으면 좋을 부품을 적어준다
    constructor(engine: String, body: String, door: String) : this(engine, body) {
        this.door = door
    }
// this(engine, body) = Car1(engine, body)

}

// 클래스(설명서) 만드는 방법(4) -> 2번 방법의 확장
// 반드시 필요한 부품을 먼저 적어놓고 아래에 추가로 필요하면 좋은 부품을 적어줄 것
class Car2 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
        println()
        println(engine)
        println(body)
        println(door)
    }

    // 방법이 너무 많아 헷갈린다면 1번과 3번을 무시할 것
    // 2번과 4번을 확실히 공부한다음에 1번과 3번을 공부할 것, fm대로 공부할 것

}

// 클래스 기능 추가
// 여러 기능이 있는데, 기능을 추가하기 위해서는 기능을 실행하는 함수를 class본문에 작성해주면 됨

class RunableCar(engine: String, body: String) {

    fun ride() {
        println("탑승하였습니다")
    }

    fun drive() {
        println("달립니다!")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다")
    }

}

class RunableCar2 {
    var engine: String
    var body: String

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    // 인스턴스화하는 과정에서 이 부분이 가장 먼저 출력된다
    // 가장 먼저라는 것이 제일 중요한 부분
    // 초기 세팅을 할 때 유용하다
    init {
        println()
        println("RunableCar2가 만들어졌습니다")
    }

    fun ride() {
        println("탑승하였습니다")
    }

    fun drive() {
        println("달립니다!")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다")
    }
    // RunableCar와 RunableCar2는 완전히 같음
    // 하는 방식이 다름, 동일한 내용의 클래스라는 것이 이해가 안된다면 다시 설명을 들을 것
}

// 오버로딩
// 함수의 이름이 동일할 때 처리하는 방법
// -> 이름이 같지만 받는 파라미터가 다른 함수
// class안에 이름이 같은 기능이 존재할 수 없다
// 하지만 함수 이름이 같더라도 함수가 받는 인자가 다르다면 이름이 같은 함수를 만들 수 있다
class TestClass() {

    fun test(a: Int) {
        println("up")
    }

    fun test(a: Int, b: Int) {
        println("down")
    }

}






