package com.alex.banregioprueba.di

import com.alex.banregioprueba.data.network.datasource.CreditCardDataSourceNetwork
import com.alex.banregioprueba.data.network.datasource.CreditCardDataSourceNetworkImpl
import com.alex.banregioprueba.data.network.repository.CreditCardRepositoryImpl
import com.alex.banregioprueba.domain.repository.CreditCardRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class CreditCardModule {
    @Binds
    abstract fun bindsCreditCardDataSourceNetwork(impl: CreditCardDataSourceNetworkImpl): CreditCardDataSourceNetwork

    @Binds
    abstract fun bindsCreditCardRepository(impl: CreditCardRepositoryImpl): CreditCardRepository
}