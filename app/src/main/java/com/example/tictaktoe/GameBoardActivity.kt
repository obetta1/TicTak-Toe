package com.example.tictaktoe

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_game_board.*

class GameBoardActivity : AppCompatActivity() {

    lateinit var playerName1 : String
    lateinit var playerName2 :String

    var player1 = arrayListOf<Int>()
    var player2 = arrayListOf<Int>()
    var activePlayer = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_board)

         val bundle :Bundle? =   intent.extras
       val pl = intent.getStringExtra("player1")
       var pl2 = intent.getStringExtra("player2")

        playerName1 = pl.toString()
        playerName2 = pl2.toString()

    }


    fun btnClicked(view: View) {
        var btnSelected = view as Button
        var cellId = 0

        when(btnSelected){
        button1 -> cellId = 1
        button2->  cellId = 2
        button3 -> cellId = 3
        button4 -> cellId = 4
        button5 -> cellId = 5
        button6 -> cellId = 6
        button7 -> cellId = 7
        button8 -> cellId = 8
        button9 -> cellId = 9
        }

        playGame(cellId, btnSelected )

    }


    private fun playGame(cellId: Int, btnSelected: Button) {
         if (activePlayer == 1){
             player1.add(cellId)
             btnSelected.setBackgroundColor(Color.parseColor("#2ff44f"))
             btnSelected.text = "X"
             activePlayer = 2

         }else{
             player2.add(cellId)
             btnSelected.setBackgroundColor(Color.parseColor("#ffffff"))
             btnSelected.text = "O"

             activePlayer = 1
         }
    btnSelected.isEnabled = false


        if (player1.contains(1) && player1.contains(2) && player1.contains(3)) {
            Toast.makeText(
                this,
                " congratulations!, $playerName1  have won the game ",
                Toast.LENGTH_SHORT
            ).show()

        }
        if (player1.contains(4) && player1.contains(5) && player1.contains(6)) {
            Toast.makeText(
                this,
                " congratulations!, $playerName1  have won the game ",
                Toast.LENGTH_SHORT
            ).show()
        }
        if (player1.contains(7) && player1.contains(8) && player1.contains(9)) {
            Toast.makeText(
                this,
                " congratulations!, $playerName1  have won the game ",
                Toast.LENGTH_SHORT
            ).show()
        }
        if (player1.contains(1) && player1.contains(4) && player1.contains(7)) {
            Toast.makeText(
                this,
                " congratulations!, $playerName1  have won the game ",
                Toast.LENGTH_SHORT
            ).show()
        }
        if (player1.contains(2) && player1.contains(5) && player1.contains(8)) {
            Toast.makeText(
                this,
                " congratulations!, $playerName1  have won the game ",
                Toast.LENGTH_SHORT
            ).show()
        }
        if (player1.contains(3) && player1.contains(6) && player1.contains(9)) {
            Toast.makeText(
                this,
                " congratulations!, $playerName1  have won the game ",
                Toast.LENGTH_SHORT
            ).show()
        }
        if (player1.contains(1) && player1.contains(5) && player1.contains(9)) {
            Toast.makeText(
                this,
                " congratulations!, $playerName1  have won the game ",
                Toast.LENGTH_SHORT
            ).show()
        }
        if (player1.contains(3) && player1.contains(5) && player1.contains(7)) {
            Toast.makeText(
                this,
                " congratulations!, $playerName1  have won the game ",
                Toast.LENGTH_SHORT
            ).show()

        }


        if (player2.contains(1) && player2.contains(2) && player2.contains(3)) {
            Toast.makeText(
                this,
                " congratulations!, $playerName2  have won the game ",
                Toast.LENGTH_SHORT
            ).show()
            finish()
        }
        if (player2.contains(4) && player2.contains(5) && player2.contains(6)) {
            Toast.makeText(
                this,
                " congratulations!, $playerName2  have won the game ",
                Toast.LENGTH_SHORT
            ).show()
        }
        if (player2.contains(7) && player2.contains(8) && player2.contains(9)) {
            Toast.makeText(
                this,
                " congratulations!, $playerName2  have won the game ",
                Toast.LENGTH_SHORT
            ).show()
        }
        if (player2.contains(1) && player2.contains(4) && player2.contains(7)) {
            Toast.makeText(
                this,
                " congratulations!, $playerName2  have won the game ",
                Toast.LENGTH_SHORT
            ).show()
        }
        if (player2.contains(2) && player2.contains(5) && player2.contains(8)) {
            Toast.makeText(
                this,
                " congratulations!, $playerName2  have won the game ",
                Toast.LENGTH_SHORT
            ).show()
        }
        if (player2.contains(3) && player2.contains(6) && player2.contains(9)) {
            Toast.makeText(
                this,
                " congratulations!, $playerName2  have won the game ",
                Toast.LENGTH_SHORT
            ).show()
        }
        if (player2.contains(1) && player2.contains(5) && player2.contains(9)) {
            Toast.makeText(
                this,
                " congratulations!, $playerName2  have won the game ",
                Toast.LENGTH_SHORT
            ).show()
        }
        if (player2.contains(3) && player2.contains(5) && player2.contains(7)) {
            Toast.makeText(
                this,
                " congratulations!, $playerName2  have won the game ",
                Toast.LENGTH_SHORT
            ).show()
        }


    }
}