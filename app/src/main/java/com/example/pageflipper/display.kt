package com.example.pageflipper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class display : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)
        val value = intent.getStringExtra("key").toString()
        val image = findViewById<ImageView>(R.id.imageView2)
        val description = findViewById<TextView>(R.id.textView2)

        // Set image resource
        image.setImageResource(R.drawable.book1)

        // Set text for description
        description.text = "The NCERT (National Council of Educational Research and Training) "+value+ " is an essential resource designed for students studying chemistry at the senior secondary level in India. This book is part of the curriculum prescribed by the Central Board of Secondary Education (CBSE) and various state boards across the country. It aims to provide a comprehensive understanding of the fundamental principles, concepts, and applications of chemistry.\n"

        val button1 = findViewById<Button>(R.id.button)
        button1.setOnClickListener {
            val intent = Intent(this, pdfdisp::class.java)
            startActivity(intent)
        }
    }
}