package com.example.fastcampus.kotlin

// Iterable : 반복할 수 있는

fun main(array: Array<String>){
    val a = mutableListOf<Int>(1,2,3,4,5,6,7,8,9)

    // 반복하는 방법 (1)
    for (item in a){
        if(item == 5){
            println("item is Five")
        }else {
            println("none")
        }
    }

    // 반복하는 방법 (2)
    for ((index, item) in a.withIndex()){
        println("index : "+ index + " value : " + item)
        //문자열 + Int = 문자열
        //문자열 + 아무거나 = 문자열
    }

    println("반복하는 방법 3 람다 사용")
    // 반복하는 방법 (3) 여기서 부터 람다를 이용함
    a.forEach{
        println(it)
    }
    println()
    // 반복하는 방법 (4) it 대신 람다를 사용한다.
    a.forEach{item->
        println(item)
    }
    println()
    //반복하는 방법 (5)
    a.forEachIndexed{ index, item -> //index는 그대로 써줘야하는데 item부분은 바꿔줘도 무방
        println("index : " + index + "value : "+ item)
    }

    //반복하는 방법 (6)
    for(i in 0 until 9){
        //until은 마지막을 포함하지 않는다.
        //0부터 8까지 이다.
        println(i)
        //println(a.get(i))
    }

    println("a. size = "+a.size)
    //반복하는 방법 (7)
    for(i in 0 until a.size step (2)) //
        println(i)


}