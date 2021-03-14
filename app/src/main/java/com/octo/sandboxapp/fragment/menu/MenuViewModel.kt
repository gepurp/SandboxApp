package com.octo.sandboxapp.fragment.menu

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MenuViewModel : ViewModel() {

    // TODO: How to store liveData value when switch the fragment?
    private val _testClickCount = MutableLiveData<Int>()
    val testClickCount: LiveData<Int>
        get() = _testClickCount

    init {
        _testClickCount.value = 10
        Log.i("MenuViewModel", "MenuViewModel created...")
    }

    // Call when recycler item will be clicked
    fun onRecyclerItemClick() {
        _testClickCount.value?.plus(1)
    }

    override fun onCleared() {
        Log.i("MenuViewModel", "MenuViewModel destroyed...")
        super.onCleared()
    }
}