package com.example.demo_di.di.module

import com.example.demo_di.di.QButton
import com.example.demo_di.di.QMovingScreen
import com.example.demo_di.ultis.ButtonClick
import com.example.demo_di.ultis.ICLick
import com.example.demo_di.ultis.MovingScreen
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
interface CLickModule {
    @QButton
    @Binds
    fun bindButtonCLick(buttonClick: ButtonClick): ICLick

    @QMovingScreen
    @Binds
    fun bindsMovingClick(movingScreen: MovingScreen): ICLick
}