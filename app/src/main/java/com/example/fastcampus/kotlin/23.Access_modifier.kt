 package com.example.fastcampus.kotlin
//private를 하면 밖에서 그 private로 감춰놓은 함수나 변수에 접근 할 수 없다!!

 fun main(array: Array<String>){
    var testaccess: TestAccess = TestAccess("jeongsuAn")
     println(testaccess.printName())


 }

 class Reward(){
     private var rewardAmount: Int = 100
 }

 class TestAccess{
     private var name: String = "홍길동"

     fun printName():String{
         return this.name
     }
     constructor(name: String){
         this.name = name
     }
     private fun test(){
         println("test")
     }

 }