package com.codespacepro.dagger_hilt.demo

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine, private val wheel: Wheel) {


    fun getCar() {
        engine.getEngine()
        wheel.getWheel()
        Log.d("main", "getCar: Car is Running")
    }
}