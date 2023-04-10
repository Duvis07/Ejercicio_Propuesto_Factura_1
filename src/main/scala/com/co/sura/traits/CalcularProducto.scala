package com.co.sura.traits

trait CalcularProducto {

  def valorDelIva(iva: Double): Double

  def valorDeImpuesto(impuesto: Double): Double

  def totalGeneral(iva: Double, impuesto: Double): Unit

}
