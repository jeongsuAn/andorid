package com.example.fastcampus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView


class Linstener : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linstener)

        //뷰를 activity로 가져오는 방법
        //1> 직접 찾아서 가져온다
        val textView: TextView = findViewById(R.id.helloButton)
        val helloimage : ImageView = findViewById(R.id.helloImage)
        var number = 10
        //2> xml을 import해서 가져온다
        // 이건 kotlinx.android.synthetic인 플러그인을 사용해야하는데
        // 복잡한 앱에서는 오류가 많이 생길 수 있어서 삭제되었다.
//        hellobutton


        // 익명함수
        // 1 -> 람다 방식
        textView.setOnClickListener {
            Log.d("click","Click!!")
        }
            //맥에서 option(Alt) + enter을 누르면 Log를 쓸 수 있게 import해주는 창이 나온다

        // 2 -> 익명 함수 방식
        textView.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                Log.d("click","Click!!")
            }
        })

        // 3 -> 이름이 필요한 경우 (click)
        val click = object : View.OnClickListener{
            override fun onClick(v: View?) {
                Log.d("click,","Click!!")
                textView.setText("안녕하세요")
                helloimage.setImageResource(R.drawable.anbang)
                number += 10
                Log.d("number = ", ""+number)
            }
        }
        textView.setOnClickListener(click)

        // 리스너는 변수처럼 분야별(클릭,드래그 등)로 하나만 있는건가??

        //뷰를 조작하는 함수
        // setText : 글자를 바꿔줌

        //뷰마다 가질 수 있는 리스너들이 다르니까








    }
}