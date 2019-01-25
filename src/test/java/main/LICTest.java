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
    void LIC_5() {
        Point a = new Point(0,0);
        Point b = new Point(0,3);
        Point c = new Point(3,3);
        Point d = new Point(4,3);
        Point e = new Point(2,3);
        Point f = new Point(0,0);

        Point[] points = {a,b,c,d,e,f};

        assertFalse(LIC.LIC_5(points,3));

        assertTrue(LIC.LIC_5(points,6));
    }
}