package com.example.fastcampus.kotlin

import java.lang.NullPointerException

var a = 1+2+3+4+5 // 연산의 결과 값을 변수에 넣어줄 수 있다.
var b = "1"
var c = b.toInt()
var d = b.toFloat()

var e = "John"
var f = "My name is $e Nice to meet you"

// Null : 존재하지 않음
//var abc1 : Int = null
// null을 넣으려면 자료형 뒤에 ?를 넣어줘야한다
var abc2 : Int? = null //"null" 아님

fun main(array: Array<String>){
    println(a)
    println(b)
    println(c)
    println(d)
    println(f)

    println(abc2 )

}