package com.example.gitground.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text

    private val _text2 = MutableLiveData<String>("이슈기능 연습")
    val text2: LiveData<String> = _text2
    fun getData(): LiveData<String> {
        return text2
    }
}