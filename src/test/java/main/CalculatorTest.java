package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static final double DELTA = 1e-14;

    @Test
    void distToLine(){
        Line line = new Line(new Point(2,4), new Point(5, 3));
        Point p = new Point(5, 2);

        double dist = 1;

        assertEquals(Calculator.distToLine(line, p), 3*Math.sqrt(10)/10,DELTA);
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
    void computeRadiusTriInCircle() {
        
        assertEquals(Calculator.computeRadiusTriInCircle(20,15,25), 12.5,DELTA);
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

        a = new Point(-5, 0);
        b = new Point(0, 0.75);
        c = new Point(5, 0);

        assertEquals(Calculator.computeRadiusTriInCircleFromPoints(a,b,c), 10.0, DELTA);
    }

    @Test
    void computeAngle(){
        Point a = new Point(Math.cos(Math.PI/6), Math.sin(Math.PI/6));
        Point b = new Point(0, 0);
        Point c = new Point(-1, -1);
        assertEquals(Calculator.computeAngle(a,b,c),165.0/180.0*Math.PI,DELTA);
        assertEquals(Calculator.computeAngle(c,b,a),165.0/180.0*Math.PI,DELTA);

        a = new Point(-1, 1);
        b = new Point(0, 0);
        c = new Point(-1, -1);
        assertEquals(Calculator.computeAngle(a,b,c),90.0/180.0*Math.PI,DELTA);
        assertEquals(Calculator.computeAngle(c,b,a),90.0/180.0*Math.PI,DELTA);

    }
}