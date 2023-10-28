package com.alex.banregioprueba.domain.repository

import com.alex.banregioprueba.data.network.model.CreditCardResponse
import com.alex.banregioprueba.data.network.model.MovementsResponse
import retrofit2.Response

interface CreditCardRepository {
    suspend fun getCreditCard(id: String): Response<CreditCardResponse>
//    suspend fun getMovementsCreditCard(id: String): Response<List<MovementsResponse>>
}