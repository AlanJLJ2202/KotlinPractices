package com.example.first_app

fun main() {

    println("Ingresa el numero de choferes que trabajan en la empresa:")
    val n: Int = readLine()!!.toInt()


    var conductores = mutableListOf<Conductor>()
    var x = 1
    var dia = ""

    for (i in 1..n) {
        println("Ingresa el nombre del chofer($i):")
        val nombre: String = readLine()!!
        val kilometros_conductor = mutableListOf<Double>()

        for(i in 1 .. 6){

            when(i){
                1 -> dia = "Lunes"
                2 -> dia = "Martes"
                3 -> dia = "Miercoles"
                4 -> dia = "Jueves"
                5 -> dia = "Viernes"
                6 -> dia = "Sabado"
            }

            println("Ingresa los kilometros que recorrió $nombre el dia $dia:")
            val km: Double = readLine()!!.toDouble()
            kilometros_conductor.add(km)
            x += 1
        }

        var conductor  = Conductor(nombre, kilometros_conductor)
        conductores.add(conductor)
    }

    println("------------------------------------------------------------------------")
    println("Chofer |   Lun   |   Mar   |   Mie   |   Jue   |   Vie   |   Sab   |   Total")
    println("------------------------------------------------------------------------")

    var maxMiles = 0
    var maxDriver = conductores[0]

    for (conductor in conductores) {
        val totalMiles = conductor.km.sum()
        println("${conductor.nombre}   |   ${conductor.km.joinToString("   |   ")}   | $totalMiles km")

        if (totalMiles > 0) {
            maxMiles = totalMiles.toInt()
            maxDriver = conductor
        }
    }

    println("------------------------------------------------------------------------")
    println("\nChofer con el mayor recorrido: ${maxDriver.nombre} ($maxMiles km)                              |")
    println("------------------------------------------------------------------------")


}

data class Conductor(val nombre: String, val km: MutableList<Double>)