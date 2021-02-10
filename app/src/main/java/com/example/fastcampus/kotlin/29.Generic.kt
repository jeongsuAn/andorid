package com.example.fastcampus.kotlin

fun main(args: Array<String>){
    //제너릭을 사용하지 않은 경우
    //형변환을 해 주어야한다
    val list1 = listOf(1,2,3,"가")
    val b:String = list1[2].toString()

    //제네릭을 사용하는 경우 -> 타입이 안전하다
    val list2 = listOf<String>("a","b","c")
    val c: String = list2[2]//String이라는 것을 보장받는다.

    //강한 타입을 체크할 수 있다.
    val list3 = listOf(1,2,3,4,"가","나",2.0)
    val list4 = listOf<Int>(1,2,3,"가") // 강한 타입 체크

    // 제너릭을 사용하지 않은 경우
    val list5 = listOf<Any>(1,2,3,"가")
    //부모 : Any
    //자식 : String,Int,Float
}