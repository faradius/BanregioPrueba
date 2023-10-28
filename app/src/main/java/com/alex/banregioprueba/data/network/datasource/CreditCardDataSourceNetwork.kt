package com.alex.banregioprueba.data.network.datasource

import com.alex.banregioprueba.data.network.model.CreditCardResponse
import com.alex.banregioprueba.data.network.model.MovementsResponse
import retrofit2.Response

interface CreditCardDataSourceNetwork {
    suspend fun getCreditCard(id: String): Response<CreditCardResponse>
    suspend fun getMovementsCreditCard(id: String): Response<MovementsResponse>
}