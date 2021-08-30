package com.jgs.outsideintddexample

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Car(
    val engine: Engine,
    fuel: Double
) {
    private var myFuel: Double = fuel

    val fuel: Double
        get() = myFuel

    fun turnOn() {
        myFuel -= 0.5
        CoroutineScope(Dispatchers.Main).launch {
            engine.turnOn()
        }
    }
}