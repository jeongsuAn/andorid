package com.example.fastcampus.kotlin

// 27. Interface
// - 인터페이스는 약속 ! -> 너가 이것을 구현하면 너도 이 타입이다
// - 생성자가 없다 -> 인스턴스화 시킬 수가 없다. -> 설명서가 아니다
// - 인터페이스는 지침서 -> 너가 이것을 구현하고 싶다면 반드시 아래의 기능을 구현해라

// 상속의 특징
// - 자식 클래스는 부모 클래스의 타입이다.
// - 부모 클래스는 자식 클래스의 타입이 아니다 .

// 상속과 다른점
// 상속은 조상을 찾아가는 느낌
// 인터페이스는 종의 특징

interface Person_{
    fun eat()
    fun sleep()
}

class Student_ : Person_ {
    override fun eat() {
    }

    override fun sleep() {

    }
}

class SoccerPlay : Person_ {
    override fun eat() {

    }

    override fun sleep() {

    }
}