package com.example.kotlinfundamentals.hashmap

fun main(){
    val s1=Students(1,"Kaan","12b")
    val s2=Students(2,"Zeynep","12c")
    val s3=Students(3,"Ceyda","12k")

    val student=HashMap<Int,Students>()

    student.put(s1.no,s1)
    student.put(s2.no,s2)
    student.put(s3.no,s3)

    for ((no,obj) in student){
        println("**********************")
        println("Student no : $no")
        println("Student name: ${obj.name}")
        println("Student class: ${obj.classs}")
    }
}