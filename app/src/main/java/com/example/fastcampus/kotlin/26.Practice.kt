package com.example.fastcampus.kotlin

fun main(args: Array<String>){
    var monster111 = superMonster(100,1,2)
    var night111 = superNight(100,5,10)

    night111.attack(monster111)
    night111.attack(monster111)
    night111.attack(monster111)
    night111.attack(monster111)
    night111.attack(monster111)

/*    monster111.bite(night111)
    night111.attack(monster111)
    monster111.attack(night111)
    night111.attack(monster111)
    monster111.bite(night111)
    night111.attack(monster111)
    monster111.attack(night111)
    night111.attack(monster111)
    monster111.bite(night111)
    night111.attack(monster111)
    monster111.attack(night111)
    night111.attack(monster111)
    monster111.bite(night111)
    night111.attack(monster111)
    monster111.attack(night111)
    night111.attack(monster111)
    monster111.bite(night111)
    night111.attack(monster111)
    monster111.attack(night111)
*/
}

// 상속이 만들어낸 특징
// - 자식 클래스는 부모 클래스의 타입이다
// - 부모 클래스는 자식 클래스의 타입이 아니다.

open class Charator(var hp: Int, var power: Int){
    open fun attack(charator: Charator,power: Int=this.power){
        charator.defence(power)
    }
    open fun defence(damage:Int){
        this.hp -= damage
        println("${javaClass.simpleName}의 hp는 ${this.hp} 입니다.")
    }

}

class superNight(hp:Int, power: Int, var level:Int = 1):Charator(hp, power){
    override fun attack(charator: Charator, power: Int) {
        var totalpower = this.power + level
        super.attack(charator,totalpower)
    }

    override fun defence(damage: Int) {
        var totaldamage = damage - level
        super.defence(totaldamage)
    }
}

class superMonster(hp:Int, power:Int, var level: Int = 1):Charator(hp,power){
    fun bite(charator: Charator,power: Int){
        var totalpower = power + level
        charator.defence(totalpower)
    }
    override fun defence(damage: Int) {
        var totaldamage = damage - level
        super.defence(totaldamage)
    }
}