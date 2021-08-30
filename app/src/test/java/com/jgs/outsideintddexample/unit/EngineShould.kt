package com.jgs.outsideintddexample.unit

import com.jgs.outsideintddexample.Engine
import com.jgs.outsideintddexample.utils.MainCoroutineScopeRule
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test

class EngineShould {
    private val engine = Engine()

    @get:Rule
    val coroutinesTestRule = MainCoroutineScopeRule()

    @Test
    fun increasesItsTemperatureWhenTurnedOn() = runBlockingTest {
        engine.turnOn()
        assertEquals(95, engine.temperature)
    }

    @Test
    fun turnOn() = runBlockingTest {
        engine.turnOn()
        assertTrue(engine.isTurnedOn)
    }
}