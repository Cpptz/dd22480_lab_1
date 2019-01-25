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

    @Test
    void computeRadius() {

        Point a = new Point(2,2);
        assertEquals(Calculator.computeRadius(a), Math.sqrt(8));
    }

    @Test
    void computeMaxRadiusTriInCircle() {
        
        assertEquals(Calculator.computeMaxRadiusTriInCircle(20,15,25), 12,50);
    }
}