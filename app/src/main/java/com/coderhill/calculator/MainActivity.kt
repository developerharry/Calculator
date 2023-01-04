package com.coderhill.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberOne: Button = findViewById(R.id.bu1)
        val numberTwo: Button = findViewById(R.id.bu2)
        val numberThree: Button = findViewById(R.id.bu3)
        val numberFour: Button = findViewById(R.id.bu4)
        val numberFive: Button = findViewById(R.id.bu5)
        val numberSix: Button = findViewById(R.id.bu6)
        val numberSeven: Button = findViewById(R.id.bu7)
        val numberEight: Button = findViewById(R.id.bu8)
        val numberNine: Button = findViewById(R.id.bu9)
        val numberZero: Button = findViewById(R.id.buZero)
        val numberPlus: Button = findViewById(R.id.buPlus)
        val numberMinus: Button = findViewById(R.id.buMinus)
        val numberMultiply: Button = findViewById(R.id.buStar)
        val numberDivide: Button = findViewById(R.id.buDivide)
        val numberPoint: Button = findViewById(R.id.buPoint)
        val numberClear: Button = findViewById(R.id.buAc)
        val numberCancel: Button = findViewById(R.id.buDelete)
        val numberEqual: Button = findViewById(R.id.buAnswer)
        val etNumber: TextView = findViewById(R.id.etShowNumber)
        val tvResult: TextView = findViewById(R.id.tvresult)
        val bracOpen: TextView = findViewById(R.id.buBracOpen)
        val bracClose: TextView = findViewById(R.id.buBracClose)


        numberOne.setOnClickListener {
            etNumber.text = (etNumber.text.toString() + "1")
        }
        numberTwo.setOnClickListener {
            etNumber.text = (etNumber.text.toString() + "2")
        }
        numberThree.setOnClickListener {
            etNumber.text = (etNumber.text.toString() + "3")
        }
        numberFour.setOnClickListener {
            etNumber.text = (etNumber.text.toString() + "4")
        }
        numberFive.setOnClickListener {
            etNumber.text = (etNumber.text.toString() + "5")
        }
        numberSix.setOnClickListener {
            etNumber.text = (etNumber.text.toString() + "6")
        }
        numberSeven.setOnClickListener {
            etNumber.text = (etNumber.text.toString() + "7")
        }
        numberEight.setOnClickListener {
            etNumber.text = (etNumber.text.toString() + "8")
        }
        numberNine.setOnClickListener {
            etNumber.text = (etNumber.text.toString() + "9")
        }
        numberZero.setOnClickListener {
            etNumber.text = (etNumber.text.toString() + "0")
        }
        numberPoint.setOnClickListener {
            etNumber.text = (etNumber.text.toString() + ".")
        }
        numberPlus.setOnClickListener {
            etNumber.text = (etNumber.text.toString() + "+")
        }
        numberMinus.setOnClickListener {
            etNumber.text = (etNumber.text.toString() + "-")
        }
        numberMultiply.setOnClickListener {
            etNumber.text = (etNumber.text.toString() + "*")
        }
        numberDivide.setOnClickListener {
            etNumber.text = (etNumber.text.toString() + "/")
        }
        bracOpen.setOnClickListener {
            etNumber.text = (etNumber.text.toString() + "(")
        }
        bracClose.setOnClickListener {
            etNumber.text = (etNumber.text.toString() + ")")
        }
        numberEqual.setOnClickListener {
            val str: String = etNumber.text.toString()

            var result = ""
            try {
                val expression = ExpressionBuilder(str).build()
                result = expression.evaluate().toString()
            }catch (e:IllegalArgumentException){
                val errorToast = Toast.makeText(applicationContext, "Invalid Statement", Toast.LENGTH_SHORT)
                errorToast.setGravity(Gravity.CENTER_VERTICAL,0,0)
                errorToast.show()
            }
            tvResult.text = result.toString()



        }
        numberClear.setOnClickListener {
            etNumber.setText(null)
            tvResult.setText(null)
        }
        numberCancel.setOnClickListener {
            val num: String = etNumber.text.toString()
            if(num.isNotEmpty()){
                etNumber.text = num.dropLast(1)
            }
        }
    }






}