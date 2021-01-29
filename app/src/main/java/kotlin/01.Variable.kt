package com.example.fastcampus.kotlin

//변수
//  - variable : 변할 수 있음
//  - value : 변할 수 없음
//변수를 선언하는 방법
// var/val 변수명 = 값

var num = 10
var hello = "hello"
var point = 3.4

val fix = 20

fun main(arg:Array<String>){

    println(num)
    println(hello)
    println(point)
    println(fix)

    num = 100
    hello = "Good Bye"
    point = 10.4

    println(num)
    println(hello)
    println(point)
    println(fix)
}