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
        /*for(j in 1 .. 6){

            ++x
        }*/



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
            //print("x = $x")
        }

        var conductor  = Conductor(nombre, kilometros_conductor)

        conductores.add(conductor)
    }

    println("conductores")
    println(conductores)

    var maxMiles = 0
    var maxDriver = conductores[0]

    for (conductor in conductores) {
        val totalMiles = conductor.km.sum()
        println("${conductor.nombre} - ${conductor.km.joinToString(" ")} - Total: $totalMiles")

        if (totalMiles > 0) {
            maxMiles = totalMiles.toInt()
            maxDriver = conductor
        }
    }

    println("\nChofer con el mayor recorrido: ${maxDriver.nombre} ($maxMiles km)")


    /*for (driver in drivers) {
        val totalMiles = driver.km.sum()
        println("${driver.nombre} - ${driver.km.joinToString(" ")} - Total: $totalMiles")
    }*/

    //println("Ingresa el nombre de choferes que trabajan en la empresa:")

}

data class Conductor(val nombre: String, val km: MutableList<Double>)