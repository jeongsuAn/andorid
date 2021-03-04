package com.example.fastcampus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class Resource : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)

        val ment = resources.getString(R.string.hello)
        Log.d("mentt","ment : "+ment)

        val ment1 = getString(R.string.hello)
        Log.d("mentt","ment : "+ment1)

        val Button_resource = findViewById<Button>(R.id.button_resource)

        Button_resource.setBackgroundColor(getColor(R.color.black))



    }
}