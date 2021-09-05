package com.example.tictaktoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)
             var enter_button:ImageView = findViewById(R.id.enter_button)


        enter_button.setOnClickListener {
            var intent = Intent(this, GameBoardActivity::class.java).apply {
                putExtra("player1", playerName1.text.toString())
                putExtra("player2", playerName2.text.toString())
            }
            startActivity(intent)

        }
    }
}