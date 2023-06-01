package com.omao.hellokotlin

interface Church {
    var religion: String

    fun worshipGod()
    fun respectGod() {
        println("All religions must respect God")
    }
}