package com.enes.feature.home.presentation

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.enes.common.data.utils.onSuccess
import com.enes.common.presentation.BaseViewModel
import com.enes.feature.home.domain.entity.DataEntity
import com.enes.feature.home.domain.entity.ResultEntity
import com.enes.feature.home.domain.usecase.GetAllCurrencyUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val useCase: GetAllCurrencyUseCase,
    application: Application
) : BaseViewModel(application) {

    private val _currencyList = MutableLiveData<List<DataEntity>>()
    val currencyList: LiveData<List<DataEntity>> = _currencyList

    fun getAllCurrency() {
        viewModelScope.launch(Dispatchers.IO) {
            useCase.invoke()
                .collect() { result ->
                    val list: ArrayList<DataEntity> = arrayListOf()
                    result.onSuccess { success ->
                        success.data.result?.data?.let { nullableList ->
                            nullableList.forEach { item ->
                                item?.let {
                                    list.add(it)
                                }
                            }
                        }
                        _currencyList.postValue(list)
                    }
                }
        }
    }
}