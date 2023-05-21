package com.example.helloandroidstudio

class Programmer(val name: String, var age:Int, val languages: Array<Language>, val friends: Array<Programmer>? = null) {

    enum class Language {
        KOTLIN,
        JAVA,
        REACT,
        JAVASCRIPT
    }

    fun code(){
        for (language in languages){
            println("I am programming in $language")
        }
    }

}