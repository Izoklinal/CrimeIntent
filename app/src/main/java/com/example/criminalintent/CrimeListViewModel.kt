package com.example.criminalintent

import android.util.Log
import androidx.lifecycle.ViewModel

class CrimeListViewModel : ViewModel() {
    /*private val crimeRepository = CrimeRepository.get()
    val crimeListLiveData = crimeRepository.getCrimes()*/
    val crimeListLiveData = mutableListOf<Crime>()
    init {
        for (i in 0 until 100) {
            
        }
    }
}