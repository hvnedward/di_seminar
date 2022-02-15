package com.example.demo_di.di.component

import com.example.demo_di.DetailActivity
import com.example.demo_di.MainActivity
import com.example.demo_di.di.Module.ClickModule
import com.example.demo_di.di.Module.ViewModelModule
import com.example.demo_di.di.annotiation.ActivityScope
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [ ClickModule::class, ViewModelModule::class])
interface ActivityComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): ActivityComponent
    }

    fun inject(activity: MainActivity)
    fun inject(activity: DetailActivity)
}