package com.example.fastcampus.kotlin

 // 14. Collection
 // -> list, set, map

fun main(arg :Array<String>){

    // Immutable 변경 불가능
    //List 중복을 허용한다.
    val numberList = listOf<Int>(1,2,3,3)
    println(numberList)
    println(numberList.get(0))
    println(numberList[0])
    println()

    //Set 중복을 허용하지 않는다.
    val numberSet = setOf<Int>(1,2,3,3,3)
    println(numberSet)
    //Set에서는 인덱스가 없다.

    // Map -> Key, value 방식으로 관리한다.
    val numberMap = mapOf<String,Int>("one" to 1,"two" to 2)
    println()
    println(numberMap.get("one"))

    // Mutable 변경가능.
    // 변수를 val로 설정했는데 추가가 가능하네..
    val mNumberList = mutableListOf<Int>(1,2,3)
    mNumberList.add(3,4)
    println()
    println(mNumberList)

    val mNuberSet = mutableSetOf<Int>(1,2,3,4,4,4)
    mNuberSet.add(10)
    println(mNuberSet)
    val mNumberMap = mutableMapOf<String,Int>("one" to 1)
    mNumberMap.put("two",2)
    println(mNumberMap)
}