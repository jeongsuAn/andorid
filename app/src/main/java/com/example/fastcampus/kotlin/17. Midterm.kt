package com.example.fastcampus.kotlin

fun main(array: Array<String>){
    firsT()
    println(seconD(80))
}

fun firsT(){
    val list1 = MutableList(9,{0})
    val list2 = MutableList(9,{true})

    for (i in 0..8)
        list1[i] = i+1

    list1.forEachIndexed{index, value ->
        if(value%2 == 1){
            list2[index]=true
        }else
            list2[index]=false
    }
    println(list1)
    println(list2)
}

fun seconD(score: Int):String{
    when (score){
        in 90 .. 100 -> {
            return "A"
        }
        in 80 .. 90 -> {
            return "B"
        }
        in 70 .. 80 -> {
            return "C"
        }
        else->{ //else로 마무리해줘야 모든 리턴값이 String이 될 수 있겠
            return "F"
        }

    }


}

