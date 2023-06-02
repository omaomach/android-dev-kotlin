package com.omao.hellokotlin

fun main() {

//    var teacher = Teacher()
//    var businessman = Businessman("William", 47);
//    var player = Player("Joash", 24, 1);
//    var person = Person()

//    player.walk()

//    var vehicle1 = Vehicle()
//    vehicle1.name = "Omao"
//    var car1 = Car("Mitsubishi", 2022, "blue")
//    println(car1.name)
//    println(vehicle1.name)
//    println(car1.wheels)
//
//    var rental1 = Rental()
//    rental1.number = 10
//    rental1.displayGreetings()
//
//    var joash = Christian()
//    println(joash.religion)
//
//    var inner = Outer.Inner()
//    print(inner.level)

    // Immutable list - supports only read only functionalities and its elements can't be modified
//    val immutableList1 = listOf<Int>(2,5,4)
//    for (item in immutableList1) {
//        println(item)
//    }

    //Mutable lists - supports both read and write functionalities
    var mutableList = mutableListOf<String>("Joash", "Joel", "Faith", "Gloria", "Joshua")
    mutableList[0] = "Omao"
    mutableList.add(5, "Alice")
    for (items in mutableList) {
        println(items)
    }
    println(mutableList)

}