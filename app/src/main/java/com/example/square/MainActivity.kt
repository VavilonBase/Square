package com.example.square

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    private lateinit var inputA: EditText
    private lateinit var inputB: EditText
    private lateinit var inputC: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputA = findViewById(R.id.editTextInputA)
        inputB = findViewById(R.id.editTextInputB)
        inputC = findViewById(R.id.editTextInputC)
    }

    fun onClickButton(view: View) {
        if (inputA.text.isEmpty()) {
            val toast = Toast.makeText(this, "Введите коэффициент a", Toast.LENGTH_LONG)
            toast.show()
        } else if (inputB.text.isEmpty()){
            val toast = Toast.makeText(this, "Введите коэффициент b", Toast.LENGTH_LONG)
            toast.show()
        } else if (inputC.text.isEmpty()) {
            val toast = Toast.makeText(this, "Введите коэффициент c", Toast.LENGTH_LONG)
            toast.show()
        } else {
            val a = inputA.text.toString().toDouble()
            val b = inputB.text.toString().toDouble()
            val c = inputC.text.toString().toDouble()
            val D = b.pow(2) - 4 * a * c
            if (D < 0) {
                val toast = Toast.makeText(this, "Нет действительных корней", Toast.LENGTH_LONG)
                toast.show()
            } else if (D == 0.0) {
                val x = -b / (2 * a)
                val toast = Toast.makeText(this, "Единственный корень: $x", Toast.LENGTH_LONG)
                toast.show()
            } else {
                val x1 = (-b + D.pow(0.5)) / (2 * a)
                val x2 = (-b - D.pow(0.5)) / (2 * a)
                val toast = Toast.makeText(this, "Корень 1: ${x1}\nКорень 2: $x2", Toast.LENGTH_LONG)
                toast.show()
            }
        }

    }
}