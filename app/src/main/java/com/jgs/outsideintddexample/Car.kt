package com.jgs.outsideintddexample

class Car(
    val engine: Engine,
    fuel: Double
) {
    private var myFuel: Double = fuel

    val fuel: Double
        get() = myFuel

    fun turnOn() {
        myFuel -= 0.5
        engine.turnOn()
    }
}