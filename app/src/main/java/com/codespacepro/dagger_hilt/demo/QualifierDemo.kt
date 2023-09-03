package com.codespacepro.dagger_hilt.demo

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Qualifier

class QualifierDemo @Inject constructor(
    @FFName
    private val fName: String,
    @LLName
    private val lName: String
) {

    fun getName() {
        Log.d("main", "I'm a $fName $lName")
    }

}

@Module
@InstallIn(SingletonComponent::class)
class AppModuleDemo {

    @Provides
    @FFName
    fun fName(): String = "Software"

    @Provides
    @LLName
    fun lName(): String = "Engineer"
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FFName

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class LLName