package com.jgs.outsideintddexample.acceptance

import com.jgs.outsideintddexample.Car
import com.jgs.outsideintddexample.Engine
import com.jgs.outsideintddexample.utils.MainCoroutineScopeRule
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test

class CarFeatures {
    private val engine = Engine()
    private val car = Car(engine, 6.0)

    @get:Rule
    val coroutinesTestRule = MainCoroutineScopeRule()

    @Test
    fun carConsumesFuelWhenItTurnsOn() = runBlockingTest {
        car.turnOn()
        assertEquals(5.5, car.fuel, 0.1)
    }

    @Test
    fun carIsTurningOfItsEnginesAndIncreasesItsTemperature() = runBlockingTest {
        car.turnOn()
        coroutinesTestRule.advanceTimeBy(6100)
        assertEquals(95, car.engine.temperature)
        assertTrue(car.engine.isTurnedOn)
    }
}