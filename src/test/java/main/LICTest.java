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
        LIC.LENGTH1 =60;
        LIC.K_PTS = 2;
        Point a = new Point(0,0);
        Point b = new Point(0,3);
        Point c = new Point(0,20);
        Point d = new Point(20,0);
        Point e = new Point(0,10);

        Point[] points = {a,b,c,d,e};

        assertEquals(LIC.LIC_7(points,5),false);

        Point f = new Point(100, 200);

        Point[] newpoints = {a,b,c,d,e,f};

        assertEquals(LIC.LIC_7(newpoints,6),true);
    }
}