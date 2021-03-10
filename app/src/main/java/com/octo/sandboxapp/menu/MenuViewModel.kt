package com.octo.sandboxapp.menu

import android.util.Log
import androidx.lifecycle.ViewModel

class MenuViewModel : ViewModel() {

    init {
        Log.i("MenuViewModel", "MenuViewModel created...")
    }

    override fun onCleared() {
        Log.i("MenuViewModel", "MenuViewModel destroyed...")
        super.onCleared()
    }
}