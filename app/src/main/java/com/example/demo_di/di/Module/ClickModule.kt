package com.example.demo_di.di.Module

import com.example.demo_di.di.annotiation.Button
import com.example.demo_di.di.annotiation.Detail
import com.example.demo_di.ultis.Factory.ButtonOnClick
import com.example.demo_di.ultis.Factory.DetailedOnClick
import com.example.demo_di.ultis.IClick
import dagger.Binds
import dagger.Module

@Module
abstract class ClickModule {
    @Button
    @Binds
    abstract fun provideButtonSearchClick(buttonOnClick: ButtonOnClick): IClick

    @Detail
    @Binds
    abstract fun provideDetailClick(detailedOnClick: DetailedOnClick): IClick
}