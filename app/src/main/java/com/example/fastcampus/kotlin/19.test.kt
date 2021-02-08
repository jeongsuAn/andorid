package com.example.fastcampus.kotlin

fun main(array: Array<String>){
    val test: Calculator = Calculator(4,3)
    println(test.plus())
    println(test.minus())
    println(test.multiple())
    println(test.division())

    println()
    val calculator1:Calculator1= Calculator1()
    println(calculator1.plus(10,20))

    println()
    val calculator2:Calculator2= Calculator2()
    println(calculator2.plus(100,200,300))
    println(calculator2.minus(100,200,300))
    println(calculator2.multiply(100,200,300))
    println(calculator2.divide(100,2,5))

    println()
    val calculator3:Calculator3 = Calculator3(3)
    calculator3.plus(3).plus(3).divide(2).multiply(7).print()


}

// 사칙연산을 수행 할 수 있는 클래스
class Calculator{//()를 치는것과 안치는것은 천지차이
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

class Calculator1(){
    fun plus(a:Int, b:Int):Int{
        return a+b
    }
    fun minus(a:Int, b:Int):Int{
        return a-b
    }
    fun multiply(a:Int, b:Int):Int{
        return a*b
    }
    fun divide(a:Int, b:Int):Int{
        return a/b //몫만 계산
    }
}

class Calculator2(){
    fun plus(vararg numbers: Int):Int{ //numbers라는 배열로 저장되는구나
        var result: Int= numbers[0]
        numbers.forEach{
            result += it
        }
        return result
    }
    fun minus(vararg numbers: Int):Int{
        var result: Int= numbers[0]
        for (i in 1 until numbers.size) {
            result -= numbers[i]
        }
        return result
    }
    fun multiply(vararg numbers: Int):Int{
        var result: Int= 1
        if(result != 0)
        numbers.forEach{
            result *= it
        }
        return result
    }
    fun divide(vararg numbers: Int):Int{
        var result: Int= numbers[0]
        for (i in 1 until numbers.size){
            result /= numbers[i]
        }
        return result
    }

}

class Calculator3 (var initalValue: Int){
    fun plus(number:Int):Calculator3{
        var result = 0  //number에다가 더하고 number에서 빼려고 했는데 안되네
        result = this.initalValue + number
        return Calculator3(result)
    }
    fun minus(number:Int):Calculator3{
        val result:Int = this.initalValue - number
        return Calculator3(result)
    }
    fun multiply(number:Int):Calculator3{
        val result:Int = this.initalValue * number
        return Calculator3(result)
    }
    fun divide(number:Int):Calculator3{
        val result = this.initalValue / number
        return Calculator3(result)
    }
    fun print(){
        println(this.initalValue)
    }

}
