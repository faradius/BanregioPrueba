package com.alex.banregioprueba.data.network.datasource


import com.alex.banregioprueba.data.network.api.ApiService
import com.alex.banregioprueba.data.network.model.CreditCardResponse
import com.alex.banregioprueba.data.network.model.MovementsResponse
import retrofit2.Response
import javax.inject.Inject

class CreditCardDataSourceNetworkImpl @Inject constructor(
    private val api: ApiService
) : CreditCardDataSourceNetwork {
    override suspend fun getCreditCard(id: String): Response<CreditCardResponse> {
        return api.getCreditCard(id)
    }

    override suspend fun getMovementsCreditCard(id: String): Response<MovementsResponse> {
        return api.getMovementsCreditCard(id)
    }
}