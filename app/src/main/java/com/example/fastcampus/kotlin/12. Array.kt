package com.example.fastcampus.kotlin

// 배열
// 배열이 필요한 이유
// -그룹 (모음집)이 필요할 때
fun main(array: Array<String>){
    // 배열을 생성하는 방법
    val number : Int = 1

    // 배열 생성하는 방법 1
    var group1 = arrayOf<Int>(1,2,3,4,5)
    println(group1 is Array)
    println(group1) //이런식으로 프린트가 안되는구나
    println()
    // 배열 생성하는 방법 2
    var group2 = arrayOf(1,2,3.5,"Hello")
    // 이런식으로 생성할 수도 있으나 추천하지는 않음
    // 생성 및 함수 호출방법은 클래스에서 나온다!!
    // 배열의 값을 꺼내는 방법 (1)
    val test1 = group1.get(0)
    val test2 = group1.get(4)
    println(test1)
    println(test2)

    // 배열의 값을 꺼내는 방법 (2)
    val test3 = group1[0]
    println(test3)

    // 배열의 값을 바꾸는 방법
    group1.set(0,100)   //index와 Value를 쓰면 됨
    // 배열의 값을 바꾸는 방법(2)
    group1[0]=200

}