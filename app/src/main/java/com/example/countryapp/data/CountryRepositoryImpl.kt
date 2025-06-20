package com.example.countryapp.data

import com.example.countryapp.data.model.Country
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Singleton
import javax.inject.Inject


@Singleton
class CountryRepositoryImpl @Inject constructor(private val countryApi: CountryApi) : CountryRepository {


    override suspend fun getCountries(name: String): List<Country> {
        return withContext(Dispatchers.IO) {
            val response = countryApi.getCountries(name)
            if (response.isSuccessful) {
                response.body()?.map { it.toCountry() } ?: emptyList<Country>()
            } else {
                emptyList<Country>()
            }
        }
    }

    override suspend fun getCountry(name: String): Country? {
        return withContext(Dispatchers.IO) {
            val response = countryApi.getCountry(name)
            if (response.isSuccessful) {
                response.body()?.map { it.toCountry() }?.first()
            } else {
                null
            }
        }
    }


}