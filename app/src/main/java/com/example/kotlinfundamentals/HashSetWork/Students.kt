package com.example.kotlinfundamentals.HashSetWork

class Students (var no:Int,var name:String,var classs:String) {

    override fun hashCode(): Int {
        return this.no
    }

    override fun equals(other: Any?): Boolean {
        if(this.no == (other as Students).no)//Downcasting
             {
           return true
        }
        else{
            return false
        }
    }
}