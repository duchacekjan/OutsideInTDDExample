package com.jgs.outsideintddexample

import android.util.Log

class Engine {
    var temperature: Int = 15
    var isTurnedOn: Boolean = false
    fun turnOn() {
        Thread.sleep(6000)
        temperature = 95
        isTurnedOn = true
        Log.d("COURSE", "Engine has turned on.")
    }
}