package com.omao.hellokotlin

class Rental: House() {
    override fun displayGreetings() {
        println("Welcome to house number: $number")
    }

}