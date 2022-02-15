package com.example.demo_di.ultis

import com.example.demo_di.model.User

class Result(val data: User?, val status: Status?, val msg: String?) {
    companion object{
        fun loading() = Result(null, Status.LOADING, null)
        fun error(msg: String?) = Result(null, Status.ERROR, msg)
        fun success(data: User?) = Result(data, Status.SUCCESS, null)
    }
}
