package com.example.demo_di.network

import com.example.demo_di.model.User
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubServiceAPI {
    @GET("users/{user}")
    suspend fun getUserInfo(@Path("user") user: String): User
}