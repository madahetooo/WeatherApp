package com.waether.app.features.randomizer

import android.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert
import org.junit.Rule
import org.junit.Test

// when i invoke incrementNumber(). numberLiveData is incremented by one
class RandomizerViewModelTest {


    @JvmField
    @Rule
    val instantExecutorRule = InstantTaskExecutorRule()
    @Test
    fun `init Then Update Number Live Data Value To DEFAULT_VALUE`() {
        //Arrange

        //Act
        val viewModel = RandomizerViewModel()

        //Assert
        val result = viewModel.numberLiveData.value
        Assert.assertTrue(result == DEFAULT_VALUE)
    }
    @Test
    fun `increment number when numberLiveData valueIs zero then update numberLiveData value to one`() {

        //Arrange
        val viewModel = RandomizerViewModel()
        viewModel.numberLiveData.value = 0

        //Act
        viewModel.incrementNumber()

        //Assert
        val result = viewModel.numberLiveData.value
        Assert.assertTrue(result == 1)
    }

}