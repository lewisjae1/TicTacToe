package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newGameButton = findViewById<Button>(R.id.New_Game)
        newGameButton.setOnClickListener {
            recreate();
        }

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)

    }

    private fun buttonOnClick(button:Button) {
        val turn = findViewById<TextView>(R.id.PlayerTurn)

        button.setOnClickListener {
            if(turn.text == "Player X's Turn"){
                button.text == "X"

                turn.text = "Player O's Turn"
            }
            else if(turn.text == "Player O's Turn"){
                button.text = "O"

                turn.text = "Player'X turn"
            }

            button.isClickable = false
        }
    }
}