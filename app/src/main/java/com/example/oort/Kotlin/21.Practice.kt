package com.example.myapplication.Kotlin

// 3) TV 클래스
//      - on/off 기능
//      - 채널을 돌리는 기능
//      - 초기 채널은 (S사, M사, K사 3개)

fun main(array: Array<String>) {

    //val tv: Tv = Tv("13번", "11번", "9번")
    //tv.on()

    //val channels = listOf<String>("K", "M", "S")
    //val tv: Tv = Tv(channels)
    val tv: Tv = Tv(listOf<String>("K", "M", "S"))
    println(tv.onOroff)
    tv.switch()
    println(tv.onOroff)
    println()
    println(tv.currentchannelNumber)
    tv.channelUp()
    println(tv.currentchannelNumber)
    tv.channelDown()
    println(tv.currentchannelNumber)

    println()
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())

}

//class Tv {

//val SBS: String
//val MBC: String
//val KBS: String

//constructor(SBS: String, MBC: String, KBS: String) {
//this.SBS = SBS
//this.KBS = KBS
//this.MBC = MBC
//}

//fun on(){
//println("On")
//}
//fun off(){
//    println("Off")
//}
//}

// class Tv(val first: String, val second: String, val third: String){
//}

class Tv(val channels: List<String>) {

    // Tv가 켜져있는지 꺼져있는지 체크하기 위한 변수를 설정해야 한다.
    var onOroff: Boolean = false // True -> On , False-> Off
    // 처음에는 꺼져 있으니까 기본값으로 false
    // 전원버튼 기능 만들기, 이 기능을 실행하면 켜지고, 켜진 상태에서 실행하면 꺼진다

    //채널 변경 기능 만들기 전에 변수 하나 설정하고 시작
    var currentchannelNumber = 0
        // tv를 틀면 "k"사(0번) 채널이 나오는 것
        set(value) {
            // currentchannelNumber = value
            field = value
            if (field > 2) {
                field = 0
            }
            if (field < 0) {
                field = 2
            }
        }
    // currentchannelNumber가 호출되어 사용될 때 get이 사용된다.
        get() {
        println("호출되었습니다")
        return field
    }

    // 위 변수의 변화를 설정하기 위해서 변수 바로 아래에 set문을 넣어준다.
    // set문은 currentchannelNumber에 값을 할당할 때 호출된다.
    // 값을 할당한다는 뜻은 a=b 를 의미한다. b값을 a에 할당하는 것을 의미
    // currentchannelNumber=value는 사용하면 무한루프에 빠진다.
    // 위 구문은 value를 currentchannelNumber에 할당하고 있는 것, 그러면 위의 set구문이 호출됨
    // 그러면 다시 위에서부터 시작되기 때문에 무한루프에 빠지는 것이다.
    // 이 때 이런 무한반복을 피할 수 있게 해주는 키워드가 field이다.
    // 정리: 값을 할당받을 때는 set, 호출될 떄는 get

    // 정말 쓸 곳이 많다. 숙달할 것, set,field,get
    // 정말 중요함

    fun switch() {
        onOroff = !onOroff
        // Boolean 값을 뒤집어줄 수 있는 연산자 ! 사용
    }

    fun checkCurrentChannel(): String {
        return channels[currentchannelNumber]
    }

    fun channelUp() {
        currentchannelNumber = currentchannelNumber + 1
//        channels.forEachIndexed { index, value ->
//            if (currentchannelNumber == index) {
//                currentchannelNumber = currentchannelNumber + 1
//                return
//            }
//        }

    }

    fun channelDown() {
        currentchannelNumber = currentchannelNumber - 1
//        channels.forEachIndexed { index, value ->
//            if (currentchannelNumber == index){
//                currentchannelNumber = currentchannelNumber - 1
//                return
//            }
//        }

    }

}




