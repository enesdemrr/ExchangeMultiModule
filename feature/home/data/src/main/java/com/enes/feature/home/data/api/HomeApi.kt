package com.enes.feature.home.data.api

import com.enes.feature.home.data.model.GetAllCurrencyResponseModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface HomeApi {
    @GET("currencyToAll?int=1&base=USD")
    @Headers("Authorization: apikey 20pZoZb9cG84XWfWKPUGjD:7nv0Mr38TlMKSPDbRwhrqS")
    suspend fun getAllCurrency(): Response<GetAllCurrencyResponseModel>
}