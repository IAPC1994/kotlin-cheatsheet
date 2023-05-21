package com.example.helloandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //variableAndContants()
        //dataTypes()
        //ifStatements()
        //whenStatement()
        //arrays()
        //maps()
        //loops()
        nullSafety()
    }
    private fun variableAndContants(){
        // Single line comment
        /* Multiline comment */

        // Variables
        var myFirstVariable = "Hello Hackerman" // Type String
        var myFirstNumber = 1 // Type Int
        println(myFirstVariable + ' ' + myFirstNumber)

        // Constant
        val myFirstConstant = "This is a constant"
        println(myFirstConstant)
    }

    private fun dataTypes(){
        // String
        val myString: String = "Hello World"
        val myString2 = "Welcome to the world"
        val myString3 = myString + " " + myString2;
        println(myString3)

        // Numbers (Byte, Short, Int, Long)
        val myInt: Int = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        println(myInt3)

        // Decimal (Float (32 bits), Double (64 bits))
        val myFloat: Float = 1.5f
        val myDouble = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1
        val myDouble4 = myDouble + myDouble2 + myDouble3
        println(myDouble4)

        // Boolean (Bool)
        val myBool: Boolean = true
        val myBool2 = false
        println(myBool === myBool2)
        println(myBool && myBool2)
    }

    private fun ifStatements() {
        val myNumber = 60

        // Conditional operators
        // > greater than
        // < less than
        // >= greater or equal to
        // <= less or equal to
        // == equal
        // != different

        // Logic operators
        // &&  = and
        // || = or
        // ! = not

        if( myNumber <= 10 ){
            println("$myNumber is less or equal to 10 and greater than 5")
        }else if( myNumber === 60 ){
            println("$myNumber is equal to 60")
        }else{
            println("$myNumber is greater than 10 but different to 60")
        }
    }

    private fun whenStatement(){

        when(val country = "Netherlands"){
            "Chile" -> {
                println("In $country people speak Spanish")
            }
            "Ireland", "Netherlands" -> {
                println("In $country people speak English")
            }
            else -> {
                println("$country not found")
            }
        }

        when(val age = 10 ){
            0, 1, 2 -> {
                println("You are a baby")
            }
            in 3..10 -> {
                println("You are a child")
            }
            in 11..17 -> {
                println("You are a teenager")
            }
            in 18..69 -> {
                println("You are an adult")
            }
            in 70..99 -> {
                println("You are an elder")
            }
            else -> {
                println("You are a dinosaur")
            }
        }
    }

    private fun arrays(){
        val name = "Ivan"
        val surname = "Panussis"
        val company = "IAPC DEV"
        val age = "29"

        val myArray = arrayListOf<String>()
        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)

        // Add multiple elements
        myArray.addAll(listOf("Single","Full Stack Developer"))
        println(myArray)

        // Get value
        println("Value in the index 0: " + myArray[0]);

        // Update value
        myArray[5] = "New value"
        println(myArray);

        // Remove value by INDEX
        myArray.removeAt(5)
        println(myArray)

        // Scroll through data
        myArray.forEach{
            println(it)
        }

        //Others
        myArray.count() // Count of elements in the array
        myArray.clear() // Remove all the elements
        myArray.first() // Return the first element
        myArray.last() // Return the last element
    }

    private fun maps(){
        var myMap: Map<String, Int> = mapOf()

        // Add elements
        myMap = mutableMapOf("Ivan" to 1, "Full Stack Developer" to 2, "Age" to 29)
        println(myMap)

        // Add one element
        myMap["Panussis"] = 5
        myMap.put("React", 8)
        println(myMap)

        // Update an element
        myMap.put("React", 3)
        println(myMap)

        // Access data
        println(myMap["React"])

        // Remove an element
        myMap.remove("Panussis")
        println(myMap)
    }

    private fun loops(){
        val myArray: List<String> = listOf("Hello", "Welcome to Kotlin","World")
        val myMap: MutableMap<String, Int> = mutableMapOf("Ivan" to 1, "Panussis" to 2, "Kotlin" to 5)

        // For
        for (myString: String in myArray){
            println(myString)
        }

        for (myElement: MutableMap.MutableEntry<String, Int> in myMap){
            println("${myElement.key}-${myElement.value}")
        }

        for (x in 0..10){
            println(x)
        }

        for (x in 0 until 10){
            println(x)
        }

        for (x in 0..10 step 2){
            println(x)
        }

        for (x in 10 downTo 0 step 3){
            println(x)
        }

        val myNumericArray = (0..20)
        for (myNum: Int in myNumericArray){
            println(myNum)
        }

        // While
        var x = 0

        while( x < 10){
            println(x)
            //x++
            x += 2
        }
    }

    private fun nullSafety(){
        var myString = "Ivan"
        println(myString)
        // myString = null
        var mySafetyString: String? = "IvanDev null safety"
        mySafetyString = null
        println(mySafetyString)

        mySafetyString = "Hello World"
        //println(mySafetyString)

        /*if( mySafetyString != null){
            println(mySafetyString!!)
        }else{
            println(mySafetyString)
        }*/

        //Safe call
        println(mySafetyString?.length)

        mySafetyString?.let{
            println(it)
        }?: run{
            println(mySafetyString)
        }
    }
}