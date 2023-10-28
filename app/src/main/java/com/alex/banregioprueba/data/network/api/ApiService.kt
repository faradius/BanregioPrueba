package com.alex.banregioprueba.data.network.api

import com.alex.banregioprueba.data.network.model.CreditCardResponse
import com.alex.banregioprueba.data.network.model.MovementsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("tarjetacredito.php/{id}")
    suspend fun getCreditCard(@Path("id") id: String): Response<CreditCardResponse>

    @GET("/tarjetacredito-movimientos.php/{id}")
    suspend fun getMovementsCreditCard(@Path("id") id: String): Response<MovementsResponse>
}