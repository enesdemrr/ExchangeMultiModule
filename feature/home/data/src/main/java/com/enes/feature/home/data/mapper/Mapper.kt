package com.enes.feature.home.data.mapper

import com.enes.feature.home.data.model.Data
import com.enes.feature.home.data.model.GetAllCurrencyResponseModel
import com.enes.feature.home.data.model.Result
import com.enes.feature.home.domain.entity.DataEntity
import com.enes.feature.home.domain.entity.GetAllCurrencyResponseModelEntity
import com.enes.feature.home.domain.entity.ResultEntity

fun GetAllCurrencyResponseModel.getAllCurrencyToEntity() = GetAllCurrencyResponseModelEntity(
    result = this.result?.resultToEntity(),
    success = this.success
)

fun Result.resultToEntity() = ResultEntity(
    data = this.data.dataToEntity(),
    base = this.base,
    lastupdate = this.lastupdate
)

fun Data.dataToEntity() = DataEntity(
    calculated = this.calculated,
    calculatedstr = this.calculatedstr,
    code = this.code,
    name = this.name,
    rate = this.rate
)

fun List<Data?>?.dataToEntity() = this?.map {
    it?.dataToEntity()
}