package com.example.rockpaperscissor

fun main(){

    var computerChoice = ""
    var yourChoice = ""

    println("Rock, Paper or Scissors? Please enter your choice")
    yourChoice = readln()

    val randomNumber = (1..3).random()

    when (randomNumber) {
        1 -> {
            computerChoice = "ROCK"
        }
        2 -> {
            computerChoice = "PAPER"
        }
        else -> {
            computerChoice = "SCISSOR"
        }
    }

    println(computerChoice)

    val winner = when{
        computerChoice == yourChoice -> "TIE"
        computerChoice == "ROCK" && yourChoice == "PAPER" -> "PLAYER"
        computerChoice == "PAPER" && yourChoice == "SCISSOR" -> "PLAYER"
        computerChoice == "SCISSOR" && yourChoice == "ROCK" -> "PLAYER"
        else -> "COMPUTER"
    }

    println("The winner is $winner!!!")

}