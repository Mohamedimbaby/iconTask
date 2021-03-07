package com.example.task

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModel
import com.example.task.Model.LoginUser
import com.example.task.Model.LoginUserInfo
import com.example.task.Model.UserInfo
import com.example.task.interfaces.ResultCallbacks


class LoginViewModel(private  var  listener: ResultCallbacks, var  context: Context) : ViewModel(
){

    private  val  user: LoginUser
    init {
        this.user = LoginUser("","")
    }
    val emailTextWatcher : TextWatcher
    get() = object  : TextWatcher{
        override fun afterTextChanged(s: Editable?) {
        user.setEmail(s.toString())
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                            print(s)
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            print(s)
        }

    }
    val passwordTextWatcher : TextWatcher
    get() = object  : TextWatcher{
        override fun afterTextChanged(s: Editable?) {
        user.setPassword(s.toString())
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            print(s)
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            print(s)
        }

    }

    fun onLoginClicked (v : View){
        if (this.user .isDataValid){
        Login();
        }
        else listener.onError("there is an error ")
    }

    private fun Login() {
        val apiService = RestApiService()
        val userInfo = LoginUserInfo(
            email = "test@test.com",
            password = "11111111",
            fcmToken = "123"
        )

        apiService.login(userInfo) {
            if (it?. code== 200) {
                Log.e("TAG" , "done "+it?.userInfo.let {
                    if (it is UserInfo){

                    }else {

                    }
                })
                listener.onSuccess(it.userInfo,"login success")
            } else {
                Log.e("TAG" , "done "+ it?.message)

            }
        }
        }


}