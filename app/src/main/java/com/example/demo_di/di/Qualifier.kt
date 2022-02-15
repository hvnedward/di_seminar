package com.example.demo_di.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class QButton

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class QMovingScreen