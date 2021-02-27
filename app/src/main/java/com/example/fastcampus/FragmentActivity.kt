package com.example.fastcampus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.FragmentManager

class FragmentActivity : AppCompatActivity(), FragmentOne.OnDataPassListener {

    override fun onDataPass(data: String?) {
        Log.d("pass",""+data)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("life_cycle","onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        val button_Fragment : Button = findViewById(R.id.button_fragment)
        val button_Fragment2 : Button = findViewById(R.id.button_fragment2)

        // 프라그먼트를 동적으로 작동시키는 방법(프라그먼트를 만든다)
        val fragmentOne : FragmentOne = FragmentOne()
        //프라그먼트에 data를 넣어주는 방법
        val bundle: Bundle = Bundle()
        bundle.putString("hello_key","hello_value")
        fragmentOne.arguments = bundle

        button_Fragment.setOnClickListener {
            val fragmentManager : FragmentManager = supportFragmentManager

            //Transaction
            //작업의 단위 -> 시작과 끝이 있다
            val fragmentTransaction = fragmentManager.beginTransaction() //이코드가 실행되면 transaction 시작!!
            fragmentTransaction.replace(R.id.container_1,fragmentOne) //xml에서 이 뷰id를 가져와서 fragment와 바꿔주는 역할을 한다.
            fragmentTransaction.commit()
            //끝을 내는 방법
            //commit -> 시간날 때 끝내줘(좀더 안정적이다)
            //commitnow -> 지금 당장 끝내줘
        }
        button_Fragment2.setOnClickListener{
            //프라그먼트 removedetach하는 방법
            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            //fragmentTransaction.detach(fragmentOne) //이렇게 하면 한번 기능을 실행한다음 또 버튼 기능을 수행할 수 없다
            fragmentTransaction.remove(fragmentOne)
            fragmentTransaction.commit()
        }

    }


    override fun onStart() {
        Log.d("life_cycle","onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("life_cycle","onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("life_cycle","onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("life_cycle","onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("life_cycle","onDestory")
        super.onDestroy()
    }
}