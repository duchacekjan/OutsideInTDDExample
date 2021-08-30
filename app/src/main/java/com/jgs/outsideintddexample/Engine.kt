package com.jgs.outsideintddexample

import android.util.Log
import kotlinx.coroutines.delay

class Engine {
    var temperature: Int = 15
    var isTurnedOn: Boolean = false
    suspend fun turnOn() {
        delay(6000)
        temperature = 95
        isTurnedOn = true
        Log.d("COURSE", "Engine has turned on.")
    }
}