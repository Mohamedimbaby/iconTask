package com.example.task.interfaces

import com.example.task.Model.UserInfo
import com.example.task.Model.baseInfo

interface ResultCallbacks {
    fun  onSuccess(info: baseInfo?,message:String)
    fun  onError(message:String)

}