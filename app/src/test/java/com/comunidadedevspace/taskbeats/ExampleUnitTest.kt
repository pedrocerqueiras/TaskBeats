package com.comunidadedevspace.taskbeats

import org.junit.Test

import org.junit.Assert.assertEquals
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private val mockMyNumbersProvider: MyNumbersProvider = mock()

    private val underTest = MyCountRepositoryImpl (
        numbersProvider = mockMyNumbersProvider
            )


    @Test
    fun addition_isCorrect() {

        //Given
        whenever(mockMyNumbersProvider.getNumber()).thenReturn(2)

        //When
        val result = underTest.sum()

        //Then
        val expected = 4
        assertEquals(expected, result)

    }
}