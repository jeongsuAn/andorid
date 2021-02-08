package com.example.fastcampus.kotlin


var number100: Int = 100

fun main(args : Array<String>){
    println(number100)
    var text = Text("jisu")
    print(text.name)
    text.testFun()
    print(text.name)
    print(number100)
}

class Text(var name: String){
    fun testFun(){
        var birth: String = "1996/08/05"
        name = "jeongsuAn"
        number100 = 1000
    }

}