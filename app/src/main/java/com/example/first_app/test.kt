package com.example.first_app

fun main() {

        //Se pide al usuario que ingrese los datos de la figura
        println("Ingresa el lado (a) de la figura:")
        val a: Double = readLine()!!.toDouble()
        println("Ingresa el lado (c) de la figura:")
        val c: Double = readLine()!!.toDouble()
        println("Ingresa el lado (b) de la figura:")
        val b: Double = readLine()!!.toDouble()

        //Se crea el objeto de la clase Figura
        val figura = Figura(a, b, c)
        println(figura.area())
}

//Se crea la clase Figura
class Figura(var a: Double, var b: Double, var c: Double) {
    fun area(): String {
        val area = (a + c) * b / 2
        return "El área del trapecio rectángulo es: $area"
    }
}