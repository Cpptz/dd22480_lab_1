package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static final double DELTA = 1e-15;

    @Test
    void computeArea() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 10);
        Point c = new Point(20, 0);

        assertEquals(Calculator.computeArea(a, b, c), 100);

        a = new Point(-10, 0);
        b = new Point(0, 10);
        c = new Point(20, 0);

        assertEquals(Calculator.computeArea(a, b, c), 150);
    }


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
    void computeRadiusTriInCircle() {
        
        assertEquals(Calculator.computeRadiusTriInCircle(20,15,25), 12,DELTA);
    }


    @Test
    void computeRadiusTriInCircle_Points() {
        Point a = new Point(1, 2);
        Point b = new Point(2, 4);
        Point c = new Point(4, 8);

        assertEquals(Calculator.computeRadiusTriInCircleFromPoints(a,b,c), Math.sqrt(45),DELTA);

        a = new Point(0, 2);
        b = new Point(-2, 0);
        c = new Point(2, 0);
        assertEquals(Calculator.computeRadiusTriInCircleFromPoints(a,b,c), 2.0f, DELTA);
    }
}