package com.example.task.Model

import android.util.Patterns
import androidx.databinding.BaseObservable
import com.google.gson.annotations.SerializedName


 class LoginUser(var strEmailAddress: String, var strPassword: String)  : BaseObservable(){

    val isDataValid:Boolean
        get() = Patterns.EMAIL_ADDRESS.matcher(strEmailAddress).matches()
                && strPassword.length > 5
fun  setEmail(email:String){
    this.strEmailAddress = email
}fun  setPassword(password:String){
this.strPassword = password
}fun  getEmail() :String{
    return  this.strEmailAddress
}fun  getPassword() : String{
        return  this.strPassword
}

}
data class UserInfo (
    @SerializedName("fname") val fname: String?,
    @SerializedName("lname") val lname: String?,
    @SerializedName("email") val email: String?,
    @SerializedName("countryCode") val countryCode: String?,
    @SerializedName("mobile") val mobile: String?,
    @SerializedName("birthDate") val birthDate: String?,
    @SerializedName("token") val token: String?,
    @SerializedName("is_verified") val isVerified: Int?,
    @SerializedName("is_completed") val iscompleted: Int?
): baseInfo()
data class ApiResponse (
    @SerializedName("code") val code: Int?,
    @SerializedName("msg") val message: String?,
    @SerializedName("item") val userInfo: UserInfo?

)data class ItemResponse (
    @SerializedName("code") val code: Int?,
    @SerializedName("msg") val message: String?,
    @SerializedName("item") val userInfo: Item?

)
data class LoginUserInfo (
    @SerializedName("email") val email: String?,
    @SerializedName("password") val password: String?,
    @SerializedName("fcmToken") val fcmToken: String?
)