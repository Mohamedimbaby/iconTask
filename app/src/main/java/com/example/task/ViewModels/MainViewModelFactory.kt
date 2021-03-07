package com.example.task.ViewModels


import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.task.LoginViewModel
import com.example.task.MainViewModel
import com.example.task.interfaces.ResultCallbacks

class MainViewModelFactory (private val listener: ResultCallbacks, var context: Context): ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(listener,context = context) as T
    }
}