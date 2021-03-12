package com.example.fastcampus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ThreadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)


        val thread: Thread = Thread()

        val runnable: Runnable = object  : Runnable{
            override fun run() {
                Log.d("thread-1","Thread is made")
            }
        }
    }
}