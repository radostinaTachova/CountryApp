package com.example.countryapp.data

import com.example.countryapp.data.apiModel.CountryItem
import com.example.countryapp.data.model.Country
import com.example.countryapp.data.model.Currency

fun CountryItem.toCountry(): Country {
    return Country(name = this.name.common,
                    capital = this.capital?.first(),
                    flag = this.flags.png,
                    emojiFlag = this.flag,
                    area = this.area,
                    population = this.population,
                    currencies = this.currencies?.map { Currency(it.value.name, it.value.symbol) },
                    languages = this.languages?.map { it.value })
}


fun Country.getCurrenciesString(): String {
    if (this.currencies?.size == 1) {
        return "${this.currencies.first().name} : ${this.currencies.first().symbol}"
    }
    var result = ""
    this.currencies?.forEach { result ="$result${it.name} : ${it.symbol}, " }
    return result
}