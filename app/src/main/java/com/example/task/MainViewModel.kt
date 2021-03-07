package com.example.task

import android.content.Context
import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModel
import com.example.task.Model.LoginUserInfo
import com.example.task.interfaces.ResultCallbacks


class MainViewModel(private  var  listener: ResultCallbacks, var  context: Context) : ViewModel(
){
    val apiService = RestApiService()

    fun onGetWhatsNewClicked (v : View){
        getWhatsNew();
    }
    fun onGetCategoriesClicked (v : View){
        getCategories();
    }

    private fun getWhatsNew() {
        apiService.getWhatsNew {
            if (it?. code== 200) {
                listener.onSuccess(it.userInfo," success")
            } else {
                Log.e("TAG" , "done "+ it?.code)
            }
        }
        }
    private fun getCategories() {
        apiService.getCategories {
            if (it?. code== 200) {
                listener.onSuccess(it.userInfo," success")
            } else {
                Log.e("TAG" , "done "+ it?.code)
            }
        }
        }


}