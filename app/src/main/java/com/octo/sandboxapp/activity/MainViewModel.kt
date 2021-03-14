package com.octo.sandboxapp.activity

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    init {
        Log.i("MainViewModel", "MainViewModel created...")
    }

    override fun onCleared() {
        Log.i("MainViewModel", "MainViewModel destroyed...")
        super.onCleared()
    }
}