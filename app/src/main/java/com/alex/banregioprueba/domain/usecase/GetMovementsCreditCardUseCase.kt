package com.alex.banregioprueba.domain.usecase

import com.alex.banregioprueba.data.network.model.MovementsResponse
import com.alex.banregioprueba.domain.repository.CreditCardRepository
import retrofit2.Response
import javax.inject.Inject

class GetMovementsCreditCardUseCase @Inject constructor(
private val creditCardRepository: CreditCardRepository
)  {
//    suspend operator fun invoke(id: String): Response<MovementsResponse>{
//        return creditCardRepository.getMovementsCreditCard(id)
//    }
}