package com.techpart.kotlinproject

class Truck(val make: String, val model: String, val towingCapacity: Int) {
    fun tow() {
        println("taking the horses to the rodeo")
    }

    fun details() {
        println("the $make $model has a towing capacity $towingCapacity")
    }
}