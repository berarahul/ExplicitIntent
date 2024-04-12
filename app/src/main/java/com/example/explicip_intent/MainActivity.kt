package com.example.explicip_intent

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickbutton=findViewById<Button>(R.id.clickbutton)

        clickbutton.setOnClickListener{

                  intent=Intent(applicationContext,SeconedActivity::class.java)
            startActivity(intent)
        }

    }
}