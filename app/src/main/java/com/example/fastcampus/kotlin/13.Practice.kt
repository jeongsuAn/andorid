package com.example.fastcampus.kotlin

fun main(){
    val array = arrayOf<Int>(1,2,3)

    val number = array.get(0)
    println(number)

    array.set(0,100)
    val number1 = array.get(0)
    println("number1")
    //array.set(100,100) array의 바운드를 넘어감
    // Array의 Bounds
    // 처음 array를 만들때 결정된다.

    // Array를 만드는 방법 (3)
    // 이런식으로 만드는게 좋다
    val a1 = intArrayOf(1,2,3)
    val a2 = charArrayOf('b','c')
    val a3 = doubleArrayOf(1.2,100.234)

    // Array를 만드는 방법 (4)
    var a5 = Array(10,{0} )
    var a6 = Array(5,{1;2;3;4;5})

}