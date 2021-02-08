package com.example.fastcampus

import com.google.android.material.bottomnavigation.BottomNavigationItemView

fun main(array: Array<String>){
    var bank:Bank= Bank()
bank.creatID("jeongsuAn",19960805).withdraw(1000000).disposit(10000).printMoney()

}

class Bank(){
    var name: String = ""
    var birthDay: Int = 0
    var money:Int = 0
    fun creatID(name:String,birthDay:Int):Bank{
        this.name=name
        this.birthDay=birthDay
        return this
    }
    fun withdraw(money:Int):Bank{ //출금하기
        this.money = this.money-money
        return this
    }
    fun disposit(money: Int):Bank{
        this.money = this.money+money
        return this
    }
    fun printMoney(){
        println(this.money)
    }

}