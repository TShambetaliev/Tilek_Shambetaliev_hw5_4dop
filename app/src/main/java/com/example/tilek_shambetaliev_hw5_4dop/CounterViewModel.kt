package com.example.tilek_shambetaliev_hw5_4dop

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

     val count = MutableLiveData<String>()
    var numCount = 0

    fun increment() {
        numCount++
        count.value = numCount.toString()
    }

    fun decrement() {
        numCount--
        count.value = numCount.toString()

    }

}