package com.weather.usecases.database

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.weather.entities.FavoriteCityId

@Dao
interface  FavoritesDao{

    @Query("select * from FavoriteCityId")
    fun queryAlll() :List<FavoriteCityId>


    @Insert
    fun insert(favoriteCityId: FavoriteCityId)

    @Delete
    fun delete(favoriteCityId: FavoriteCityId)
}