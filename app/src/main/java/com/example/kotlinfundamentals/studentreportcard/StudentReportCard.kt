package com.example.kotlinfundamentals.studentreportcard

import java.util.*

fun main(){
    val entry=Scanner(System.`in`)
    val noteArrayList = ArrayList<LectureNotes>()

    while (true) {
        println("Enter the name of Lesson:")
        val lecture=entry.next()
        println("Enter the note of Lesson:")
        val note=entry.nextInt()

        val newNote = LectureNotes(lecture,note)
        noteArrayList.add(newNote)


        println("For exit (1) - For Resume (Another Numbers)")
        val exit = entry.nextInt()
        if (exit == 1) {
            var total = 0
            for (ln in noteArrayList){
                println("${ln.lecture}:${ln.note}")
                total+=ln.note

            }
            val average = total / noteArrayList.size
            println("Average : $average")
            if(average > 50){
                println("Pass")
            }
            if(average < 50){
                println("Failed")
            }
            println("Logout.")
            break
        }
    }
}