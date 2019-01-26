package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
  
    @Test
    void distToLine(){
        Line line = new Line(new Point(2,4), new Point(5, 3));
        Point p = new Point(5, 2);

        double dist = 1;

        assert((dist - Calculator.distToLine(line, p)) < 0.1 && (dist - Calculator.distToLine(line, p)) > - 0.1 );
    }

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
        assertEquals(Calculator.computeRadiusTriInCircle(20,15,25), 12,50);
    }
}