package com.omao.hellokotlin

fun main() {

//    var teacher = Teacher()
//    var businessman = Businessman("William", 47);
//    var player = Player("Joash", 24, 1);
//    var person = Person()

//    player.walk()

    var vehicle1 = Vehicle()
    vehicle1.name = "Omao"
    var car1 = Car("Mitsubishi", 2022, "blue")
    println(car1.name)
    println(vehicle1.name)
    println(car1.wheels)

    var rental1 = Rental()
    rental1.number = 10
    rental1.displayGreetings()

}