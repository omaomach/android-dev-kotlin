package com.omao.hellokotlin

class Car(var brand:String, var model:Int, var colour:String): Vehicle() {

    override var name = "Mitsubishi Lancer"
    override var engine = "v8"
    override var wheels = 8;

    // Attributes/property - these are basically variables that belong to a class
    // Functions - these are the behaviours that we specify for a class

    fun drive() {
        println("I am driving")
    }

    fun brake() {
        println("I am braking")
    }

}