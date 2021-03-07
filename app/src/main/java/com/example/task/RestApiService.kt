package com.example.task
import RestApi
import android.util.Log
import com.example.task.Model.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RestApiService {
    fun login(userData: LoginUserInfo, onResult: (ApiResponse?) -> Unit){
        val retrofit = ServiceBuilder.buildService(RestApi::class.java)

        retrofit.Login(userData).enqueue(
            object : Callback<ApiResponse> {
                override fun onFailure(call: Call<ApiResponse>, t: Throwable) {
                    Log.e("TAG" ,"onfailure"+ t.message)
                    onResult(null)
                }
                override fun onResponse( call: Call<ApiResponse>, response: Response<ApiResponse>) {
                    val addedUser = response.body()
                    onResult(addedUser)
                }
            }
        )
    }
    fun getWhatsNew( onResult: (ItemResponse?) -> Unit){
        val retrofit = ServiceBuilder.buildService(RestApi::class.java)
        retrofit.whatsNew().enqueue(
            object : Callback<ItemResponse> {
                override fun onFailure(call: Call<ItemResponse>, t: Throwable) {
                    Log.e("TAG" ,"onfailure"+ t.message)
                    onResult(null)
                }
                override fun onResponse( call: Call<ItemResponse>, response: Response<ItemResponse>) {
                    val addedUser = response.body()
                    Log.e("TAG",response.body().toString() )
                    onResult(addedUser)
                }
            }
        )
    }
    fun getCategories( onResult: (ItemResponse?) -> Unit){
        val retrofit = ServiceBuilder.buildService(RestApi::class.java)
        retrofit.getCategories().enqueue(
            object : Callback<ItemResponse> {
                override fun onFailure(call: Call<ItemResponse>, t: Throwable) {
                    Log.e("TAG" ,"onfailure"+ t.message)
                    onResult(null)
                }
                override fun onResponse( call: Call<ItemResponse>, response: Response<ItemResponse>) {
                    val addedUser = response.body()
                    Log.e("TAG",response.body().toString() )
                    onResult(addedUser)
                }
            }
        )
    }
}