package com.aghogho.countrieslistingapp.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aghogho.countrieslistingapp.R
import com.aghogho.countrieslistingapp.databinding.ItemCountryBinding
import com.aghogho.countrieslistingapp.model.Country
import com.aghogho.countrieslistingapp.util.getProgressDrawable
import com.aghogho.countrieslistingapp.util.loadImage

class CountryListAdapter(var countries: ArrayList<Country>): RecyclerView.Adapter<CountryListAdapter.CountryViewHolder>() {

    fun updateCountries(newCountries: List<Country>) {
        countries.clear()
        countries.addAll(newCountries)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val binding = ItemCountryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CountryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
       holder.bind(countries[position])
    }

    override fun getItemCount() = countries.size

    class CountryViewHolder(private val binding: ItemCountryBinding, view: View? = null): RecyclerView.ViewHolder(binding.root) {

        private val imageView = binding.imageView
        private val countryName = binding.name
        private val countryCapital = binding.capital
        private val progressDrawable = view?.context?.let { getProgressDrawable(it) }

        fun bind(country: Country) {
            countryName.text = country.countryName
            countryCapital.text = country.capital
            if (progressDrawable != null) {
                imageView.loadImage(country.flag, progressDrawable)
            }
        }
    }

}