package com.example.first_app

const val birthday = "22 de febrero"



fun main() {
    
        /* //Se pide al usuario que ingrese los datos de la figura
        println("Ingresa el lado (a) de la figura:")
        val a: Double = readLine()!!.toDouble()
        println("Ingresa el lado (b) de la figura:")
        val b: Double = readLine()!!.toDouble()
        println("Ingresa el lado (c) de la figura:")
        val c: Double = readLine()!!.toDouble()


        //Se crea el objeto de la clase Figura
        val figura = Figura(a, b, c)
        println(figura.area())*/

        /*val persona: Persona = Persona("Alan", "Lopez")
        persona.welcome_message()

        val usuario: User = User("Alan", 21)
        val usuario2 = usuario.copy(edad = 25)

        println(usuario2.toString())
        println("Son iguales: ${usuario == usuario2}")*/

        println(birthday)
        println(Constantes.direccion)

        val dia = DIAS.LUNES
        println(dia)

        println(es_par(1))

        //Condiciones

        /*val a = 3
        val b = 7

        //var max: Int
        var max = if(a > b) a else b
        print(max)*/



        //Listas mutables e inmutables
        var listaMutable = mutableListOf<String>("Jordan", "Chino", "Alan", "Chon")


        //Lista inmutable
        var listaInmutable = listOf("Auto", "Moto", "Bici")
        /*for((index, nombre) in listaInmutable.withIndex()){
            println(index)
            println(nombre)
        }*/

        listaInmutable.forEachIndexed {
            index, elemento -> println("Elemento: $elemento, con indice: $index")
        }

        //When parecido al switch
        val x = 5
        when(x){
            1 -> {
                println("Entra a la condición")
            }
            2 -> {
                println("Entra a la condición")
            }
            else -> {println("X no coincide")}
        }
}

//Se crea la clase Figura
class Figura(var a: Double, var b: Double, var c: Double) {
    fun area(): String {
        val area = (a + c) * b / 2
        return "El área del trapecio rectángulo es: $area"
    }
}

class Persona(val nombre: String, val apellido: String){
    fun welcome_message(){
        println("Hola yo soy $nombre $apellido")
    }
}

data class User(val nombre: String, val edad: Int)

class Constantes{
    companion object {
        const val direccion = "Purisima del rincon"
    }
}

enum class DIAS(val numero: Int){
    LUNES (1),
    MARTES (2),
    MIERCOLES (3),
    JUEVES (4),
    VIERNES (5),
    SABADO (6),
    DOMINGO (7)
}


fun es_par(numero: Int): Boolean {
    return numero % 2 == 0
}