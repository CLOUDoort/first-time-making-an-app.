package com.example.myapplication.Kotlin



// '두 번 이상 넘어가면 리팩토링해라' -> 기능변화 없이 깔끔하게 정리해라
// 25. 상속
// 부모로부터 설명서를 물려받는다는 의미


fun main(args: Array<String>) {
    val superCar100: SuperCar100 = SuperCar100()
    println(superCar100.drive())
    superCar100.stop()

}

// 클래스간의 중복되는 기능 반복 -> 불편함

// class에서 private은 기본값, 안적어도 자동 기입되는 것
// 때문에 외부에서 사용 불가능한 것
// 외부 클래스에 상속하기 위해 이 class는 private이 아니라는 키워드를 넣어줘야 한다.
// 그 키워드는 'open'


// 부모: Car100
// 자식: SuperCar100, Bus100
open class Car100(){
    open fun drive(): String {
        return "달린다."
//        println("달린다.")

    }

    fun stop(){

    }
}

// 부모 클래스의 기능 수정 가능
// 접근하기 위해 함수 앞에 'open' 붙여줌
// 함수 넣을 칸 클릭해서 컨트롤 + o -> generate override(덮어씌우다)

class SuperCar100() : Car100(){
    // 아래 'super'는 부모 클래스를 의미
    override fun drive(): String {
        val run = super.drive()
        return ("빨리 $run")

        // 부모의 기능을 무시한 경우도 있고
//        부모의 기능을 이용한 경우가 있다.
    }

}

class Bus100(): Car100(){

}



//class Car10() {
//    fun drive() {
//
//    }
//
//    fun stop() {
//
//    }
//
//}
//
//class SuperCar10() {
//
//}
//
//class Truck() {
//
//}
//
//class bus() {
//
//}


