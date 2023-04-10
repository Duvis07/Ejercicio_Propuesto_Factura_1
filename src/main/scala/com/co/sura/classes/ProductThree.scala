package com.co.sura.classes

import com.co.sura.traits.CalcularProducto
import com.co.sura.typeAlias.TypeAlias.{Cantidad, Nombre, Precio}

class ProductThree(nombre: Nombre, precio: Precio, cantidad: Cantidad) extends CalcularProducto {

  def valorBruto(): Precio = {
    val resultado = precio * cantidad
    resultado
  }


  override def valorDelIva(iva: Precio = 19D): Precio = {
    val resultado = precio * (iva / 100)
    resultado
  }

  override def valorDeImpuesto(impuesto: Precio = 18D): Precio = {
    val resultado = precio * (impuesto / 100)
    resultado
  }

  override def totalGeneral(iva: Precio = 19D, impuesto: Precio = 16D): Unit = {
    val valorBruto = this.valorBruto()
    val valorDelIva = this.valorDelIva(iva)
    val valorDeImpuestos = this.valorDeImpuesto(impuesto)
    val resultado = valorDelIva + valorBruto + valorDeImpuestos

    println(s"El valor Bruto de ${nombre} es de: €$valorBruto")
    println(s"El IVA del Producto [${nombre}] es de: €$valorDelIva")
    println(s"El IMP del Producto [${nombre}] es de: €$valorDeImpuestos")
    println(s"El Valor Total del Producto [${nombre}] es de: €$resultado")
  }
}
