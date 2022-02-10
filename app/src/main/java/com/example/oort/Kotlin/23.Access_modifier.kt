package com.example.myapplication.Kotlin

// 23. 접근 제어자
//    private 기능 중요하다



fun main(array: Array<String>) {

    val testAccess: TestAccess = TestAccess("아무개")
    // 무조건 할 수 있는 일이 있다
//    testAccess.test()
//    // 기능에 접근할 때는 소괄호 오고
//    println(testAccess.name)
//    // 변수에 접근할 때는 변수만 따라온다
//    // 문제는 name을 언제든지 바꿀 수 있다는 것
//    testAccess.name = "아무개 투"
//    // 이처럼 클래스 내의 멤버변수를 자기 마음대로 바꿀 수 있다
//    println(testAccess.name)
    // 이러한 문제는 전역변수나 지역변수로는 해결 불가능
    // 변수 앞에 private를 적게 되면 외부에서 변경할 수 없다
    // 클래스 내에서는 접근 가능 즉 클래스 밖에서 접근하는 것을 막아주는 역할을 한다.
    // 클래스 내의 함수 앞에 private 붙여주면 클래스 외부에서 사용 불가능

    // 외부에 공개하고 싶지 않은 기능이 있을 수 있다. 그럴 떄에 private을 붙여준다.
    // 외부와 내부를 단절시켜주는 역할

    // Private 키워드 때문에 외부에서 더 이상 사용할 수 없다


//    private 기능 중요하다

    val runningCar: RunningCar = RunningCar()
    runningCar.runFast()
//    runningCar.run()


}



class TestAccess {
    private var name: String = "홍길동"

    constructor(name: String) {
        this.name = name
    }

    fun changeName(newName: String) {
        this.name = newName
    }

    private fun test() {
        println("테스트")
    }
}

class RunningCar(){

    fun runFast(){
        run()

    }

    private fun run(){

    }

}