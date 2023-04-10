package com.co.sura.caseClass

import com.co.sura.typeAlias.TypeAlias.Precio

case class ProductOne(nombre: String, precio: Double, cantidad: Int) {

  def calculoDelProducto(iva: Precio = 19, impuesto: Precio = 16): Unit = {
    ProductOne.totalGeneral(this, iva, impuesto)

  }

}
object ProductOne {

  def apply(nombre: String, precio: Double, cantidad: Int): ProductOne = new ProductOne(nombre, precio, cantidad)

  def valorBruto(producto: ProductOne): Precio = {
    val resultado = producto.precio * producto.cantidad
    resultado
  }

  def valorDelIva(producto: ProductOne, iva: Precio): Precio = {
    val resultado = producto.precio * (iva / 100)
    resultado
  }

  def valorDeImpuestos(producto: ProductOne, impuesto: Precio): Double = {
    val resultado = producto.precio * (impuesto / 100)
    resultado
  }

  def totalGeneral(productOne: ProductOne, iva: Precio, impuesto: Precio): Unit = {
    val valorBruto = ProductOne.valorBruto(productOne)
    val valorDelIva = ProductOne.valorDelIva(productOne, iva)
    val valorDeImpuestos = ProductOne.valorDeImpuestos(productOne, impuesto)
    val resultado = valorDelIva + valorBruto + valorDeImpuestos

    println(s"El valor Bruto de ${productOne.nombre} es de: €$valorBruto")
    println(s"El IVA del Producto [${productOne.nombre}] es de: €$valorDelIva")
    println(s"El IMP del Producto [${productOne.nombre}] es de: €$valorDeImpuestos")
    println(s"El Valor Total del Producto [${productOne.nombre}] es de: €$resultado")
  }
}