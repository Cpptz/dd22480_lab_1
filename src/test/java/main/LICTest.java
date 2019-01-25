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
    void LIC_11() {
        LIC.G_PTS = 2;
        Point a = new Point(0,0);
        Point b = new Point(0,3);
        Point c = new Point(3,3);
        Point d = new Point(4,3);
        Point e = new Point(2,3);
        Point f = new Point(0,0);

        Point[] points = {a,b,c,d,e,f};

        assertFalse(LIC.LIC_11(points,3));

        assertTrue(LIC.LIC_11(points,6));

        // this should fail since G_PTS are less than 1
        LIC.G_PTS = 0;
        assertFalse(LIC.LIC_11(points,6));

        // this should fail since K_PTS is more than numPoints - 2
        LIC.G_PTS = 5;
        assertFalse(LIC.LIC_11(points,6));
    }
}