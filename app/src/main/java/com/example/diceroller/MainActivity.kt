package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val rollButton: Button = findViewById(R.id.button)
            rollButton.setOnClickListener {
                val resultTextView: TextView = findViewById(R.id)
                resultTextView.text = "6"

                class Dice(val numSides: Int) {

                    fun roll(): Int {
                        return (1..numSides).random()
                    }
                }
                 fun rollDice() {
                    // Create new Dice object with 6 sides and roll it
                    val dice = Dice(6)
                    val diceRoll = dice.roll()

                    // Update the screen with the dice roll
                    val resultTextView: TextView = findViewById(R.id.textView)
                    resultTextView.text = diceRoll.toString()

                     }
                fun main() {
                         val num = 4
                         if (num > 4) {
                             println("The variable is greater than 4")
                         } else if (num == 4) {
                             println("The variable is equal to 4")
                         } else {
                             println("The variable is less than 4")
                         }
                     fun main() {
                             val myFirstDice = Dice(6)
                             val rollResult = myFirstDice.roll()
                             println("Your ${myFirstDice.numSides} sided dice rolled ${rollResult}!")
                         }

                         class Dice (val numSides: Int) {

                             fun roll(): Int {
                                 return (1..numSides).random()
                             }
                             fun main() {
                                 val myFirstDice = Dice(6)
                                 val rollResult = myFirstDice.roll()
                                 val luckyNumber = 4

                                 if (rollResult == luckyNumber) {
                                     println("You win!")
                                 } else if (rollResult == 1) {
                                     println("So sorry! You rolled a 1. Try again!")
                                 } else if (rollResult == 2) {
                                     println("Sadly, you rolled a 2. Try again!")
                                 } else if (rollResult == 3) {
                                     println("Unfortunately, you rolled a 3. Try again!")
                                 } else if (rollResult == 5) {
                                     println("Don't cry! You rolled a 5. Try again!")
                                 } else {
                                     println("Apologies! You rolled a 6. Try again!")
                                 }
                             fun main() {
                                 val myFirstDice = Dice(6)
                                 val rollResult = myFirstDice.roll()
                                 val luckyNumber = 4

                                 when (rollResult) {
                                     luckyNumber -> println("You won!")
                                     1 -> println("So sorry! You rolled a 1. Try again!")
                                     2 -> println("Sadly, you rolled a 2. Try again!")
                                     3 -> println("Unfortunately, you rolled a 3. Try again!")
                                     5 -> println("Don't cry! You rolled a 5. Try again!")
                                     6 -> println("Apologies! You rolled a 6. Try again!")
                                 }
                             fun main() {
                             val myFirstDice = Dice(6)
                             val rollResult = myFirstDice.roll()
                             val luckyNumber = 4

                             when (rollResult) {
                                 luckyNumber -> println("You won!")
                                 1 -> println("So sorry! You rolled a 1. Try again!")
                                 2 -> println("Sadly, you rolled a 2. Try again!")
                                 3 -> println("Unfortunately, you rolled a 3. Try again!")
                                 5 -> println("Don't cry! You rolled a 5. Try again!")
                                 6 -> println("Apologies! You rolled a 6. Try again!")
                             }
                         }

                         class Dice(val numSides: Int) {
                             fun roll(): Int {
                                 return (1..numSides).random()
                             }
                             private fun rollDice() {
                                 val dice = Dice(6)
                                 val diceRoll = dice.roll()

                                 val diceImage: ImageView = findViewById(R.id.imageView)

                                 when (diceRoll) {
                                     1 -> diceImage.setImageResource(R.drawable.dice_1)
                                     2 -> diceImage.setImageResource(R.drawable.dice_2)
                                     3 -> diceImage.setImageResource(R.drawable.dice_3)
                                     4 -> diceImage.setImageResource(R.drawable.dice_4)
                                     5 -> diceImage.setImageResource(R.drawable.dice_5)
                                     6 -> diceImage.setImageResource(R.drawable.dice_6)
                                 }
                                 val drawableResource = when (diceRoll) {
                                     1 -> R.drawable.dice_1
                                     2 -> R.drawable.dice_2
                                     3 -> R.drawable.dice_3
                                     4 -> R.drawable.dice_4
                                     5 -> R.drawable.dice_5
                                     else -> R.drawable.dice_6
                                 }

                                 diceImage.setImageResource(drawableResource)
                             }
                             override fun onCreate(savedInstanceState: Bundle?) {
                                 super.onCreate(savedInstanceState)
                                 setContentView(R.layout.activity_main)

                                 val rollButton: Button = findViewById(R.id.button)
                                 rollButton.setOnClickListener { rollDice() }

                                 // Do a dice roll when the app starts
                                 rollDice()
                             }
                             /**
                              * Roll the dice and update the screen with the result.
                              */
                             private fun rollDice() {
                                 // Create new Dice object with 6 sides and roll the dice
                                 val dice = Dice(6)
                                 val diceRoll = dice.roll()

                                 // Find the ImageView in the layout
                                 val diceImage: ImageView = findViewById(R.id.imageView)

                                 // Determine which drawable resource ID to use based on the dice roll
                                 val drawableResource = when (diceRoll) {
                                     1 -> R.drawable.dice_1
                                     2 -> R.drawable.dice_2
                                     3 -> R.drawable.dice_3
                                     4 -> R.drawable.dice_4
                                     5 -> R.drawable.dice_5
                                     else -> R.drawable.dice_6
                                 }

                                 // Update the ImageView with the correct drawable resource ID
                                 diceImage.setImageResource(drawableResource)

                                 // Update the content description
                                 diceImage.contentDescription = diceRoll.toString()
                             }


            }
        }
    }