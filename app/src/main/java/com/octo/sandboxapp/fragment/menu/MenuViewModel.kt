package com.octo.sandboxapp.fragment.menu

import android.util.Log
import androidx.lifecycle.ViewModel

class MenuViewModel : ViewModel() {

    // TODO: How to store liveData value when switch the fragment?

    init {
        Log.i("MenuViewModel", "MenuViewModel created...")
    }

    override fun onCleared() {
        Log.i("MenuViewModel", "MenuViewModel destroyed...")
        super.onCleared()
    }
}