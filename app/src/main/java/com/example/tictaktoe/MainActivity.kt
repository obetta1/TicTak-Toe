package com.example.tictaktoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var enter_button:ImageView = findViewById(R.id.enter_button)
        var text :TextView = findViewById(R.id.textView)

        enter_button.setOnClickListener {
            text.text = "Benjmain"

        }
    }
}