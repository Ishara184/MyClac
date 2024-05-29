package com.example.myclac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.myclac.Models.Calculator

class MainActivity : AppCompatActivity() {

    lateinit var editNumber1:EditText
    lateinit var editNumber2:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // assign pre defined numbers to user entering numbers
        editNumber1 = findViewById(R.id.editNumber1)
        editNumber2 = findViewById(R.id.editNumber2)
    }

    fun buttonClick(v: View){
        //create variable to store the answer
        var ans = 0.0

        //call the constructor
        var calculator = Calculator(editNumber1.text.toString().toDouble(), editNumber2.text.toString().toDouble())

        when(v.id){
            R.id.btnAdd -> ans = calculator.addition()
            R.id.btnMin -> ans = calculator.subtraction()
            R.id.btnMultiply -> ans = calculator.multiplication()
            R.id.btnDivide -> ans = calculator.division()
        }

        Toast.makeText(this,"Answer $ans", Toast.LENGTH_LONG).show()

    }
}