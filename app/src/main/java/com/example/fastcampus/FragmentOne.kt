package com.example.fastcampus

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment


class FragmentOne:Fragment(){

    //프라그먼트에서 엑티비티에 정보를 보내주기 위해 만듬
    interface OnDataPassListener{
        fun onDataPass(data: String?)//여기엔 아직 내용이 없으므로 내용을 구현해야한다.ㅍ
    }

    lateinit var dataPassListener : OnDataPassListener
    override fun onAttach(context: Context) {
        Log.d("life_cycle","F onAttach")
        super.onAttach(context)
        dataPassListener = context as OnDataPassListener //context를 명시적 형변환 시켜줌
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("life_cycle","F onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {//리턴 타입이 뷰라는걸 알려줌 View? 라고 되어있으니까!!
        Log.d("life_cycle","F onCreateView")

        // 프라그먼트가 인터페이스를 처음 그릴 때 호출된다
        // inflater(팽창) -> 뷰를 그려주는 역할
        // container -> 부모뷰
        return inflater.inflate(R.layout.fragment_one,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("life_cycle","F onViewCreated")
        super.onViewCreated(view, savedInstanceState)
        // Activity의 Oncreate에서 했던 작업을 여기에서 한다.
        val passButton: Button = view.findViewById(R.id.pass)
        passButton.setOnClickListener {
            dataPassListener.onDataPass("good bye")
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("life_cycle","F onActivityCreated")
        val data = arguments?.getString("hello_key")
        Log.d("data",""+data)

        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d("life_cycle","F onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("life_cycle","F onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("life_cycle","F onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("life_cycle","F onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("life_cycle","F onDestroyView")
        super.onDestroyView()
    }

    override fun onDetach() {
        Log.d("life_cycle","F onDetach")
        super.onDetach()
    }
}