package com.hemanth.currencyconverter.data

import com.hemanth.currencyconverter.data.model.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("/latest")
    suspend fun getRates(@Query("base") base: String): Response<CurrencyResponse>
}