package com.codespacepro.dagger_hilt.demo

import android.util.Log
import javax.inject.Inject

class Engine {

    @Inject
    constructor()
    fun getEngine() {
        Log.d("main", "getEngine: Engine Started..")
    }
}