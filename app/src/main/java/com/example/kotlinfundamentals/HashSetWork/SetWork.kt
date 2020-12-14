package com.example.kotlinfundamentals.HashSetWork

fun main(){

    val o1 = Students(1,"Kaan","12a")
    val o2 = Students(2,"Zeynep","11b")
    val o3 = Students(3,"Ceren","10c")
    val o4 = Students(4,"Semih","9b")
    val student = HashSet<Students>()

    student.add(o1)
    student.add(o2)
    student.add(o3)
    student.add(o4)

    for (s in student){
        println("************")
        println("Student no : ${s.no}")
        println("Student name : ${s.name}")
        println("Student class : ${s.classs}")

    }
}