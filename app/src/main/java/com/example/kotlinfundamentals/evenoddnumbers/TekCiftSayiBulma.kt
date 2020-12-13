package com.example.kotlinfundamentals.evenoddnumbers

fun main(){
    val numbers = ArrayList<Int>()
    numbers.add(31)
    numbers.add(3)
    numbers.add(5)
    numbers.add(23)
    numbers.add(6)
    numbers.add(11)
    numbers.add(99)
    numbers.add(7)
    numbers.add(44)

    val oddNumbers = ArrayList<Int>()
    val evenNumbers = ArrayList<Int>()

    for (i in numbers){
        val result= i % 2
        if(result == 0){
            evenNumbers.add(i)
        }
        if(result == 1){
            oddNumbers.add(i)
        }
    }

    println("************")
    println("Even Numbers")

    for (evennumber in numbers) {
        println("Evens :$evennumber")
    }

    println("************")
    println("Odd Numbers")

    for (oddnumber in numbers) {
        println("Odds : $oddnumber")
    }
}