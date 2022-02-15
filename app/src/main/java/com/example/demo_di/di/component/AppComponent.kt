package com.example.demo_di.di.component

import android.content.Context
import com.example.demo_di.di.Module.AppSubComponentModule
import com.example.demo_di.di.Module.NetworkModule
import com.example.demo_di.di.Module.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, AppSubComponentModule::class])
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun exposeActivityComponent():ActivityComponent.Factory

}