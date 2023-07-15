package com.awakelab.oskar.ejercicio13

import java.text.NumberFormat
import java.util.Currency
import kotlin.math.ceil

//Ejecicio 13A
fun main() {
    var valor1 = 10.5
    var valor2 = 39.7F

    var resultado = suma(valor1, valor2)
    println(resultado)

    var valor1Redondeado = redondeo(valor1)
    println(valor1Redondeado)

    var resul = muestraResultado(resultado)
    println(resul)
}

fun suma(v1: Double, v2: Float): Double = v1 + v2
fun redondeo(v1: Double) = ceil(v1)

fun muestraResultado(numero: Double): String {
    val format: NumberFormat = NumberFormat.getCurrencyInstance()
    format.setMaximumFractionDigits(2)
    format.setCurrency(Currency.getInstance("EUR"))
    return format.format(numero)
}
