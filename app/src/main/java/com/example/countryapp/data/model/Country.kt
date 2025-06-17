package com.example.countryapp.data.model

data class Country(val name: String,
                   val capital: String?,
                   val flag: String,
                   val emojiFlag: String,
                   val area: Double,
                   val population: Int,
                   val currencies: List<Currency>?,
                   val languages: List<String>?)

data class Currency(val name: String?,
                    val symbol: String?)