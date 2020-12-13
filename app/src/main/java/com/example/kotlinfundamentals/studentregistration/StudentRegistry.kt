package com.example.kotlinfundamentals.studentregistration

import java.util.*

fun main(){
    val entry=Scanner(System.`in`)
    var index = 1
    val studentArrayList =ArrayList<Students>()
    while(true){

        println("Enter the name of Student")
        val name = entry.next()
        println("Enter the class of Student")
        val studentOfClass=entry.next()

        val newStudent = Students(index,name,studentOfClass)
        index+=1
        studentArrayList.add(newStudent)


        println("For exit (1) - For Resume (Another Numbers)")
        val exit=entry.nextInt()
        if(exit == 1){
            for(student in studentArrayList){
                println("*********")
                println("Student no : ${student.no} - Student name : ${student.name} - Student Class : ${student.numberOfClass}")
            }
            println("Logout.")
            break
        }










    }
}