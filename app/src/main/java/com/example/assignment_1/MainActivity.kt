package com.example.assignment_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickMeRed=findViewById<TextView>(R.id.ClickRed)
        val clickMeBlue=findViewById<TextView>(R.id.ClickBlue)
        val clickMeGreen=findViewById<TextView>(R.id.ClickGreen)
        val finalValue=findViewById<TextView>(R.id.ClickText)

        clickMeRed.setOnClickListener{
            finalValue.text="Red was Clicked"
        }
        clickMeBlue.setOnClickListener{
            finalValue.text="Blue was Clicked"
        }
        clickMeGreen.setOnClickListener {
            finalValue.text = "Green was Clicked"
        }
    }
}