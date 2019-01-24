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
    void LIC_7() {
        LIC.LENGTH1 = 60;
        LIC.K_PTS = 2;

        Point a = new Point(0,0);
        Point b = new Point(0,3);
        Point c = new Point(0,20);
        Point d = new Point(20,0);
        Point e = new Point(0,10);
        Point f = new Point(100, 200);

        Point[] points = {a,b,c,d,e,f};

        // this should fail because only 2 points
        assertFalse(LIC.LIC_7(points,2));

        // this should fail because the distance is not longer than LENGTH1
        assertFalse(LIC.LIC_7(points,5));

        // this should be ok since the distance is longer than LENGTH1
        assertTrue(LIC.LIC_7(points,6));

        // this should fail since K_PTS are less than 1
        LIC.K_PTS = 0;
        assertFalse(LIC.LIC_7(points,6));

        // this should fail since K_PTS is more than numPoints - 2
        LIC.K_PTS = 5;
        assertFalse(LIC.LIC_7(points,6));


    }
}