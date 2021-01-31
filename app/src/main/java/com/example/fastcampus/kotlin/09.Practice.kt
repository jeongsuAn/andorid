package com.example.fastcampus.kotlin

fun main(args: Array<String>){
    val a: Int? = null
    val b: Int = 10
    val c: Int = 100
// 조건문 안에는 null이 들어가도 괜찮
    if (a == null){
        println("a in null")
    }else{
        println("a is not null")
    }
    // 엘비스 연산자
    val number: Int? = 100
    val number2 = number ?: 10 // 넣어주는 값이 null일 경우 10을 넣어준다!
}