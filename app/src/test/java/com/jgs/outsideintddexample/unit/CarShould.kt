package com.jgs.outsideintddexample.unit

import com.jgs.outsideintddexample.Car
import com.jgs.outsideintddexample.Engine
import com.jgs.outsideintddexample.utils.MainCoroutineScopeRule
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.mockito.kotlin.mock
import org.mockito.kotlin.times
import org.mockito.kotlin.verify

open class CarShould {
    private val engine: Engine = mock()
    private val car = Car(engine, 5.0)

    @get:Rule
    val coroutinesTestRule = MainCoroutineScopeRule()

    @Test
    fun looseFuelWhenItTurnsOn() = runBlockingTest {
        car.turnOn()
        assertEquals(4.5, car.fuel, 0.1)
    }

    @Test
    fun turnOnItsEngine() = runBlockingTest {
        car.turnOn()
        verify(engine, times(1)).turnOn()
    }
}