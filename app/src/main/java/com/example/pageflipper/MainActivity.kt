package com.example.pageflipper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button1 = findViewById<Button>(R.id.button3)
        button1.setOnClickListener {
            val intent = Intent(this, browse::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.button4)
        button2.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}