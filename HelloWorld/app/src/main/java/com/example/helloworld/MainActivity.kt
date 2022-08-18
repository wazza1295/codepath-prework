package com.example.helloworld

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.res.TypedArrayUtils.getText


//This is kotlin file where we handle user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            Log.i("Waseem","Tapped button 1")

            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            Log.i("Waseem","Tapped the button 2")

            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.purple_200))
        }

        findViewById<Button>(R.id.button3).setOnClickListener {
            Log.i("Waseem","tapped Button 3")

            findViewById<TextView>(R.id.textView)

        }
        //Display customized text to show "Hello from {name}"
    }
}