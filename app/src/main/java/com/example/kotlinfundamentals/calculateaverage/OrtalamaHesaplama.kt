package com.example.kotlinfundamentals.calculateaverage

fun main(){

    val numbers = ArrayList<Int>()

    numbers.add(30)
    numbers.add(20)
    numbers.add(50)
    numbers.add(70)
    numbers.add(100)
    numbers.add(60)

    var  total = 0

    for (i in numbers){
        total+=i
    }

    println("Average : ${total  / numbers.size}")

}