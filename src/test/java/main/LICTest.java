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
        LIC.RADIUS1 =1;


        Point a = new Point(1,1);
        Point b = new Point(0,0);
        Point c = new Point(2,0);
        Point d = new Point(0.5,0.5);
        Point e = new Point(-2,2);
        Point f = new Point(0.75,0.75);

        // base case
        assertEquals(LIC.LIC_1(new Point[]{a},1),false);

        // circle cented on (1,0)
        Point[] points = {a,b,c};
        assertEquals(LIC.LIC_1(points,3),false);

        // larger
        Point[] points_2 = {a,d,e};
        assertEquals(LIC.LIC_1(points_2,3),true);

        // same line large
        Point[] points_3 = {a,b,d};
        assertEquals(LIC.LIC_1(points_3,3),true);

        // same line small
        Point[] points_4 = {a,d,f};
        assertEquals(LIC.LIC_1(points_4,3),false);

        LIC.RADIUS1 =-1;
        assertEquals(LIC.LIC_1(points,3),false);

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

        // this should fail since G_PTS is more than numPoints - 2
        LIC.G_PTS = 5;
        assertFalse(LIC.LIC_11(points,6));
    }
}