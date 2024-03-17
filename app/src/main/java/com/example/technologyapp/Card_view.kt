package com.example.technologyapp

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView

class CardViewActivity : AppCompatActivity() { // Use CamelCase for class name

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_view)


        val card = findViewById<CardView>(R.id.ai_card)

        card.setOnClickListener {
            val intent = Intent(this, Artificial_intelligence::class.java)
            startActivity(intent)
        }


        val android = findViewById<CardView>(R.id.Android_knowldge)

        android.setOnClickListener {
            val intent = Intent(this, Android_knowledge::class.java)

            startActivity(intent)
        }

        val machine = findViewById<CardView>(R.id.Machine_learning)

        machine.setOnClickListener {
            val intent = Intent(this, Machine_learning::class.java)

            startActivity(intent)
        }

        val robots = findViewById<CardView>(R.id.Robotics)

        robots.setOnClickListener {
            val intent = Intent(this, Robotics::class.java)

            startActivity(intent)
        }

        val data_science = findViewById<CardView>(R.id.datascience)

        data_science.setOnClickListener {
            val intent = Intent(this, Data_science::class.java)

            startActivity(intent)
        }


        val automotoin = findViewById<CardView>(R.id.Automation)

        automotoin.setOnClickListener {
            val intent = Intent(this, Automation::class.java)

            startActivity(intent)
        }


     val fbtn = findViewById<Button>(R.id.feedback)

        fbtn.setOnClickListener {
            val intent = Intent(this,feedback_name::class.java)

            startActivity(intent)
        }



    }
}
