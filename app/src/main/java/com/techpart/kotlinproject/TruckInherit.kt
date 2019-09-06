package com.techpart.kotlinproject

class TruckInherit(make: String, model: String, val towingCapacity: Int) : Vehicle(make, model) {
    fun tow() {
        println("head out to the mountais")
    }
}