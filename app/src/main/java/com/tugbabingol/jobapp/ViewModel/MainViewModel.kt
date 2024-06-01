package com.tugbabingol.jobapp.ViewModel

import androidx.lifecycle.ViewModel
import com.tugbabingol.jobapp.Repository.MainRepository

class MainViewModel(val respository : MainRepository):ViewModel() {
    constructor():this(MainRepository())

    fun loadLocation()=respository.location
}