package com.example.pageflipper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class browse : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_browse)
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        recyclerview.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<ItemsViewModel>()
        val ra = listOf("Vistas", "Accountancy P-1", "Accountancy P-2", "Chemistry P-1", "Chemistry P-2","Maths P-1","Maths P-2","Physics P-1","Physics P-2","Economics","Hornbill", "Accountancy P-1", "Accountancy P-2", "Chemistry P-1", "Chemistry P-2","Maths","Physics P-1","Physics P-2","Economics")

        for (i in ra) {
            data.add(ItemsViewModel(i.toString(), R.drawable.book1))
        }
        val adapter = CustomAdapter(data) { view ->
        }
        recyclerview.adapter = adapter
    }
}