package com.javacodegeeks.intellij.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by julen on 8/26/16.
 */
public class SimpleCalculatorTest {
    private SimpleCalculator calculator;

    @Before
    public void setUp() throws Exception {
        this.calculator = new SimpleCalculator();
    }

    @Test
    public void add() throws Exception {
        //Arrange
        float n1 = 1;
        float n2 = 2;
        float expected = 3;
        float actual;
        //Act
        actual = this.calculator.add(n1, n2);
        //Assert
        assertEquals(expected, actual, 0.000);
    }

    @Test
    public void subtract() throws Exception {

    }

    @Test
    public void multiply() throws Exception {

    }

    @Test
    public void divide() throws Exception {

    }

}