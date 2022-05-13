package com.aghogho.countrieslistingapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aghogho.countrieslistingapp.model.Country

class ListViewModel: ViewModel() {

    val countries = MutableLiveData<List<Country>>()
    val countryLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh() {
        fetchCountries()
    }

    private fun fetchCountries() {
        val mockData = listOf(
            Country("Denmark"),
            Country("Finland"),
            Country("United Kingdom"),
            Country("United Arab Emirates"),
            Country("Germany"),
            Country("Israel"),
            Country("Netherland"),
            Country("Spain"),
            Country("Italy"),
            Country("Luzemburgh")
        )

        countryLoadError.value = false
        loading.value = false
        countries.value = mockData
    }

}