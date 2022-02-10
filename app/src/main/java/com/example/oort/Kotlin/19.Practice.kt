package com.example.myapplication.Kotlin


// 1) 사칙 연산을 수행할 수 있는 클래스


fun main(array: Array<String>) {

    val calculator1: Calculator1 = Calculator1()
    println(calculator1.plus(5, 10))
    println(calculator1.divide(6, 10))
    // calculator1.plus(3,4).plus(4,5)
    //------------/Calculator1
    //-----------------------/7
    //-------------------------7.plus(4,5)

    println()
    val calculator2: Calculator2 = Calculator2()
    println(calculator2.divide(16, 4, 2))
    println(calculator2.minus(10, 1, 2, 3))

    println()

    val calculator3: Calculator3 = Calculator3(3)
    println(calculator3.plus(5).minus(5).minus(2).initialValue)
    //----------/Calculator3(3)
    //------------------------/Calculator3(8)
    //-----------------------------------------/Calculator3(8).minus(5)
    // 자기 자신 클래스를 리턴해서 기능을 이어 나가는 것 -> Chaining(체이닝)


}

// 1) 사칙연산 클래스, 가장 쉬운 방법
// 내가 너무 어렵게 생각했었다.
// 풀이에서는 타입을 바로 Int로 설정하였는데, 나는 소수점 고려한다고 Double을 사용, 그러나 강의에서 소수점 사용하고 싶으면 Double 사용해도 된다고 했다.
// 하지만 제일 큰 문제점은 나는 변수 제한을 두지 않았다. 왜냐면 3개를 더할 수도 있고 4개를 더할 수도 있기 때문이다. 하지만 강의에서는 변수를 2개로 한정지었다.
// 변수에 제한을 두지 않고 사칙연산 클래스는 어떻게 만들어야 할까..

class Calculator1() {

    fun plus(a: Int, b: Int): Int {
        return a + b
    }

    fun minus(a: Int, b: Int): Int {
        // 먼저 들어온 수에서 나중에 들어온 수를 뺀다.
        return a - b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Int, b: Int): Int {
        // 먼저 들어온 수에서 나중에 들어온 수를 나눈다.
        // 몫만 취한다.
        // 이렇게 주석을 달아줘야 한다.
        return a / b
    }
}

// 두 번째 방법
// 내가 생각했던 문제를 해결하는 방법이다. 사칙연산 변수 개수에 제한을 두지 않는 방법
// 나도 처음에 복습하면서 vararg라는 가변인자를 생각해냈다. 하지만 그 뒤에 해결방법을 찾지 못했다.
// 해답은 iterable 반복문에 있었다. iterable에 나와있는 반복문과 index 사용문 방법에 대해 철저한 복습 필요
class Calculator2() {
    fun plus(vararg numbers: Int): Int {
        var result: Int = 0
        // 결과를 담기 위해 변수로 result값을 0으로 선언
        // 0에 계속 더하는 것
        // foreach구문은 index개념이 아니다
        numbers.forEach {
            result = result + it
            // result += it
        }
        return result
    }

    fun minus(vararg numbers: Int): Int { // 10,1,2,3
        // 10 - 1 - 2 -3
        // 0 - 10 - 1 - 2 - 3
        var result: Int = numbers[0]
        for (i in 0 until numbers.size) {
            if (i != 0) {
                result = result - numbers[i]
            }
        }
        return result
    }

    fun multiply(vararg numbers: Int): Int {
        var result: Int = 1
        // 곱셈이기 때문에 0을 넣으면 무조건 0이 됨
        numbers.forEach {
            if (it != 0) {
                result = result * it
            }
        }
        return result
    }

    fun divide(vararg numbers: Int): Int { // 10, 2, 3 -> 10/2/3
        var result: Int = numbers[0] // 10
        numbers.forEachIndexed { index, value ->
            // 10 -> 10/10/2/3
            // 이를 해결하기 위해 첫 번째 index를 건너 뛰어야 함
            // index가  0이 아니라면 이라는 가정을 넣어줘야 한다
            // 단순명료한 코드가 좋은 코드이다, if중첩 경우 && 사용해주면 좋은 습관
            if (index != 0 && value != 0) {
                result = result / value
            }

        }
        return result
    }
}

class Calculator3(val initialValue: Int) {

    fun plus(number: Int): Calculator3 {
        // 내가 만든 클래스는 자료형이 될 수 있다
        // return값이 int로 나간다에서 Calculator3로 나간다로 바꾼거임
        // 결국 return 값이 Calculator3인 것이 가장 중요한 부분
        // 이전에는 return 값이 Int(정수) 값임
        val result = this.initialValue + number
        return Calculator3(result)
    }

    fun minus(number: Int): Calculator3 {
        val result = this.initialValue - number
        return Calculator3(result)
    }

    fun multiply(number: Int): Calculator3 {
        val result = this.initialValue * number
        return Calculator3(result)
    }

    fun divide(number: Int): Calculator3 {
        val result = this.initialValue / number
        return Calculator3(result)
    }
}



