package com.example.kotlinfundamentals.randomnumber

import kotlin.random.Random

fun main(){
    val numbers=ArrayList<Int>()

    for(i in 1..100){
        val randomNumber = Random.nextInt(0,101)//produce number under the 101
        numbers.add(randomNumber)
    }
    numbers.sort()
    for ( n in numbers){
        println("Numbers : $n")
    }
}