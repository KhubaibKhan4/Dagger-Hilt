package com.codespacepro.dagger_hilt.demo

import android.util.Log
import javax.inject.Inject

class Wheel {

    @Inject
    constructor()

    fun getWheel() {
        Log.d("main", "getWheel: Wheel Started")
    }
}