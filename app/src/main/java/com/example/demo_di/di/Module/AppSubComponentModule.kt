package com.example.demo_di.di.Module

import com.example.demo_di.di.component.ActivityComponent
import dagger.Module

@Module(subcomponents = [ActivityComponent::class])
class AppSubComponentModule {
}