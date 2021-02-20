package com.example.fastcampus

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class Intent2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)


//

        val button_Result : Button = findViewById(R.id.button_result)
        button_Result.setOnClickListener {
            //가지고 올때는 타입을 알아야함. void*와 비슷하네
            val number1 = intent.getIntExtra("number1",0)
            val number2 = intent.getIntExtra("number2",0)

            Log.d("number1 = ",""+number1)
            Log.d("number2 = ", ""+number2)

            val result = number1 + number2

            val resultIntent = Intent()
            resultIntent.putExtra("result = ", result)

            setResult(Activity.RESULT_OK,resultIntent)
            finish( )//finish()는 엑티비티 종료를 나타냄(스택으로 생각하면 편함)
        }
    }
}