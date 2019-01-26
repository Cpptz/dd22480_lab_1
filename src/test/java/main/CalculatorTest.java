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
}