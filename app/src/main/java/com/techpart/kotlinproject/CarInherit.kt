package com.techpart.kotlinproject

class CarInherit(make: String, model: String, var color: String) : Vehicle(make, model) {
    override fun acelerate() {
        super.acelerate()
        println("we are doing louddsi cros mode")
    }
}