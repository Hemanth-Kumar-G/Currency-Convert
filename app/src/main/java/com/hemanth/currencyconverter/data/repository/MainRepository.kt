package com.hemanth.currencyconverter.data.repository

import com.hemanth.currencyconverter.data.model.CurrencyResponse
import com.hemanth.currencyconverter.util.Resource

interface MainRepository {
    suspend fun getRates(base: String): Resource<CurrencyResponse>

}