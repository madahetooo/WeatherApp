package com.waether.app.features.randomizer

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.weather.usecases.Ticker
import com.weather.usecases.randomNumberGenerator

private const val DEFAULT_VALUE = 0
private const val INCREMENT_BY_VALUE = 1

class RandomizerViewModel : ViewModel() {

    private val ticker = initializeTicker()
    val numberLiveData = MutableLiveData<Int>()

    init {
        numberLiveData.value = DEFAULT_VALUE
        ticker.start()
    }

    private fun initializeTicker ()= Ticker {
        val oldValue = numberLiveData.value ?: DEFAULT_VALUE
        numberLiveData.postValue(randomNumberGenerator().toInt())
    }


    override fun onCleared() {
        super.onCleared()
        ticker.cancel()
    }
}