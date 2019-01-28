package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static final double DELTA = 1e-14;

    @Test
    void distToLine(){
        Line line = new Line(new Point(0,0), new Point(2, 2));
        Point p = new Point(-2, 2);

        // distance between the line and the point is equal analytically to 2*Math.sqrt(2)
        assertEquals(Calculator.distToLine(line, p), 2*Math.sqrt(2),DELTA);

        // opposite point, distance should also be the same, 2*Math.sqrt(2)
        p = new Point(2, -2);
        assertEquals(Calculator.distToLine(line, p), 2*Math.sqrt(2),DELTA);

        // distance between vertical line and point should be 5
        Line line_1 = new Line(new Point(0,0), new Point(0, 5));
        Point p_1 = new Point(5, 0);
        assertEquals(Calculator.distToLine(line_1, p_1), 5,DELTA);
        // opposite point, distance should be the same, 5
        p_1 = new Point(-5, 0);
        assertEquals(Calculator.distToLine(line_1, p_1), 5,DELTA);


        // distance between horizontal line and point should be 5
        line_1 = new Line(new Point(0,0), new Point(5, 0));
        p_1 = new Point(0, 5);
        assertEquals(Calculator.distToLine(line_1, p_1), 5,DELTA);
        // opposite point, distance should be the same, 5
        p_1 = new Point(0, -5);
        assertEquals(Calculator.distToLine(line_1, p_1), 5,DELTA);


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

        // all points are on the same line. It should return distance between a and c divided by 2
        assertEquals(Calculator.computeRadiusTriInCircleFromPoints(a,b,c), Math.sqrt(45)/2,DELTA);

        a = new Point(0, 2);
        b = new Point(-2, 0);
        c = new Point(2, 0);
        // all points are on the circle of radius 2 centered on (0,0) so it should return 0
        assertEquals(Calculator.computeRadiusTriInCircleFromPoints(a,b,c), 2.0, DELTA);

        a = new Point(-5, 0);
        b = new Point(0, 0.75);
        c = new Point(5, 0);

        // triangle with an obtus angle. It should return distance between a and c divided by 2
        assertEquals(Calculator.computeRadiusTriInCircleFromPoints(a,b,c), 5.0, DELTA);
    }

    @Test
    void computeAngle(){
        Point a = new Point(Math.cos(Math.PI/6.0), Math.sin(Math.PI/6.0));
        Point b = new Point(0, 0);
        Point c = new Point(Math.cos(-3*Math.PI/4.0), Math.sin(-3*Math.PI/4.0));
        // angle should be equal to 11pi/12 and be same regardless of the order of the first and third point
        assertEquals(Calculator.computeAngle(a,b,c),11.0/12.0*Math.PI,DELTA);
        assertEquals(Calculator.computeAngle(c,b,a),11.0/12.0*Math.PI,DELTA);

        a = new Point(Math.cos(3*Math.PI/4.0), Math.sin(3*Math.PI/4.0));
        b = new Point(0, 0);
        c = new Point(Math.cos(-3*Math.PI/4.0), Math.sin(-3*Math.PI/4.0));
        // angle should be equal to pi/2 and be same regardless of the order of the first and third point
        assertEquals(Calculator.computeAngle(a,b,c),Math.PI/2.0,DELTA);
        assertEquals(Calculator.computeAngle(c,b,a),Math.PI/2.0,DELTA);

    }

    @Test
    void calcQuadrant(){
        Point a = new Point(0, 0);
        Point b = new Point(0, -1);
        Point c = new Point(-1, 0);
        Point d = new Point(1, -1);

        assertEquals(Calculator.calcQuadrant(a), 1);
        assertEquals(Calculator.calcQuadrant(b), 3);
        assertEquals(Calculator.calcQuadrant(c), 2);
        assertEquals(Calculator.calcQuadrant(d), 4);
    }
}