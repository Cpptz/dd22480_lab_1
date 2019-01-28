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

        // Only one point when we actually need two, so it should return false
        assertEquals(LIC.LIC_0(new Point[]{a},1),false);


        // distance between a and b is larger than 1 so it should return true
        Point[] points = {a,b,c};
        assertEquals(LIC.LIC_0(points,3),true);

        // they are the same point so there is no distance between them, it should return false
        assertEquals(LIC.LIC_0(new Point[]{a,c} ,2),false);

        // wrong input, LENGTH1 should be >= 0 so it should return false
        LIC.LENGTH1 = -1;
        assertEquals(LIC.LIC_0(points,3),false);

    }


    @Test
    void LIC_1() {
        LIC.RADIUS1 = 1.1;

        Point a = new Point(1,1);
        Point b = new Point(0,0);
        Point c = new Point(2,0);
        Point d = new Point(0.5,0.5);
        Point e = new Point(-2,2);
        Point f = new Point(0.75,0.75);

        // there is only one points when we need three, so it should return false
        assertEquals(LIC.LIC_1(new Point[]{a},1),false);

        // circle cented on (1,0) of radius 1 so less than 1.1, so it should return false
        Point[] points = {a,b,c};
        assertEquals(LIC.LIC_1(points,3),false);

        // distance between d and e is larger than  2*1.1 so it should return false
        Point[] points_2 = {a,d,e};
        assertEquals(LIC.LIC_1(points_2,3),true);

        /* all points are on the same line and the distance between
           a and b is larger than 1.1
         */
        Point[] points_3 = {a,b,d};
        assertEquals(LIC.LIC_1(points_3,3),true);

        /* all points are on the same line and the distance between
          them is smaller than 1.1
         */
        Point[] points_4 = {a,d,f};
        assertEquals(LIC.LIC_1(points_4,3),false);

        // input is invalid
        LIC.RADIUS1 =-1;
        assertEquals(LIC.LIC_1(points,3),false);

    }

    @Test
    void LIC_2() {
        LIC.EPSILON = -1;

        Point a = new Point(0,0);
        Point b = new Point(1,2);
        Point c = new Point(2,0);
        Point[] points = {a, b, c};

        // if EPSILON < 0, it should return false because EPSILON should be >= 0
        assertFalse(LIC.LIC_2(points, 3));

        // if EPSILON > PI, it should return false because EPSILON should be < PI
        LIC.EPSILON = 4;
        assertFalse(LIC.LIC_2(points, 3));

        // if numPoints < 3, we don't have enough point to compute an angle so it should return false
        assertFalse(LIC.LIC_2(points, 2));

        // abc form an angle which is less than pi so less than < pi + 0, so it should return true
        LIC.EPSILON = 0;
        assertTrue(LIC.LIC_2(points, 3));

        // try with three points where the last is the same as the vertex, then the angle is undefined and
        // LIC can not be satisfied so it should return false
        Point d = new Point(0,0);
        Point e = new Point(1,2);
        Point f = new Point(1,2);
        Point[] newpoints = {d, e, f};
        assertFalse(LIC.LIC_2(newpoints, 3));
    }

    @Test
    void LIC_3() {
        LIC.AREA1 = 20;
        Point a = new Point(0,0);
        Point b = new Point(0,1);
        Point c = new Point(2,0);


        Point[] points = {a,b,c};

        // triangle (a,b,c) has an area of 2 which is less than 20, so it should return false
        assertEquals(LIC.LIC_3(points,3),false);

        Point d = new Point(6,0);
        Point e = new Point(20,0);
        Point f = new Point(0,20);
        Point g = new Point(0,0);

        Point[] newpoints = {a,b,c,d,e,f,g};

        // Area of triangle e,f,g is 200 which is bigger than 20 so it should return true
        assertEquals(LIC.LIC_3(newpoints,7),true);

        // AREA should be >= 0 so it should return false
        LIC.AREA1 = -1;
        assertEquals(LIC.LIC_3(newpoints,7),false);
    }

    @Test
    void LIC_4() {
        LIC.QUADS = 2;
        LIC.Q_PTS = 2;
        Point a = new Point(0,0);
        Point b = new Point(-4,3);
        Point c = new Point(-2,-3);
        Point d = new Point(0,-3);
        Point e = new Point(-3,3);

        Point[] points = {a,b,c,d,e};

        // 2 points cannot be in more than two different quadrants so it should return false
        assertEquals(LIC.LIC_4(points,5),false);

        // 3 consecutive points are in different quadrants (a in 1, b in 2, c in 3) so it should return true
        LIC.Q_PTS = 3;
        assertEquals(LIC.LIC_4(points,5),true);

        // (a in 1, b in 2, c in 3, d in 3, e in 2) so there is only three quadrants in our data
        // so not > 3 so it should return false
        LIC.QUADS = 3;
        LIC.Q_PTS = 4;
        assertEquals(LIC.LIC_4(points,5),false);


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

        // for points a,b,c all x values are in increasing so it should return false
        assertFalse(LIC.LIC_5(points,3));

        // e.x  < d.x so it should return true
        assertTrue(LIC.LIC_5(points,6));
    }

    @Test
    void LIC_6() {
        LIC.DIST = 3;
        LIC.N_PTS = 4;
        Point[] points = {
                new Point(3, 3),
                new Point(0, 0),
                new Point(-3, 3),
                new Point(9, 9)};

        // third point is at distance 3*sqrt(2) from the line defined by the first and the fourth point
        // so it should return true
        assertTrue(LIC.LIC_6(points,4));

        // should fail since there are no distances fulfilling the requirements that are larger than DIST
        LIC.DIST = 10;
        assertFalse(LIC.LIC_6(points,4));

        // first and last point are the same so we have a coincident point
        // distance between third point and this coincident is larger than 10
        Point[] points_1 = {
                new Point(0, 0),
                new Point(10, 0),
                new Point(0, 11),
                new Point(0, 0)};
        assertTrue(LIC.LIC_6(points_1,4));





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
    void LIC_8() {
        LIC.RADIUS1 = 10;
        LIC.A_PTS = 2;
        LIC.B_PTS = 2;
        Point[] points = {
                new Point(3, 3),
                new Point(6, 3),
                new Point(6, 6),
                new Point(9, 3),
                new Point(9, 4),
                new Point(13, 1),
                new Point(13, 4)};

        // should pass because there is a set which cannot be contained within RADIUS1
        assertTrue(LIC.LIC_8(points, points.length));

        // should fail because there are no sets which cannot be contained within RADIUS1
        LIC.RADIUS1 = 11;
        assertFalse(LIC.LIC_8(points, points.length));
    }

    @Test
    void LIC_9() {
        LIC.PI = 3.1415926535;
        LIC.EPSILON = 0.05;
        LIC.C_PTS = 1;
        LIC.D_PTS = 1;

        Point[] points = {
                new Point(0,1),
                new Point(0.5,Math.sqrt(3)/2),
                new Point(1,0),
                new Point(0.5,-Math.sqrt(3)/2),
                new Point(0, -1),
                new Point(-0.4, -Math.sqrt(0.84)),
                new Point(-1,0),
                new Point(-0.4, Math.sqrt(0.84))};

        // should pass since there is an angle > PI - EPSILON
        assertTrue(LIC.LIC_9(points, points.length));

        // should fail since there is no angle < PI - EPSILON nor an angle > PI + EPSILON
        LIC.EPSILON = 1.8;
        assertFalse(LIC.LIC_9(points, points.length));
    }


    @Test
    void LIC_10() {
        LIC.AREA1 = 1;
        LIC.E_PTS = 2;
        LIC.F_PTS = 1;

        Point a = new Point(0,0);
        Point b = new Point(5,0);
        Point c = new Point(0,5);
        Point d = new Point(0,2);
        Point e = new Point(2,0);
        Point f = new Point(3,0);
        Point[] points = {a, b, c, d, e, f};

        assertTrue(LIC.LIC_10(points, 6));

        // if numPoints is to small
        assertFalse(LIC.LIC_10(points, 5));

        // if the area is to small
        LIC.AREA1 = 15;
        assertFalse(LIC.LIC_10(points, 6));

        // if intervening points are < 1
        LIC.E_PTS = 0;
        assertFalse(LIC.LIC_10(points, 6));

        // if to many intervening points
        LIC.F_PTS = 2;
        assertFalse(LIC.LIC_10(points, 6));
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

    @Test
    void LIC_12() {
        LIC.K_PTS = 2;
        LIC.LENGTH1 = 5;
        LIC.LENGTH2 = 20;

        Point a = new Point(0,0);
        Point b = new Point(1,0);
        Point c = new Point(2,0);
        Point d = new Point(0,4);
        Point e = new Point(0,5);
        Point f = new Point(0,8);

        Point[] points = {a, b, c, d, e, f};

        // false if numPoints < 3
        assertFalse(LIC.LIC_12(points, 2));

        //Should fail because distance is less than LENGTH1
        assertFalse(LIC.LIC_12(points, 3));

        //Should be true since distance is greater than LENGTH1 and less than LENGTH2
        assertTrue(LIC.LIC_12(points, 6));

        LIC.K_PTS = 0;
        //Should fail since K_PTS less than 1
        assertFalse(LIC.LIC_12(points, 6));

        LIC.K_PTS = 5;
        //Should fail since K_PTS is more than numPoints - 2.
        assertFalse(LIC.LIC_12(points, 6));

        LIC.K_PTS = 2;
        LIC.LENGTH2 = 2;
        //Should fail since distance is greater than LENGTH2
        assertFalse(LIC.LIC_12(points,6));
    }

    @Test
    void LIC_13() {
        LIC.RADIUS1 = 10;
        LIC.RADIUS2 = 11;
        LIC.A_PTS = 2;
        LIC.B_PTS = 2;
        Point[] points = {
                new Point(3, 3),
                new Point(6, 3),
                new Point(6, 6),
                new Point(9, 3),
                new Point(9, 4),
                new Point(13, 1),
                new Point(13, 4)};
        // should pass because there is at least one set which cannot be contained
        assertTrue(LIC.LIC_13(points, points.length));

        // should fail because RADIUS2 is smaller than RADIUS1
        LIC.RADIUS2 = 9;
        assertFalse(LIC.LIC_13(points, points.length));
    }

    @Test
    void LIC_14(){


        LIC.AREA1 = 1;
        LIC.AREA2 = 4;
        LIC.E_PTS = 2;
        LIC.F_PTS = 1;

        Point a = new Point(0,0);
        Point b = new Point(20,0);
        Point c = new Point(0,3);
        Point d = new Point(0,1.5);
        Point e = new Point(0.25,0);
        Point f = new Point(2, 0);

        Point[] points = {a,b,c,d,e,f};

        assertTrue(LIC.LIC_14(points,6));

        // numPoints too small
        assertFalse(LIC.LIC_14(points, 5));

        // area of triangle (a,d,f) = 1.5 which is less than 2
        LIC.AREA1 = 2;
        assertFalse(LIC.LIC_14(points, 6));

        // area of triangle (a,d,f) = 1.5 which is > 1.25
        LIC.AREA1 = 1;
        LIC.AREA2 = 1.25;
        assertFalse(LIC.LIC_14(points, 6));

        /*
         not the same set of points which pass conditions
         area of triangle (a,c,e) = 0.75/2 <0.5
         area of triangle (b,c,f) = 13.5 > 12
          */
        LIC.AREA1 = 12;
        LIC.AREA2 = 0.5;
        LIC.E_PTS = 1;
        assertTrue(LIC.LIC_14(points, 6));

        // too much intervening points
        LIC.E_PTS = 2;
        LIC.F_PTS = 2;
        assertFalse(LIC.LIC_14(points, 6));

    }
}