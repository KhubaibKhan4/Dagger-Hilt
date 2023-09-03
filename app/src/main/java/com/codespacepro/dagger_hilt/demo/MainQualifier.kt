package com.codespacepro.dagger_hilt.demo

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Qualifier

class MainQualifier @Inject constructor(
    @FName
    private val fName: String,
    @LName
    private val lName: String
) {

    fun getName() {
        Log.d("main", "my name is $fName $lName")
    }
}

@Module
@InstallIn(SingletonComponent::class)
class AppModuleQ {

    @Provides
    @FName
    fun FName(): String = "Khubaib"

    @Provides
    @LName
    fun LName(): String = "Khan"
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FName


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class LName