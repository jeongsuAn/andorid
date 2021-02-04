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
    //반복하는 방법 (5)  //이게 좀 더 직관적이고 좋다
    a.forEachIndexed{ index, item -> //index는 그대로 써줘야하는데 item부분은 바꿔줘도 무방
        println("index : " + index + "value : "+ item)
    }

    //반복하는 방법 (6) 인덱스만 순회하는 for문
    for(i in 0 until a.size){
        //until은 마지막을 포함하지 않는다.
        //0부터 8까지 이다.
        println(i)
        //println(a.get(i))
    }

    println("a. size = "+a.size)
    //반복하는 방법 (7)
    for(i in 0 until a.size step (2)) { //
        println(i)
        println(a.get(i))
    }
    println()

    //반복하는 방법 (8)
    for(i in a.size - 1 downTo (0)){
        // a.size는 9  // 8부터 0까지 반복
        println(a.get(i))
    }
    println()
    //반복하는 방법 (9)
    for(i in a.size - 1 downTo (0) step(2))
        println(a.get(i))

    //반복하는 방법 (10)
    for (i in 0 .. a.size) //until이면 마지막 제외인데 ..은 마지막 포함
        println(i)

    //반복하는 방법 (11)
    var b: Int = 0
    var c: Int = 4

    while (b<c){
        b++
        println("b : " + b )
    }
    // 반복하는 방법 (12)
    println()
    var d: Int = 0
    var e: Int = 4
    do{ //do 는 조건을 실행시키지 못하더라도 무조건 한번을 실행된다.
        println("hello")
        d++
    }while (d<e)

}
