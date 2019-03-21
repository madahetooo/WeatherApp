package com.weather.usecases

import android.arch.lifecycle.MutableLiveData

fun numberIncrementer(liveData: MutableLiveData<Int>, incrementBy:Int=1){
    val oldValue =liveData.value?:0
    liveData.postValue(oldValue+incrementBy)
}

//usecase 1 : search city by name
// if is searching , then do not trigger action
// city name must not be null
//if all is Ok , trigger search


//usecase2 :retrieve favorites cities ids(longs)
// if is retrieving , then do not trigger action
//if favorites is empty, throw an exception
// if favorites not empty , conver them to ids (longs)


//usecase3 : retrieve cities by ids
//if is retrieving ,then do not trigger action
// if all is Ok, trigger action

