package com.aghogho.countrieslistingapp.di

import com.aghogho.countrieslistingapp.model.CountriesApi
import com.aghogho.countrieslistingapp.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

//@Module
class ApiModule {

//    @Provides
//    fun provideCountriesApi(): CountriesApi {
//        return Retrofit.Builder()
//            .baseUrl(BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create())
//            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//            .build()
//            .create(CountriesApi::class.java)
//    }

}