package com.weather.usecases.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import com.weather.entities.City
import com.weather.entities.FavoriteCityId
import com.weather.usecases.applicationLiveData
import com.weather.usecases.getApplication


val WeatherDatabase : weatherDatabase by lazy {

    initializeDatabase(applicationLiveData.getApplication())
}
@Database(entities = [City::class,FavoriteCityId::class],
    version = 1,
    exportSchema = true)

@TypeConverters(CoordinatesTypeConverter::class)
abstract class weatherDatabase: RoomDatabase(){

    abstract val citiesao :CitiesDao
    abstract val favoritesDao:FavoritesDao

}