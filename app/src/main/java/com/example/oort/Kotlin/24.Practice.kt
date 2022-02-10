package com.example.myapplication.Kotlin


fun main(array: Array<String>) {

    val knight = Knight(20, 4)
    val monster = Monster(15, 5)

    knight.attack(monster)
    monster.attack(knight)

    // 바로 이렇게 접근 가능해서 변수를 바꿔버릴 수도 있다.

    // 이를 방지하기 위해 private을 걸어준다.

    println()
    monster.attack(knight)

    // 내가 정한 변수의 외부 접근을 막고 싶을 때 private을 걸어준다.
    // 정말 많이 사용하는 것

    // 그래서 처음 class 멤버 변수를 생성할 때 무조건 private을 붙여준다.
    // 그리고 variable이 아닌 value로 만들어줌으로써 접근범위를 완전 최소화한다.
    // 필요한 경우 점점 범위를 넓혀가는 것
    // 코딩 공부할 때 매우 도움이 된다.
    // 함수도 또한 우선 private을 넣어주고 사용할 일이 있으면 그때가서 지우는 습관을 만드는 것이 좋다

}




open class Knight(private var hp: Int, private var power: Int) {

    open fun attack(monster: Monster) {
        monster.defense(power)
        // 몬스터를 어택하는 것은 몬스터의 디펜스 기능을 호출하는 것

    }

    fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) {
            heal()
            println("기사 현재 체력은 $hp 입니다.")
        } else println("기사가 죽었습니다.")

    }

    private fun heal() {
        // 아무때나 사용하는 것이 아니라
        // 공격을 당했을 때 죽지 않았다면 힐을 한다.
        // 아무때나 힐을 사용할 수 없게 private을 걸어준다.

       hp += 3
    }

}

open class Monster(private var hp: Int, private var power: Int) {


    fun attack(knight: Knight) {
        knight.defense(power)
    }

    open fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) println("몬스터 현재 체력은 $hp 입니다.")
        else println("몬스터가 죽었습니다.")
    }

}