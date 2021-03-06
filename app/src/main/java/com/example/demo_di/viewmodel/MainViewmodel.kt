package com.example.demo_di.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.demo_di.repo.SearchRepo
import com.example.demo_di.ultis.Result
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(val userRepo: SearchRepo) : ViewModel() {
    lateinit var data: Result
    var result = MutableLiveData<Result>()
    fun getSearchResult(name: String) {
        result.postValue(Result.loading())
        viewModelScope.launch(Dispatchers.IO) {
            data = userRepo.getSearchResult(name)
            result.postValue(data)
        }
    }
}