package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LICTest {

    @Test
    void LIC_0() {
        LIC.LENGTH1 =1;
        Point a = new Point(0,0);
        Point b = new Point(0,3);
        Point c = new Point(0,0);

        Point[] points = {a,b,c};

        assertEquals(LIC.LIC_0(points,3),true);
    }

    @Test
    void LIC_6a() {
        LIC.DIST = 3;
        LIC.N_PTS = 4;
        Point[] points = {new Point(3, 3), new Point(6, 3), new Point(6, 6),
                new Point(9, 6), new Point(12, 3), new Point(15, 8)};
        assertEquals(LIC.LIC_6(points), true);
    }

    @Test
    void LIC_6b() {
        LIC.DIST = 5;
        LIC.N_PTS = 4;
        Point[] points = {new Point(3, 3), new Point(6, 3), new Point(6, 6),
                new Point(3, 3), new Point(9, 3), new Point(9, 4)};
        assertEquals(LIC.LIC_6(points), false);
    }
}