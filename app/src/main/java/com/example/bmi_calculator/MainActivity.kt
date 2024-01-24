package com.example.bmi_calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getwegiht=findViewById<TextView>(R.id.weight)
        val getheigt=findViewById<TextView>(R.id.height)
        val getcalbutton=findViewById<Button>(R.id.calculator)
        val getresult=findViewById<TextView>(R.id.result)
        val getdiscrption=findViewById<TextView>(R.id.discription)

getcalbutton.setOnClickListener {

    val inputweight=getwegiht.text.toString().toDouble()
    val inputheight=getheigt.text.toString().toInt()

    val ans=inputweight/inputheight/inputheight*10000
     getresult.text= ans.toString()

    if(inputheight==0) {
        Toast.makeText(
            this@MainActivity,
            "please enter height",
            Toast.LENGTH_LONG
        ).show()
    }
                if(ans==18.5){
                  getdiscrption.text="Underweight"
            }
                 else if(ans>18.5&&ans<=24.9){
                getdiscrption.text="Normal weight"
            }
                else if(ans>=25.0&&ans<=209.9){
                 getdiscrption.text="Over Weight"
            }
    else if(ans>=30.0&&ans<=34.9){
              getdiscrption.text="Moderately Obese"
    }
    else if(ans>=35.0&&ans<=39.9){
            getdiscrption.text="Severely Obese"
    }
    else if(ans>=40.0){
    getdiscrption.text="Morbidly Obese"
    }
}
    }
}