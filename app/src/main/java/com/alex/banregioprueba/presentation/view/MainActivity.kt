package com.alex.banregioprueba.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.alex.banregioprueba.R
import com.alex.banregioprueba.databinding.ActivityMainBinding
import com.alex.banregioprueba.presentation.viewmodel.CreditCardViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: CreditCardViewModel by viewModels()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.creditCardData.observe(this) { response ->

            if (response.isSuccessful) {
                val creditCard = response.body()
                Log.d("Main", "onCreate: $creditCard")

            } else {

            }
        }

        val id = "1"
        viewModel.fetchCreditCardData(id)

    }
}