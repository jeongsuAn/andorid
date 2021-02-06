package com.example.fastcampus.kotlin

fun main(array: Array<String>){
    val test: calculator = calculator(4,3)
    println(test.plus())
    println(test.minus())
    println(test.multiple())
    println(test.division())
}

// 사칙연산을 수행 할 수 있는 클래스
class calculator{
    var a: Int = 0
    var b: Int = 0
    constructor(a: Int, b: Int){
        this.a = a
        this.b = b
    }
    fun plus():Int{
        return this.a+this.b
    }
    fun minus():Int{
        return this.a-this.b
    }
   fun division():Float{
        return (this.a.toFloat()/this.b.toFloat())
    }
    fun multiple():Int{
        return this.a*this.b
    }
}


