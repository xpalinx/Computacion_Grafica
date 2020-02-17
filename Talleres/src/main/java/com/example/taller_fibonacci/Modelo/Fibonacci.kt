package com.example.taller_fibonacci.Modelo

class Fibonacci () {

    fun get_fibonacci(numero : Int): String
    {

        val n = numero
        var t1 = 0
        var t2 = 1
        var retornar = ""
        for (i in 1..n) {
            retornar = "$t1 + "
            val sum = t1 + t2
            t1 = t2
            t2 = sum
        }

        return retornar
    }

}