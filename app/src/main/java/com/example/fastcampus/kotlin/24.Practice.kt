package com.example.fastcampus.kotlin

fun main(array: Array<String>){
    val night = Night(20,4)
    val monster = Monster(15, 5)

    night.attack(monster)
    monster.attack(night)
    night.attack(monster)
    monster.attack(night)
    night.attack(monster)
    monster.attack(night)
    night.attack(monster)
    monster.attack(night)
    night.attack(monster)
    monster.attack(night)
    night.attack(monster)
    monster.attack(night)

}

class Night(private var hp:Int,private var power:Int){

    fun attack(monster: Monster){
        monster.defense(power)
    }

    fun defense(damage: Int){
        hp -= damage
        if (hp<0){
            println("기사가 죽었습니다.")
        }else {
            hill()
            println("현재 기사의 hp는 $hp 입니다.")
        }
    }

    private fun hill(){
        hp += 3
    }
}

class Monster(private var hp:Int, private var power:Int){

    fun attack(night: Night){
        night.defense(power)
    }

    fun defense(damage: Int){
        hp -= damage
        if(hp<0)
            println("몬스터가 죽었습니다.")
        else
            println("현재 몬스터의 Hp는 $hp 입니다.")
    }

}