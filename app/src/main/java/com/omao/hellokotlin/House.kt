package com.omao.hellokotlin

abstract class House {
    var number = 8

    fun displayNumber() {
        println("This is house number $number")
    }
    abstract fun displayGreetings()

}