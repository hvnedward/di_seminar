package com.example.demo_di

import android.app.Application
import com.example.demo_di.di.component.AppComponent
import com.example.demo_di.di.component.DaggerAppComponent

class MyApplication : Application() {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }
}