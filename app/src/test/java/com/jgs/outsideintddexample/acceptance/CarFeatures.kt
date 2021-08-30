package com.jgs.outsideintddexample.acceptance

import com.jgs.outsideintddexample.Car
import com.jgs.outsideintddexample.Engine
import org.junit.Assert.*
import org.junit.Test

class CarFeatures {
    private val engine = Engine()
    private val car = Car(engine, 6.0)

    @Test
    fun carConsumesFuelWhenItTurnsOn(){
        car.turnOn()
        assertEquals(5.5, car.fuel, 0.1)
    }

    @Test
    fun carIsTurningOfItsEnginesAndIncreasesItsTemperature(){
        car.turnOn()
        assertEquals(95, car.engine.temperature)
        assertTrue(car.engine.isTurnedOn)
    }
}