package com.weather.usecases.repositories

import com.weather.entities.FavoriteCityId
import com.weather.usecases.database.WeatherDatabase
import com.weather.usecases.database.weatherDatabase


val citiesRepository by lazy {CitiesRepository()}
class CitiesRepository(private val database: weatherDatabase= WeatherDatabase){

    fun searchCitiesByName(name: String)=database.citiesao.queryCitiesByName(name)
    fun retrieveFavoriteCities()=database.favoritesDao.queryAlll()

    fun retrieveCitiesByIds(citiesIds: List<Long>)=database.citiesao.queryCitiesByIds(citiesIds)
    fun addFavoriteCityId(favoriteCityId: FavoriteCityId)=database.favoritesDao.insert(favoriteCityId)
    fun removeFavoriteCityId(favoriteCityId:FavoriteCityId)=database.favoritesDao.delete(favoriteCityId)
}