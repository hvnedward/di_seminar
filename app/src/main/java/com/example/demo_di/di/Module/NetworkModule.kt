package com.example.demo_di.di.Module

import com.example.demo_di.network.GithubServiceAPI
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class NetworkModule {
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create()).build()
    }

    @Provides
    fun provideGithubService(retrofit: Retrofit): GithubServiceAPI {
        return retrofit.create(GithubServiceAPI::class.java)
    }


}