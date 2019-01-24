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
    void LIC_3() {
        LIC.AREA1 = 20;
        Point a = new Point(0,0);
        Point b = new Point(0,1);
        Point c = new Point(2,0);


        Point[] points = {a,b,c};

        assertEquals(LIC.LIC_3(points,3),false);

        Point d = new Point(6,0);
        Point e = new Point(70,0);
        Point f = new Point(0,24);
        Point g = new Point(4,21);

        Point[] newpoints = {a,b,c,d,e,f,g};

        assertEquals(LIC.LIC_3(newpoints,7),true);

        LIC.AREA1 = -1;

        assertEquals(LIC.LIC_3(newpoints,7),false);
    }
}