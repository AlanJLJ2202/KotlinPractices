package com.example.first_app

fun test() {

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
    println("Chofer\t\t\tLun\t\tMar\t\tMie\t\tJue\t\tVie\t\tSab\t\tTotal")
    println("------------------------------------------------------------------------")

    var maxKm = 0
    var maxConductor = conductores[0]

    for (conductor in conductores) {
        val totalKm = conductor.km.sum()
        println("${conductor.nombre}\t\t\t\t${conductor.km.joinToString("\t\t")}\t\t$totalKm km")

        if (totalKm > 0 && totalKm.toInt() > maxKm) {
            maxKm = totalKm.toInt()
            maxConductor = conductor
        }
    }

    println("------------------------------------------------------------------------")
    println("\nChofer con el mayor recorrido: ${maxConductor.nombre} ($maxKm km)                              |")
    println("------------------------------------------------------------------------")
}

data class Conductor(val nombre: String, val km: MutableList<Double>)