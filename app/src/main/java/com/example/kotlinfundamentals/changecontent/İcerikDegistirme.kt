package com.example.kotlinfundamentals.changecontent

import kotlin.collections.ArrayList

fun main(){
     val numbers=ArrayList<Int>()
     numbers.add(1)
     numbers.add(2)
     numbers.add(3)
     numbers.add(4)
     numbers.add(5)

     for((index,number) in numbers.withIndex()){
         val result = number*2
         numbers[index]= result

     }

     for (i in numbers){
         println(i)
     }
 }