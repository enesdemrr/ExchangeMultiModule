package com.enes.feature.home.data.di

import com.enes.feature.home.data.datasource.HomeDataSource
import com.enes.feature.home.data.datasource.HomeDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface HomeApiDataSourceModule {

    @Binds
    @Singleton
    fun provideHomeDataSourceModule(dataSourceImpl: HomeDataSourceImpl): HomeDataSource
}