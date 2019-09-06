package com.techpart.kotlinproject

class Car constructor(val make: String, val model: String, val color: String) {
    fun acclerate() {
        println("Broom")
    }

    fun details() {
        println("this is a $color $make $model")
    }
}