package com.co.sura.main

import com.co.sura.caseClass.{ProductOne, ProductTwo}
import com.co.sura.classes.ProductThree
import com.co.sura.funciones.Calcular

object Main {

  def main(args: Array[String]): Unit = {

    //Objeto de la clase ProductoOne
    val uva = ProductOne("Uva", 15.75, 7)

    //Objeto de la clase ProductoTwo
    val tuplaProducto: (String,Double,Int) = ("Pera", 13.48, 6)

    //se le asigna el valor de la tupla a la clase ProductoTwo
    val producto2 = ProductTwo.tupled(tuplaProducto)

    //recibe el valor de la clase ProductoTwo
    val pera = new ProductOne(producto2.nombre, producto2.precio, producto2.cantidad)

    //Objeto de la clase ProductoThree
    val banana = new ProductThree("Banana", 14.89,8)

    println("------------------------------------------")
    uva.calculoDelProducto()
    println("------------------------------------------")
    println()
    println("------------------------------------------")
    pera.calculoDelProducto()
    println("------------------------------------------")
    println()
    println("------------------------------------------")
    banana.totalGeneral()
    println("------------------------------------------")
    println()


















//    println("------------------------------------------")
//    println("Total Bruto: " + Calcular.totalBruto())
//    println("IVA: " + Calcular.valorDelIva())
//    println("IMP Consumo: " + Calcular.valorDeImpuesto())
//    println("El Valor Total es: " + Calcular.totalGeneral())
//    println("------------------------------------------")

  }

}
