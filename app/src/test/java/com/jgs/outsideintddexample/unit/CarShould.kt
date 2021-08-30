package com.jgs.outsideintddexample.unit

import com.jgs.outsideintddexample.Car
import com.jgs.outsideintddexample.Engine
import org.junit.Assert.*
import org.junit.Test
import org.mockito.kotlin.*

open class CarShould {
    private val engine: Engine = mock()
    private val car = Car(engine, 5.0)

    @Test
    fun looseFuelWhenItTurnsOn() {
        car.turnOn()
        assertEquals(4.5, car.fuel, 0.1)
    }

    @Test
    fun turnOnItsEngine() {
        car.turnOn()
        verify(engine, times(1)).turnOn()
    }
}