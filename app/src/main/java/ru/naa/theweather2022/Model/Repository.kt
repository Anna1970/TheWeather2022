package ru.naa.theweather2022.Model

import ru.naa.theweather2022.Data.City

class Repository {

    private var list = mutableListOf<City?>()
    init {
        list = listOf(
            City(
                id = 5211,
                name = "Анапа",
                url = "/weather-anapa-5211/",
                country = "Россия",
                district = null,
                sub_district = null
            ),
            City(
                id = 4368,
                name = "Москва",
                url = "/weather-moscow-4368/",
                country = "Россия",
                district = null,
                sub_district = null
            ),
            City(
                id = 4079,
                name = "Санкт-Петербург",
                url = "/weather-sankt-peterburg-4079/",
                country = "Россия",
                district = null,
                sub_district = null
            ),
            City(
                id = 5003,
                name = "Севастополь",
                url = "/weather-sevastopol-5003/",
                country = "Россия",
                district = null,
                sub_district = null
            ),
            City(
                id = 5110,
                name = "Ростов-на-Дону",
                url = "/weather-rostov-na-donu-5110/",
                country = "Россия",
                district = null,
                sub_district = null
            )
        ) as MutableList<City?>
    }

    fun getAll() = list
}