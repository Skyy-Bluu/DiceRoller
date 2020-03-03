package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        val resultText: TextView = findViewById(R.id.result_text)
        rollButton.setOnClickListener { rollDice(resultText) }
        val countButton:Button = findViewById(R.id.count_up_button)
        countButton.setOnClickListener { countUp(resultText) }
        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { reset(resultText) }
    }

    private fun rollDice(resultText:TextView){
        val randomInt = (1..6).random()
        Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show()
        resultText.text = randomInt.toString()
    }

    private fun countUp(resultText:TextView){
        //val resultText: TextView = findViewById(R.id.result_text)

        if(resultText.text != "Hello World!" && resultText.text != "6"){
            resultText.text = (resultText.text.toString().toInt() +1).toString()
        }
    }

    private fun reset(resultText:TextView){
        resultText.text = "0"
    }
}
