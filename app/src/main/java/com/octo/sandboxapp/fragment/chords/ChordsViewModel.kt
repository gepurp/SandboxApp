package com.octo.sandboxapp.fragment.chords

import android.util.Log
import androidx.lifecycle.ViewModel

class ChordsViewModel : ViewModel() {

    init {
        Log.i("ChordsViewModel", "ChordsViewModel created...")
    }

    override fun onCleared() {
        Log.i("ChordsViewModel", "ChordsViewModel destroyed...")
        super.onCleared()
    }
}