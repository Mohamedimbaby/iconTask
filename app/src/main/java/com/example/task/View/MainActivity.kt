package com.example.task.View

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.task.LoginViewModel
import com.example.task.MainViewModel
import com.example.task.Model.baseInfo
import com.example.task.R
import com.example.task.ViewModels.LoginViewModelFactory
import com.example.task.ViewModels.MainViewModelFactory
import com.example.task.databinding.ActivityLoginBinding
import com.example.task.databinding.ActivityMainBinding
import com.example.task.interfaces.ResultCallbacks

class MainActivity : AppCompatActivity() , ResultCallbacks{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val activityMainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        activityMainBinding.myModel = ViewModelProviders.of(this, MainViewModelFactory(this,this))
            .get(MainViewModel::class.java)
    }

    override fun onSuccess(info: baseInfo?, message: String) {
        Toast.makeText(this ,message , Toast.LENGTH_LONG).show()
        Log.e("TAGGGG" , message)
    }

    override fun onError(message: String) {
        Toast.makeText(this ,"something wrong" , Toast.LENGTH_LONG).show()

        Log.e("TAGGGG" , message)
    }}