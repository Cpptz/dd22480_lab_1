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

        // base case
        assertEquals(LIC.LIC_0(new Point[]{a},1),false);

        Point[] points = {a,b,c};
        assertEquals(LIC.LIC_0(points,3),true);

        assertEquals(LIC.LIC_0(new Point[]{a,c} ,2),false);

        // wrong input
        LIC.LENGTH1 = -1;
        assertEquals(LIC.LIC_0(points,3),false);

    }


    @Test
    void LIC_1() {
        LIC.RADIUS1 =2;


        Point a = new Point(0,1);
        Point b = new Point(0,-1);
        Point c = new Point(0,2);
        Point d = new Point(2,2);
        Point e = new Point(-2,2);

        // base case
        assertEquals(LIC.LIC_1(new Point[]{a},1),false);

        Point[] points = {a,b,c};
        assertEquals(LIC.LIC_1(points,3),true);

        Point[] points_2 = {a,d,e};
        assertEquals(LIC.LIC_1(points_2,3),false);


        LIC.RADIUS1 =-1;
        assertEquals(LIC.LIC_1(points,3),false);

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