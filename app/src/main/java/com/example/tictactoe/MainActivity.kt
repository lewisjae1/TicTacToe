package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)

        val buttons = arrayOf(button1, button2, button3, button4, button5,
                                button6, button7, button8, button9)

        val winWays = arrayOf(arrayOf(button1, button2, button3), arrayOf(button4, button5, button6),
                                arrayOf(button7, button8, button9), arrayOf(button1, button4, button7),
                                arrayOf(button2, button5, button8), arrayOf(button3, button6, button9),
                                arrayOf(button1, button5, button9), arrayOf(button3, button5, button7))

        for(button in buttons){
            buttonOnClick(button)
        }

        val newGameButton = findViewById<Button>(R.id.New_Game)
        newGameButton.setOnClickListener {
            for(button in buttons){
                buttonReset(button)
            }

            val turn = findViewById<TextView>(R.id.PlayerTurn)
            turn.text = "Player X's Turn"
        }
    }

    private fun buttonReset(button: Button) {
        button.text = ""
        button.isClickable = true
    }

    private fun buttonOnClick(button:Button) {
        val turn = findViewById<TextView>(R.id.PlayerTurn)
        turn.text = "Player X's Turn"

        button.setOnClickListener {
            if(turn.text == "Player X's Turn"){
                button.text = "X"

                turn.text = "Player O's Turn"
            }
            else if(turn.text == "Player O's Turn"){
                button.text = "O"

                turn.text = "Player X's Turn"
            }

            button.isClickable = false
        }
    }
}