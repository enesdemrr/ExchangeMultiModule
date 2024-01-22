package com.enes.feature.home.data.datasource

import com.enes.feature.home.data.api.HomeApi
import com.enes.feature.home.data.model.GetAllCurrencyResponseModel
import retrofit2.Response
import javax.inject.Inject

class HomeDataSourceImpl @Inject constructor(
    private val homeApi: HomeApi
) : HomeDataSource {
    override suspend fun getAllCurrency(): Response<GetAllCurrencyResponseModel> {
        return homeApi.getAllCurrency()
    }
}