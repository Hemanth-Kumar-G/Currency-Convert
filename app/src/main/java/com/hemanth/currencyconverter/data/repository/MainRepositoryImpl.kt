package com.hemanth.currencyconverter.data.repository

import com.hemanth.currencyconverter.data.ApiService
import com.hemanth.currencyconverter.data.model.CurrencyResponse
import com.hemanth.currencyconverter.util.Resource

class MainRepositoryImpl (private val apiService: ApiService) : MainRepository {

    override suspend fun getRates(base: String): Resource<CurrencyResponse> = try {
        val response = apiService.getRates(base)
        val result = response.body()
        if (response.isSuccessful && result != null)
            Resource.Success(result)
        else
            Resource.Error(response.message())
    } catch (e: Exception) {
        Resource.Error(e.message ?: "Some thing went wrong")
    }

}