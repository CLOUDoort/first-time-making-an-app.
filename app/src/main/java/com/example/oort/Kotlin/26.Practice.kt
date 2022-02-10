package com.example.myapplication.Kotlin

// 과제
// Knight, Monster(부모) -> 기능이 같으니 Character class로 합침
// SuperNight, SuperMonster( 자식


fun main(array: Array<String>) {

    val monster = SuperMonster(100, 10)
    val knight = SuperKnight(130, 8)
    monster.attack(knight)
    monster.bite(knight)

    // 굉장히 이상한 부분이 있다.
    //monster.attack(knight)을 보면 attack의 타입은 Character인데 knight의 타입은 SuperKnight이다.
    // 때문에 작동 가능 -> 자식 클래스는 부모 클래스의 타입이기 떄문
  // 상속이 만들어낸 특징:
  // (매우 중요) -자식 클래스는 부모 클래스의 타입이다.
    // 그러나 반대로 부모 클래스는 자식 클래스의 타입이 아니다!
    // attack의 Character >(포함) Knight의 SuperKnight
    // ex) 모든 슈퍼카가 자동차인건 맞지만 모든 자동차가 모두 슈퍼카인 것은 아니다

}

open class Character(var hp: Int, val power: Int) {

    fun attack(character: Character, power: Int = this.power) {
        // power: Int = this.power -> supermonster의 기능 중 bite에 power + 2가 들어가지만
        // superknigt는 이 기능이 있을지 없을지 모르기때문에 default값을 넣어주는 것이 좋다
        // 캐릭터의 파워가 전달되지 않으면 캐릭터가 가지고 있는 파워가 전달된다는 파워만큼 사용한다는 뜻
        character.defense(power)
    }

    open fun defense(damage: Int) {
        hp -= damage
        // 클래스 이름 호출하는 기능, javaclass.simplename
        // Character가 아닌 superknight의 defense가 호출된 것, 즉 기능이 사용되는 클래스 이름이 호출됨
        if (hp > 0) println("${javaClass.simpleName}의 남은 체력은 $hp 입니다.")
        else println("사망했습니다.")
    }
}


// 자식 클래스가 인스턴스화 되기 위해서 부모 클래스가 먼저 인스턴스화 되어야 한다.
// 부모 클래스의 멤버변수에 더하는 것은 되나 없애는 것은 불가능하다.
//(매우 중요) 부모 클래스의 멤버변수를 적어줄 때는 val이나 var 붙이면 안 된다. 이미 변수선언이 되었기 때문
// 멤버변수를 추가하기 위해서는 변수 선언을 해줘야 한다.

class SuperMonster(hp: Int, power: Int) : Character(hp, power) {

    fun bite(character: Character) {
        super.attack(character, power + 2)

    }

}

class SuperKnight(hp: Int, power: Int) : Character(hp, power) {
    val defensePower = 2
    override fun defense(damage: Int) {
        super.defense(damage-defensePower)
    }
}
