package ru.naa.theweather2022.Data

data class City(
    var id: Int,
    var name: String,
    var url: String,
    var country: String,
    var district: String?,
    var sub_district: String?
)