package com.example.kotlinfundamentals.composition

import java.util.*

fun main(){

    val entry = Scanner(System.`in`)
    val personels = ArrayList<Personel>()

    for (i in 1..5){
        println("$i.Personel Name:")
        val name=entry.next()

        println("$i. Personel adress province:")
        val province=entry.next()

        println("$i. Personel adress district:")
        val district=entry.next()

        val adress= Adress(province, district)
        val personel = Personel(i,name,adress)

        personels.add(personel)

    }

    for (p in personels) {
        println("*************")
        println("Personel  no : ${p.no} - Personel Name : ${p.name} - Personel Adress Province : ${p.address.province} " +
                "- Personel Adress District : ${p.address.district}")
    }


}