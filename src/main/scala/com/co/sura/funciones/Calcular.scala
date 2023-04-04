package com.co.sura.funciones

object Calcular {

  // 500 * 5 = 2500
  //FUNCION QUE RECIBE DOS PARAMETROS Y RETORNA UN VALOR DOUBLE CON EL VALOR DEL TOTAL BRUTO
  def totalBruto(valor: Double = 500, cantidad: Int = 5): Double = valor * cantidad

  // 500 * (19 / 100) = 95
  //FUNCION QUE RECIBE DOS PARAMETROS Y RETORNA UN VALOR DOUBLE CON EL VALOR DEL IVA
  def valorDelIva(valor: Double = 500, iva: Double = 19): Double = valor * (iva / 100)

  // 500 * (16 / 100) = 80
  //FUNCION QUE RECIBE DOS PARAMETROS Y RETORNA UN VALOR DOUBLE CON EL VALOR DEL IMPUESTO
  def valorDeImpuesto(valor: Double = 500, impuesto: Double = 16): Double = valor * (impuesto / 100)

  // 2500 + 95 + 80 = 2675
  //FUNCION QUE RECIBE DOS PARAMETROS Y RETORNA UN VALOR DOUBLE CON EL VALOR TOTAL GENERAL DE LA COMPRA (TOTAL BRUTO + IVA + IMPUESTO)
  def totalGeneral(valor: Double = 500, cantidad: Int = 5): Double = {
    totalBruto(valor, cantidad) + valorDelIva(valor) + valorDeImpuesto(valor)
  }

}
