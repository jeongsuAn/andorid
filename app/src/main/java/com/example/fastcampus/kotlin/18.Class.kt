package com.example.fastcampus.kotlin

import androidx.annotation.VisibleForTesting

// oop 객체지향프로그래밍
// object oriented programing

// 객체란 뭘까?
// 이름이 있는 모든것

// 절차지향 프로그래밍 문제해결 방법
// 코드를 위에서 아래로 실행하면 문제가 해결

// 객체지향 프로그램 문제 해결 방법
// 객체를 만들어서 객체에게 일을 시켜서 문제를 해결
// 선수 심판 경기장 관중 -> 축구게임

// 객체를 만드는 방법
// 설명서가 있어야한다.(여러개 있다.)
fun main(array: Array<String>){
    //클래스 (설명서)를 통해서 실체를 만드는 방법
    // -> 인스턴스화 -> 인스턴스(객체)
    Car("v8 engine","big")

    // 1번째 방법으로 인스턴스 만들기
    val bigCar = Car("v8 engine","big")
    val bigCar1 : Car= Car("v8 engine","big") // 똑같은 표현이다. (클래스가 새로운 자료형이 된다.)

    // 2번째 방법으로 클래스 만들기 (어차피 똑같음)
    val superCar : SuperCar = SuperCar("good engine", "big", "white")
    // 3번째 방법으로 클래스 만들기
    val book : book1 = book1("책 이름","2020",100000)

    //클래스 기능구현
    val runableCar : RunableCar = RunableCar("simble engine", "small")
    runableCar.ride()
    runableCar.navi("인천")
    runableCar.drive()

    val runableCar2 : RunableCar2 = RunableCar2("simple engine", "small")
    runableCar2.ride()

}

// 클래스 (설명서) 만드는 방법 (1)
class Car constructor(var engin: String,var body: String){
}

// 클래스 (설명서) 만드는 방법 (2)
class SuperCar{
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String){
        this.engine = engine
        this.body = body
        this.door = door
    }
}

// 클래스 (설명서) 만드는 방법 (3) -> 1번 방법의 확장
class Car1 constructor(engine :String, body: String){
    var door = ""
    constructor(engine: String, body: String, door: String) : this(engine, body){
        this.door = door
    }
}

class book1 constructor(name: String, year: String){
    var price : Int = 0
    constructor(name: String, year: String, price:Int):this(name, year){
        this.price = price
    }
}

// 클래스 (설명서) 만드는 방법 (4) -> 2번 방법의 확장
class car2 {
    var engine: String = ""
    var body : String = ""
    var door : String = ""

    constructor(engine: String, body: String){
        this.engine = engine
        this.body = body
    }
    constructor(engine: String, body: String, door: String){
        this.engine = engine
        this.body = body
        this.door = door
    }
}

// 클래스의 기능 구현
class RunableCar(engine: String, body: String){
    fun ride(){
        println("탑승 하였습니다")
    }
    fun drive(){
        println("달립니다")
    }
    fun navi(destination: String){
        println("$destination 으로 목적지가 설정되었습니다.")
    }
}

class RunableCar2{
    var engine: String
    var body: String
    constructor(engine:String,body:String){
        this.engine = engine
        this.body = body
    }
    init{   //인스턴스가 만들어질때 가장 먼저 실행
        // 초기셋팅을 할 때 유용하다
        println("RunableCar2의 클래스를 가진 인스턴스가 만들어졌습니다.")
     //   println(this.engine) 여기서는 아직 아무것도 못 받아온 상태라 그런듯?
     //   println(engine)


    }
    fun ride(){
        println("탑승 하였습니다")
    }
    fun drive(){
        println("달립니다")
    }
    fun navi(destination: String){
        println("$destination 으로 목적지가 설정되었습니다.")
    }

}

// 오버로딩
// -> 이름이 같지만 받는 파라미터가 다른 함수
class TestClass(){
    fun test(a: Int){
        println("up")
    }
    fun test(a: Int, b: Int){
        println("down")
    }
}