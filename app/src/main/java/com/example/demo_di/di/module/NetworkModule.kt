package com.example.demo_di.di.module

import com.example.demo_di.network.GithubServiceAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl("https://api.github.com/").addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun provideGithubSerice(retrofit: Retrofit): GithubServiceAPI {
        return retrofit.create(GithubServiceAPI::class.java)
    }

}