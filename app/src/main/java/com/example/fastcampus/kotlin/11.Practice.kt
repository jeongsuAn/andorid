package com.example.fastcampus.kotlin

//11. 제어흐름 실습

fun main(args: Array<String>){

    val value: Int? = null
    when (value){
        null->println("value is null")
        else->println("value is not null")
    }
    val value2: Boolean? = null
    //when구문은 조건으로 갖는 모든 경우에 대응해주는 것이 좋다
    when (value2){
        true-> println("")
        false-> println("")
        null-> println("")
    }
    //값을 리턴하는 when 구문의 경우 반듯이 값을 리턴해야한다.
    val value3 = when(value2){
        true->1
        false->2
        else->3
        //when에서 else를 사용하는 것도 좋다
    }

    //when의 다양한 조건식(1)
    val value4: Int = 4
    when (value4){
        is Int -> println("value is Int")
        else -> println("value is not Int")
    }
    //when의 다양한 조건식(2)
    val value5: Int = 60
    when (value5){
        //범위!! 60<= <=70
        in 60..70->{
            println("value is in 60-70")
        }
        in 70..80->{
            println("value is in 70-80")
        }
        else-> println("value isn'in 60-80")
    }

}