package com.techpart.kotlinproject

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val name = "joe"
    private val isAwesome = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var occupation = "Developer"
        var name = "jo"

        val car = Car("Toyota", "Avalon", "red")
        println(car.make)
        println(car.model)
        println(car.acclerate())
        println(car.details())


        val truck = Truck("ford", "f-150", 18000)
        truck.tow()
        truck.details()

        val tesla = CarInherit("Tesla", "Models", "Red")
        tesla.acelerate()

        val truckTesla = TruckInherit("Ford", "f-500", 18000)
        truckTesla.acelerate()


        //call download data function
//        downloadDataLambda("fake.com", {
//            println("the code in this block, will only run after completion")
//        })
        downloadDataLambda("fake.com") {
            println("the code in this block, will only run after completion")
        }


        // call download data car function
        downloadCarData("fakeurl.com") { car ->
            println(car.color)
            println(car.model)
        }
        downloadCarData("fakeurl.com") {
            println(it.color)
            println(it.model)
        }

        // call download truck data function
        downloadTruckData("fakeurl.com") { truck, success ->
            if (success == true) {
                // do something with our truck
                truck?.tow()
            } else {
                // handle request value
                println("something went wrong")
            }
        }
    }

    override fun onResume() {
        super.onResume()
//        variable()
//        stringKotlin()
//        numberAndOperators()
//        functionKotlinParamter("Hellow world fucntion parameter")
//        val rebels = functionKotlinParamterInt(8, 9)
//        println("Rebels is $rebels")
        colletions()

    }

    fun variable() {
        Log.e("okay", "is" + name + "Awesome? the answer is :" + isAwesome)

        var a = 3
        var b = 6
        Log.e("SUM", (a + b).toString())


        val doubleNum = 1234.5
        val floatNum = 234.5f

        val longNum = 123232323L

        val aDouble = a.toString()

        var name: String
        name = "Superman"
        println(name)
    }

    fun stringKotlin() {
        val str = "Hello world"
        Log.e("str", str)

//        for (char in str) {
//            println(char)
//        }

        val contenEquals = str.contentEquals(str)
        println(contenEquals)

        val contains = str.contains("Hello", true)
        println(contains)

        val upperCase = str.toUpperCase()
        val lower = str.toLowerCase()
        println(upperCase)
        println(lower)

        val num = 6
        val stringNum = num.toString()
        println(stringNum)


        val subSequence = str.subSequence(4, 5)
        println(subSequence)

        val luke = "luke skywalker"
        val lightSaberColor = "green"
        val vechile = "LandSpeeder"

        println("$luke has a $lightSaberColor lightsaber $vechile$num")
        println("Luke has ${luke.length} number")
    }

    fun numberAndOperators() {
        val a = 12
        val b = 25

        // + - / *

        println(b + a)
        println(b - a)
        println(b / a)
        println(a * b)

        println(b % a)
    }

    fun functionKotlinParamter(line: String) {
        println(line)
    }

    fun functionKotlinParamterInt(rebels: Int, ewoks: Int): Int {
        val goodGuys = rebels + ewoks
        return goodGuys
    }

    fun conditionalLogic() {
        val a = 2
        val b = 3
        if (a == b) {
            println("same")
        }
        if (a != b) {
            println("not same")
        }

        val accountBalance = 100
        val price = 150

        if (accountBalance >= price) {
            println("you can buy this")
        } else {
            println("sorry, you broke")
        }

        val degrees = 70
        if (degrees >= 70) {
            println("this is nice degree")
        } else if (degrees <= 70 && degrees >= 50) {
            println("Grab sweater")
        } else {
            println("COol")
        }
    }


    fun colletions() {
        // unmutable arrays
        val imperials = listOf("Empereor", "Death vader", "Boba Feet", "Tarkin")
        println(imperials.sorted())
        println(imperials[2])
        println(imperials.first())
        println(imperials.last())
        println(imperials.contains(imperials[1]))
        println(imperials)


        // mutable arrays
        val rebels = arrayListOf("leiah", "luke", "han solo", "mon mothma")
        println(rebels.size)
        rebels.add("chebaka")
        println(rebels)
        rebels.add(0, "lando")
        println(rebels)
        println(rebels.indexOf("luke"))

        rebels.remove("han solo")
        println(rebels)

        val rebelsVechicleMap = mapOf(
            "solo" to "Millenium",
            "luke" to "landspeer"
        )
        println(rebelsVechicleMap["solo"])
        println(rebelsVechicleMap.get("solo"))
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            println(
                rebelsVechicleMap.getOrDefault(
                    "leiah",
                    "this ship doesnt exitst"
                )
            )
        }
        println(rebelsVechicleMap.values)

        val rebelVechicles = hashMapOf("solo" to "Millenium", "luke" to "Landpseeder")
        rebelVechicles["solo"] = "Xwing"
        rebelVechicles.put("leiah", "tantive IV")
        println(rebelVechicles)
        rebelVechicles.remove("solo")
//        rebelVechicles.clear()


    }

    fun loopsKotlin() {
        val rebels = arrayListOf("leiah", "luke", "han solo", "mon mothma")
        val rebelVechicles = hashMapOf("solo" to "Millenium", "luke" to "Landpseeder")

        for (rebel in rebels) {
            println("name : $rebel")
        }

        for ((key, value) in rebelVechicles) {
            println("$key gets around $value")
        }

        var x = 10
        while (x > 10) {
            println(x)
            x--
        }
    }

    fun nullability() {
        var name: String = "Jo"
//        name = null
        var nullabelName: String? = "Do i really exist ?"
        nullabelName = null

        // null check
        var length = 0
        if (nullabelName != null) {
//            println(nullabelName.length)
            length = nullabelName.length
        } else {
            length = -1
        }

        println(length)

        // check flexible null check
        val l = if (nullabelName != null) nullabelName.length else -1

        // second method safe call operator ?
        println(nullabelName?.length)

        // third method is elvis operator
        var len = nullabelName?.length ?: -1
        var noName = nullabelName ?: "no one knows me"
        println(noName)

        // !! operator
//        println(nullabelName!!.length)
    }

    fun lambda() {
        val printMessage = { message: String -> println(message) }

        printMessage("hello world")

        val sumA = { x: Int, y: Int -> x + y }
        println(sumA(5, 4))

        val sumB: (Int, Int) -> Int = { x, y -> x + y }


    }

    fun downloadDataLambda(url: String, completion: () -> Unit) {
        // send a download request
        // we got back data
        // there no networks error
        completion()
    }

    fun downloadCarData(url: String, completion: (Car) -> Unit) {
        // send a download request
        // we got back car data
        // there no networks error
        val car = Car("Tesla", "ModelX", "Blue")
        completion(car)
    }

    fun downloadTruckData(url: String, completion: (Truck?, Boolean?) -> Unit) {
        // make the web request
        // we get the result back
        val webRequestSuccess = true
        if (webRequestSuccess) {
            // receive truck data
            val truck = Truck("Ford", "f678", 18000)

            completion(truck, true)
        } else {
            completion(null, false)
        }

    }


}
