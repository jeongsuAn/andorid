  package com.example.fastcampus

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

  class Intent1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)


        val change_Activity: Button =  findViewById(R.id.change_activity)

        change_Activity.setOnClickListener{

//            val intent = Intent(this@Intent1,Intent2::class.java)
//
//            //Key, Value 방식 -> Key와 value를 쌍으로 만들어 저장한다. -> Dictionary
//            intent.putExtra("number1",1)
//            intent.putExtra("number2",2)
//            //이제 이 값을 Intent2에서 받아올 예정!
//            startActivity(intent)

//            var intent2 = Intent(this@Intent1,Intent2::class.java)
//            //Apply->
//            //Apply가 있으면 이 내용이 여기에만 있다는걸 묵시적으로 알려주는 것이므로 유지보수가 편함
//            intent2.apply{
//                this.putExtra("number1",3)
//                this.putExtra("number2",4)
//            }
//            startActivityForResult(intent2,200)//requestCode는 임의로 200이라고 작성

            // 암시적 intent
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"))
            startActivity(intent)
        }

    }

      override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
          super.onActivityResult(requestCode, resultCode, data)
          if (requestCode == 200){
              Log.d("requestCode = ",""+requestCode)
              Log.d("reslutCode = ",""+resultCode)
              val result = data?.getIntExtra("result",0)
              Log.d("result = ",""+result)
          }
      }
  }