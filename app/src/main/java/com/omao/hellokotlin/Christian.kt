package com.omao.hellokotlin

class Christian() : Church {

    override var religion: String = "Christianity"

    override fun worshipGod() {
        println("Christians believe in one God")
    }
}