package com.example.fastcampus.kotlin

// 두번까지는 봐준다
// 두번 이상 넘어가면 리팩토링 해라

// 25. 상속
// 부모로 부터 설명서를 물려받는다.

fun main(args : Array<String>){

    val superCar: SuperCar100 = SuperCar100()
    println(superCar.drive())
    superCar.stop()

    val bus100: Bus100 = Bus100()
//    bus100.drive() 얘는 상속을 못받았으니까 안됨
}

open class Car100(){
    open fun drive():String{
        return "달린다"
    }
    fun stop(){

    }
}

class SuperCar100() : Car100() {
    override fun drive():String{
        var run = super.drive()
        return "빨리 $run "

    }
}
class Bus100(){

}