package com.example.fastcampus.kotlin

fun main(array: Array<String>){
    var tvChannel:TV = TV(listOf<String>("K","M","S"))
    println(tvChannel.currentChannelnumber)
    println(tvChannel.checkCurrentChannel())
    tvChannel.channelUp()
    println(tvChannel.currentChannelnumber)
    println(tvChannel.checkCurrentChannel())
    tvChannel.channelUp()
    println(tvChannel.currentChannelnumber)
    println(tvChannel.checkCurrentChannel())
    tvChannel.channelUp()
    println(tvChannel.currentChannelnumber)
    println(tvChannel.checkCurrentChannel())
    tvChannel.channelUp()
    println(tvChannel.currentChannelnumber)
    println(tvChannel.checkCurrentChannel())



}

class TV(var channel: List<String>){
    var onOrOff:Boolean = false
    var currentChannelnumber = 0
        set(value) { //위의 변수를 설정할때 불리는 함수
            field = value
            if (field > 2){
                field = 0
            }
            if (field < 0){
                field = 2
            }
        }
        get(){
            println("호출되었습니다.")
            return field
        }

    fun swich(){
        onOrOff = !onOrOff
    }
    fun checkCurrentChannel():String {
        return channel[currentChannelnumber]
    }
    fun channelUp(){
        channel.forEachIndexed{index, value ->
            if(currentChannelnumber == index){
                currentChannelnumber = currentChannelnumber + 1
                return
            }
        }
    }
    fun channelDown(){
        currentChannelnumber = currentChannelnumber - 1
    }
}
