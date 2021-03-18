package com.example.fastcampus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class LibraryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)
        val textViewglide : ImageView = findViewById(R.id.glide)

        Glide.with(this@LibraryActivity)
            .load("https://www.hongik.ac.kr/front/images/local/pic_ui_01_01.png")
            .into(textViewglide)
    }

}