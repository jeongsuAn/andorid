package com.example.fastcampus.kotlin

fun main(array: Array<String>){
    var account1 =
        Account("jeongsuAn", "1996/08/05", 2000)
    println(account1.checkBalance())
    println(account1.withdraw(1000))
    println(account1.withdraw(2000))
    println()
    println(account1.save(50000))
    println()
    println(account1.checkBalance())

}

class Account(var name:String, var birth:String, var balanece:Int){
    fun checkBalance():Int{
        return this.balanece
    }
    fun withdraw(money:Int):Boolean{
        if (money<=balanece){
            balanece = balanece-money
            return true
        }else
            return false
    }
    fun save(money: Int):Unit{
        balanece = balanece + money
    }
}

class Account1(var name:String, var birth:String, var balanece:Int=1000 ){
    fun checkBalance():Int{
        return this.balanece
    }
    fun withdraw(money:Int):Boolean{
        if (money<=balanece){
            balanece = balanece-money
            return true
        }else
            return false
    }
    fun save(money: Int):Unit{
        balanece = balanece + money
    }
}

