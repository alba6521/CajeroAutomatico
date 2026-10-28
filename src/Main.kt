// Pide un importe al usuario. Devuelve null si no es un número válido.
fun leerImporte(mensaje: String): Double? {
    print(mensaje)
    val texto = readLine()?.trim()?.replace(',', '.') // acepta coma decimal
    return texto?.toDoubleOrNull()
}

fun main() {
    var saldo = 500.0
    var salir = false

    // El menú se repite hasta elegir "Salir"
    while (!salir) {
        println()
        println("===== CAJERO AUTOMÁTICO =====")
        println("1. Consultar saldo")
        println("2. Ingresar dinero")
        println("3. Retirar dinero")
        println("4. Salir")
        print("Seleccione una opción: ")

        val opcion = readLine()?.trim()?.toIntOrNull()

        when (opcion) {
            1 -> println("El saldo actual es de: $saldo €")

            2 -> {
                val cantidad = leerImporte("Introduzca la cantidad que desee ingresar: ")
                if (cantidad == null) {
                    println("Error: debe introducir un número válido.")
                } else if (cantidad <= 0) {
                    println("Error: la cantidad que ha ingresado debe ser mayor que cero.")
                } else {
                    saldo += cantidad
                    println("Ingreso realizado correctamente. Nuevo saldo: $saldo €")
                }
            }

            3 -> {
                val cantidad = leerImporte("Introduzca la cantidad a retirar: ")
                if (cantidad == null) {
                    println("Error: debe introducir un número válido.")
                } else if (cantidad <= 0) {
                    println("Error: la cantidad que quiere retirar debe ser mayor que cero.")
                } else if (cantidad > saldo) {
                    println("Error: saldo insuficiente.")
                } else {
                    saldo -= cantidad
                    println("Retirada realizada correctamente. Nuevo saldo: $saldo €")
                }
            }

            4 -> {
                println("Gracias por utilizar el cajero. ¡Hasta pronto!")
                salir = true
            }

            else -> println("Error: opción no válida. Elija una opción del 1 al 4.")
        }
    }
}