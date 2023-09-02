package com.codespacepro.dagger_hilt.demo

import android.util.Log
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Singleton


interface One {

    fun getName()
}

class ImplementOne @Inject constructor() : One {
    override fun getName() {
        Log.d("main", "getName: My Name is Khubaib")
    }

}

class Main @Inject constructor(private val one: One) {
    fun getName() {
        one.getName()
    }
}

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {

    @Binds
    @Singleton
    abstract fun binding(
        implementOne: ImplementOne
    ): One

}