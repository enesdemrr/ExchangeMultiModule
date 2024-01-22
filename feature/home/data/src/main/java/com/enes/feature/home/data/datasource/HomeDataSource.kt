package com.enes.feature.home.data.datasource

import com.enes.feature.home.data.model.GetAllCurrencyResponseModel
import retrofit2.Response

interface HomeDataSource {
    suspend fun getAllCurrency(): Response<GetAllCurrencyResponseModel>
}