package com.example.fastcampus.kotlin

fun first(){
    val list = mutableListOf<Int>()
    val listTf = mutableListOf<Boolean>()
    for (i in 0 .. 9){
       list.add(i,i)
    }
    for (j in list)
        if (j%2 == 0)
            listTf.add(j,true)
        else
            listTf.add(j,false)
    println(list)
    println(listTf)
}

fun second(score : Int) : String {
    var grade : String = ""
    if(score <= 90) {
        if (score >= 80)
            grade = "A"
        else if (score >= 70)
            grade = "B"
        else if (score >= 60)
            grade = "C"
        else
            grade = "F"
    }
    return grade
}

fun third(number : Int) : Int {
    var ten = number/10
    var one = number%10
    return ten+one
}

fun gogodan(){
    val a = listOf(1,2,3,4,5,6,7,8,9)
    val b = listOf(1,2,3,4,5,6,7,8,9)
    var result:Int = 0
    var i: Int= 0
    for(i in a){
        var j : Int = 0
        for(j in b)

            result=i*j
        println(i + j)
       // println(i + " x "+j+" = "+result)
    }


}

fun main(array : Array<String>){
    first()
    println(second(72))
    print(third(52))
//    gogodan()

}