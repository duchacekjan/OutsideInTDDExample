package com.jgs.outsideintddexample.unit

import com.jgs.outsideintddexample.Engine
import org.junit.Assert.*
import org.junit.Test

class EngineShould {
    private val engine = Engine()

    @Test
    fun increasesItsTemperatureWhenTurnedOn() {
        engine.turnOn()
        assertEquals(95, engine.temperature)
    }

    @Test
    fun turnOn() {
        engine.turnOn()
        assertTrue(engine.isTurnedOn)
    }
}