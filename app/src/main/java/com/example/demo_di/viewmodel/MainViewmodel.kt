package com.example.demo_di.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.demo_di.di.annotiation.ActivityScope
import com.example.demo_di.repo.SearchRepo
import com.example.demo_di.ultis.Result
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@ActivityScope
class MainViewModel @Inject constructor(val userRepo: SearchRepo) : ViewModel() {
    lateinit var data: Result
    var result = MutableLiveData<Result>()
    fun getSearchResult(name: String) {
        viewModelScope.launch(Dispatchers.IO) {
            result.postValue(Result.loading())
            data = userRepo.getSearchResult(name)
            result.postValue(data)
        }
    }
}