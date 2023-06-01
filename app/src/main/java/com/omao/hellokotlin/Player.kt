package com.omao.hellokotlin

class Player: Person {
    constructor(name: String, age: Int, jersey: Int): super(name, age) {
        println("$name's jersey numnber is $jersey" )
    }

}