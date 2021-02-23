package com.example.fastcampus

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.EditText

class website1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_website1)

        val web_url: EditText = findViewById(R.id.web_EditText)
        val web_button: Button = findViewById(R.id.web_Button)
        var url = ""

        web_button.setOnClickListener{
            url = web_url.text.toString()
            Log.d("url",url)
            val url_start = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(url_start)
        }
        web_url.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                Log.d("edit","afterTextChanged : "+s)
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.d("edit","beforeTextChanged : "+s)

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.d("edit","onTextChanged : "+s)
            }
        })
    }
}