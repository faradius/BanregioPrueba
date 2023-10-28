package com.alex.banregioprueba.di

import com.alex.banregioprueba.domain.repository.CreditCardRepository
import com.alex.banregioprueba.domain.usecase.CreditCardUseCases
import com.alex.banregioprueba.domain.usecase.GetCreditCardUseCase
import com.alex.banregioprueba.domain.usecase.GetMovementsCreditCardUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class UseCaseModule {
    @Provides
    fun providesCreditCardUseCases(repository: CreditCardRepository) = CreditCardUseCases(
        getCreditCardUseCase = GetCreditCardUseCase(repository),
        getMovementsCreditCardUseCase = GetMovementsCreditCardUseCase(repository)
    )
}