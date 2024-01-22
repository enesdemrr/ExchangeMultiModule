package com.enes.feature.home.domain.repository

import com.enes.common.data.dto.NetworkWrapper
import com.enes.feature.home.domain.entity.GetAllCurrencyResponseModelEntity
import kotlinx.coroutines.flow.Flow

interface HomeApiRepository {

    suspend fun getAllCurrency(): Flow<NetworkWrapper<GetAllCurrencyResponseModelEntity>>
}