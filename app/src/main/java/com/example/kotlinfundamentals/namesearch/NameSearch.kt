package com.example.kotlinfundamentals.namesearch

import java.util.*

fun main(){

    val entry=Scanner(System.`in`)
    val names=ArrayList<String>()

    names.add("Kaan")
    names.add("Mehmet")
    names.add("Zeynep")
    names.add("Sedat")
    names.add("Bahar")

    println("Enter a name for search:")
    val name = entry.next()

    for(i in names){
        if(i==name){
            println("True.The name is contains.")
            break
        }
        else{
            println("False.The name is not contains.")
            break
        }
    }
}