package com.techpart.kotlinproject

open class Vehicle(val make: String, val model: String) {
    open fun acelerate() {
        println("Broom broom")
    }

    fun park() {
        println("parking vechicle")
    }

    fun brake() {
        println("Stop")
    }


}
