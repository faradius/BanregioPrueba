package com.alex.banregioprueba.data.network.repository

import com.alex.banregioprueba.data.network.datasource.CreditCardDataSourceNetwork
import com.alex.banregioprueba.data.network.model.CreditCardResponse
import com.alex.banregioprueba.data.network.model.MovementsResponse
import com.alex.banregioprueba.domain.repository.CreditCardRepository
import retrofit2.Response
import javax.inject.Inject


class CreditCardRepositoryImpl @Inject constructor(
    private val dataSource: CreditCardDataSourceNetwork
) : CreditCardRepository {
    override suspend fun getCreditCard(id: String): Response<CreditCardResponse> {
        return dataSource.getCreditCard(id)
    }

//    override suspend fun getMovementsCreditCard(id: String): Response<List<MovementsResponse>> {
//        return dataSource.getMovementsCreditCard(id)
//    }
}