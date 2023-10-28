package com.alex.banregioprueba.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alex.banregioprueba.data.network.model.CreditCardResponse
import com.alex.banregioprueba.domain.usecase.CreditCardUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class CreditCardViewModel @Inject constructor(
    private val creditCardUseCase: CreditCardUseCases
):ViewModel(){
    private val _creditCardData = MutableLiveData<Response<CreditCardResponse>>()
    val creditCardData: LiveData<Response<CreditCardResponse>> get() = _creditCardData

    private val _movementsCreditCardData = MutableLiveData<Response<CreditCardResponse>>()
    val movementsCreditCardData: LiveData<Response<CreditCardResponse>> get() = _movementsCreditCardData

    fun fetchCreditCardData(id: String) {
        viewModelScope.launch {
            val result = creditCardUseCase.getCreditCardUseCase(id)
            _creditCardData.postValue(result)
        }
    }

//    fun fetchMovementsCreditCardData(id: String) {
//        viewModelScope.launch {
//            val result = creditCardUseCase.getMovementsCreditCardUseCase(id)
//            _movementsCreditCardData.postValue(result)
//        }
//    }
}