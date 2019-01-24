package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class CalculatorTest {

    @Test
    void computeDistance() {

        Point a = new Point(-2,1);
        Point b = new Point(1,3);
        assertEquals(Calculator.computeDistance(a,b), Math.sqrt(13));
    }
}