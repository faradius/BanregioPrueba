package com.alex.banregioprueba.domain.usecase

import com.alex.banregioprueba.data.network.model.CreditCardResponse
import com.alex.banregioprueba.domain.repository.CreditCardRepository
import retrofit2.Response
import javax.inject.Inject

class GetCreditCardUseCase @Inject constructor(
    private val creditCardRepository: CreditCardRepository
) {

    suspend operator fun invoke(id: String): Response<CreditCardResponse> {
        return creditCardRepository.getCreditCard(id)
    }
}