package com.codespacepro.dagger_hilt.demo

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton

interface Two {

    fun getName()
}

class ImplementTwo @Inject constructor() : Two {
    override fun getName() {
        Log.d("main", "My Name is Khubaib")
    }
}

class MainTwo @Inject constructor(private val two: Two) {
    fun getName() {
        two.getName()
    }
}

/*
@Module
@InstallIn(SingletonComponent::class)
abstract class AppModules {

    @Binds
    @Singleton
    abstract fun bind(
        implementTwo: ImplementTwo
    ): Two

}*/

@Module
@InstallIn(SingletonComponent::class)
class AppModules {

    @Provides
    @Singleton
    fun binding(): Two = ImplementTwo()
}

