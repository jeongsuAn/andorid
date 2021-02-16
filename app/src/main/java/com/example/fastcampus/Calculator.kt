package com.example.fastcampus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        var calNumber = "0"
        var cal_operand = 0
        var cal_operator = ""
        var cal_result = 0
        val Cal_0: TextView = findViewById(R.id.cal_0)
        val Cal_1: TextView = findViewById(R.id.cal_1)
        val Cal_2: TextView = findViewById(R.id.cal_2)
        val Cal_3: TextView = findViewById(R.id.cal_3)
        val Cal_4: TextView = findViewById(R.id.cal_4)
        val Cal_5: TextView = findViewById(R.id.cal_5)
        val Cal_6: TextView = findViewById(R.id.cal_6)
        val Cal_7: TextView = findViewById(R.id.cal_7)
        val Cal_8: TextView = findViewById(R.id.cal_8)
        val Cal_9: TextView = findViewById(R.id.cal_9)
        val Cal_plus: TextView = findViewById(R.id.cal_plus)
        val Cal_percent: TextView = findViewById(R.id.cal_percent)
        val Cal_minus: TextView = findViewById(R.id.cal_minus)
        val Cal_mul: TextView = findViewById(R.id.cal_mul)
        val Cal_C: TextView = findViewById(R.id.cal_C)
        val Cal_sign: TextView = findViewById(R.id.cal_sign)
        val Cal_equal: TextView = findViewById(R.id.cal_equal)
        val Cal_div: TextView = findViewById(R.id.cal_div)


        Cal_0.setOnClickListener{
            calNumber += "0"
        }
        Cal_1.setOnClickListener{
            calNumber += "1"
        }
        Cal_2.setOnClickListener{
            calNumber += "2"
        }
        Cal_3.setOnClickListener{
            calNumber += "3"
        }
        Cal_4.setOnClickListener{
            calNumber += "4"
        }
        Cal_5.setOnClickListener{
            calNumber += "5"
        }
        Cal_6.setOnClickListener{
            calNumber += "6"
        }
        Cal_7.setOnClickListener{
            calNumber += "7"
        }
        Cal_8.setOnClickListener{
            calNumber += "8"
        }
        Cal_9.setOnClickListener{
            calNumber += "9"
        }
        Cal_plus.setOnClickListener {
            cal_operand = calNumber.toInt()
            cal_operator = "+"
            calNumber = ""
        }
        Cal_minus.setOnClickListener {
            cal_operand = calNumber.toInt()
            cal_operator = "-"
            calNumber = ""
        }
        Cal_mul.setOnClickListener {
            cal_operand = calNumber.toInt()
            cal_operator = "*"
            calNumber = ""
        }
        Cal_div.setOnClickListener {
            cal_operand = calNumber.toInt()
            cal_operator = "/"
            calNumber = ""
        }
        Cal_percent.setOnClickListener {
            cal_operand = calNumber.toInt()
            cal_result = cal_operand/100
        }
        Cal_sign.setOnClickListener {
            if(calNumber.toInt()>0) {
                calNumber = "-" + calNumber
            }
            if(calNumber.toInt()<0) {
                cal_operator = ((-1)*calNumber.toInt()).toString()
            }
        }

        Cal_equal.setOnClickListener {
            when(cal_operator){
                "+" -> cal_result = cal_operand + calNumber.toInt()
                "-" -> cal_result = cal_operand - calNumber.toInt()
                "*" -> cal_result = cal_operand * calNumber.toInt()
                "/" -> cal_result = cal_operand / calNumber.toInt()
            }
            calNumber = ""+cal_result
        }




    }
}