package com.example.myapplication.Kotlin


// 2) 은행 계좌 만들기
//      - 계좌 생성 기능 (이름, 생년월일, 초기금액)
//      - 잔고를 확인하는 기능
//      - 출금 기능
//      - 예금 기능


fun main(array: Array<String>) {
    val account: Account = Account("강준석", "1998/06/19", 1000)
    println(account.CheckBlance())
    println(account.save(1000))
    println(account.Withdraw(2000))
    println(account.CheckBlance())

    println()
    val account2 = Account("강준석", "1998/06/19", -2000)
    println(account2.CheckBlance())

    println()
    val account3 = Account2("강준석", "1998/06/19")
    println(account3.CheckBlance())
}

// 은행계좌로서 Account 클래스는 문제가 많다.
// 특히 금액이 Int형으로 마이너스가 나올 수 있다. 이를 관리해주기 위해 초기 값을 관리해줘야 한다.

class Account {
    val name: String
    val birth: String
    var balance: Int

    constructor(name: String, birth: String, balance: Int) {
        this.name = name
        this.birth = birth
        // 충격
        // 이리도 자유로운 표현이 가능하다니
        // 무작정 넣는 것이 아닌, 넣기 전에 검사도 가능하다
        if (balance >= 0) {
            this.balance = balance
        } else {
            this.balance = 0
        }
    }

    fun CheckBlance(): Int {
        // 이렇게 해버리면 계속 초기금액만 나오는 것이 아닌가해서 이런 답을 적지 않았다
        return balance
    }

    fun Withdraw(money: Int): Boolean {
        // 갑자기 Boolean? 출금하는 금액 빼는 것이 아닌 출금 여부에 대해 트루 올 폴스 사용
        if (balance >= money) {
            balance -= money
            return true
        } else {
            return false
        }
    }

    fun save(money: Int) {
        // 항상 가능하기 때문에 리턴타입이 없다?
        balance += money
        // balance = balance + money
    }


}

// 기본값 설정
// 생성자에 값이 안들어오면 기본값 넣고 들어오면 들어온 값을 넣음
class Account2(val name: String, val birth: String, var balance: Int = 1000) {

    fun CheckBlance(): Int {
        // 이렇게 해버리면 계속 초기금액만 나오는 것이 아닌가해서 이런 답을 적지 않았다
        return balance
    }

    fun Withdraw(money: Int): Boolean {
        // 갑자기 Boolean? 출금하는 금액 빼는 것이 아닌 출금 여부에 대해 트루 올 폴스 사용
        if (balance >= money) {
            balance -= money
            return true
        } else {
            return false
        }
    }

    fun save(money: Int) {
        // 항상 가능하기 때문에 리턴타입이 없다?
        balance += money
        // balance = balance + money
    }

}

// 생성자에 val이나 var 붙여주지 않으면 class 내 함수 기능에 접근할 수 없다.
// 다음과 같이 만든 이유는 다음과 같은 방법은 아까 마주했던 balance가 음수가 되는 문제를 해결했던
// 방법을 해결할 수 있는 또 다른 방법이기 때문이다.
class Account3(initialBalance: Int) {

    val balance: Int= if (initialBalance>=0) initialBalance else 0
    // 값을 리턴하는 if문

    fun checkBalance(): Int {
        return balance
    }


}