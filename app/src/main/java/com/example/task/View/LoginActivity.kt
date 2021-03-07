package com.example.task.View

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.task.LoginViewModel
import com.example.task.Model.UserInfo
import com.example.task.Model.baseInfo
import com.example.task.R
import com.example.task.ViewModels.LoginViewModelFactory
import com.example.task.databinding.ActivityLoginBinding
import com.example.task.interfaces.ResultCallbacks


class LoginActivity : AppCompatActivity() , ResultCallbacks{


    override fun onSuccess(info: baseInfo?, message: String) {
        Toast.makeText(this ,message ,Toast.LENGTH_LONG).show()
        Log.e("TAGGGG" , message)

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun onError(message: String) {
        Toast.makeText(this ,"something wrong" ,Toast.LENGTH_LONG).show()

        Log.e("TAGGGG" , message)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val activityMainBinding = DataBindingUtil.setContentView<ActivityLoginBinding>(this,R.layout.activity_login)
        activityMainBinding.myModel = ViewModelProviders.of(this, LoginViewModelFactory(this,this))
            .get(LoginViewModel::class.java)
    }
}