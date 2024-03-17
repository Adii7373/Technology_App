package com.example.technologyapp // Ensure correct package name

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn = findViewById<Button>(R.id.next_btn)

        btn.setOnClickListener {
            val intent = Intent(this,CardViewActivity::class.java)

            startActivity(intent)
        }




        }
    }