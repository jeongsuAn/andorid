package com.example.fastcampus.kotlin

fun main(args: Array<String>){
    val value: Int = 3

    // when을 이용하여 흐름을 제어하는 경우
    when (value){
        1 -> {
            println("value is 1")
        }
        2 -> {
            println("value is 2")
        }
        3 -> println("value is 3")  //이런식으로 중괄호 생략도 가능
        else -> {
            println("I don't know value")
        }
    }
    //when을 이용하여 값을 리턴하는 경우
    val value2 = when(value){
        1->10
        2->20
        3->30
        else->100
    }
}