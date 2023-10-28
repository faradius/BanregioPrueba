package com.alex.banregioprueba.data.network.model

data class CreditCardResponse(
    val CVV: Int,
    val Fecha_Exp: String,
    val Monto: Int,
    val Nombre_Banco: String,
    val Numero_Tarjeta: String,
    val Titular_Tarjeta: String,
    val pkTarjetaCreditoID: Int
)