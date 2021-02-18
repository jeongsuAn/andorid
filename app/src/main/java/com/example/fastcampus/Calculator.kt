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
        var cal_floatResult = 0.0
        val Cal_result: TextView = findViewById(R.id.cal_result)
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


        Cal_0.setOnClickListener {
            if (calNumber == "0") {
                calNumber = "0"
            } else {
                calNumber += "0"
            }
            Cal_result.setText(calNumber)
        }
        Cal_1.setOnClickListener {
            if (calNumber == "0") {
                calNumber = "1"
            } else {
                calNumber += "1"
            }
            Cal_result.setText(calNumber)
        }
        Cal_2.setOnClickListener {
            if (calNumber == "0") {
                calNumber = "2"
            } else {
                calNumber += "2"
            }
            Cal_result.setText(calNumber)
        }
        Cal_3.setOnClickListener {
            if (calNumber == "0") {
                calNumber = "3"
            } else {
                calNumber += "3"
            }
            Cal_result.setText(calNumber)
        }
        Cal_4.setOnClickListener {
            if (calNumber == "0") {
                calNumber = "4"
            } else {
                calNumber += "4"
            }
            Cal_result.setText(calNumber)
        }
        Cal_5.setOnClickListener {
            if (calNumber == "0") {
                calNumber = "5"
            } else {
                calNumber += "5"
            }
            Cal_result.setText(calNumber)
        }
        Cal_6.setOnClickListener {
            if (calNumber == "0") {
                calNumber = "6"
            } else {
                calNumber += "6"
            }
            Cal_result.setText(calNumber)
        }
        Cal_7.setOnClickListener {
            if (calNumber == "0") {
                calNumber = "7"
            } else {
                calNumber += "7"
            }
            Cal_result.setText(calNumber)
        }
        Cal_8.setOnClickListener {
            if (calNumber == "0") {
                calNumber = "8"
            } else {
                calNumber += "8"
            }
            Cal_result.setText(calNumber)
        }
        Cal_9.setOnClickListener {
            if (calNumber == "0") {
                calNumber = "9"
            } else {
                calNumber += "9"
            }
            Cal_result.setText(calNumber)
        }
        Cal_plus.setOnClickListener {
            cal_operand = calNumber.toInt()
            cal_operator = "+"
            Cal_result.setText(calNumber)
            calNumber = ""
        }
        Cal_minus.setOnClickListener {
            cal_operand = calNumber.toInt()
            cal_operator = "-"
            Cal_result.setText(calNumber)
            calNumber = ""
        }
        Cal_mul.setOnClickListener {
            cal_operand = calNumber.toInt()
            cal_operator = "*"
            Cal_result.setText(calNumber)
            calNumber = ""
        }
        Cal_div.setOnClickListener {
            cal_operand = calNumber.toInt()
            cal_operator = "/"
            Cal_result.setText(calNumber)
            calNumber = ""
        }
        Cal_percent.setOnClickListener {
            cal_operand = calNumber.toInt()
            cal_floatResult = (cal_operand.toDouble() / 100.0)
            calNumber = "" + cal_floatResult
            Cal_result.setText(calNumber)
        }
        Cal_sign.setOnClickListener {
            if (calNumber.toInt() > 0) {
                calNumber = "-" + calNumber
            }else{
                calNumber = ((-1) * calNumber.toInt()).toString()
            }
            Cal_result.setText(calNumber)
        }
        Cal_C.setOnClickListener {
            calNumber = "0"
            Cal_result.setText(calNumber)
        }
        Cal_equal.setOnClickListener {
            when (cal_operator) {
                "+" -> {
                    cal_result = cal_operand + calNumber.toInt()
                    calNumber = "" + cal_result
                }
                "-" -> {
                    cal_result = cal_operand - calNumber.toInt()
                    calNumber = "" + cal_result
                }
                "*" -> {
                    cal_result = cal_operand * calNumber.toInt()
                    calNumber = "" + cal_result
                }
                "/" -> {cal_floatResult = cal_operand.toDouble() / calNumber.toDouble()
                    calNumber = "" + cal_floatResult
                }
            }

            Cal_result.setText(calNumber)
        }


    }
}