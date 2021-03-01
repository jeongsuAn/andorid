package com.example.fastcampus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NullSafety : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        class Car(var number:Int){
        }
        lateinit var latecar: Car
        setContentView(R.layout.activity_null_safety)

        latecar = Car(10)
        Log.d("number","latenumber : "+latecar.number)




        val number : Int = 10
        val number1 : Int? = 12

        // 개발자가 null이 아님을 보장
        val number5: Int =number1!! + 10

        //val number3 = number + number1 //이런건 문법으로 안되어있음. 더하려면 함수를 사용해야함
        val number3:Int? = number1?.plus(number)
        Log.d("number","number3 : "+number3)

        //삼항연산자 -> 엘비스 연산자(?:)
        val number4 = number1 ?: 10 //number1이 null이면 10을 넣어준다.
        Log.d("number","number4 : "+number4)
    }

    fun plus(a:Int, b:Int?): Int{
        if (b != null ) return a+b //이런건 문법으로 안되어있다고 했으면서 왜 되는거지?

        else return a
    }
    fun plus22(a:Int, b:Int?):Int?{
        return b?.plus(a)
    }
}