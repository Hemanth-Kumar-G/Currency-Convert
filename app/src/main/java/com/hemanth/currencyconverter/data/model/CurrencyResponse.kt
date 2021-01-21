package com.hemanth.currencyconverter.data.model

data class CurrencyResponse(
    val base: String,
    val date: String,
    val rates: Rates
)