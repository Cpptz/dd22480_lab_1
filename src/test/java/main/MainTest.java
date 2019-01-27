package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    static int NOTUSED = 0;
    static int AND = 1;
    static int OR = 2;


    @Test
    void endToEnd1() {
        LIC.LENGTH1 = 2;
        LIC.RADIUS1 = 4;
        LIC.EPSILON = 0.2;
        LIC.AREA1 = 4;
        LIC.Q_PTS = 2;
        LIC.QUADS = 4;
        LIC.DIST = 3.5;
        LIC.N_PTS = 4;
        LIC.K_PTS = 1;
        LIC.A_PTS = 2;
        LIC.B_PTS = 4;
        LIC.C_PTS = 1;
        LIC.D_PTS = 1;
        LIC.E_PTS = 2;
        LIC.F_PTS = 1;
        LIC.G_PTS = 1;
        LIC.LENGTH2 = 2.4;
        LIC.RADIUS2 = 1.75;
        LIC.AREA2 = 3.45;

        Main.PUV = new boolean[]{true, false, true, false, true, true, false, true, false, false, true, true, false,
                false, true};


        Main.POINTS = new Point[]{
                new Point(8.65,-1.21),
                new Point(8.88,-2.33),
                new Point(-7.02,0.71),
                new Point(-4.40,-9.63),
                new Point(8.10,-9.92),
                new Point(8.31,-9.74),
                new Point(-0.42,1.65),
                new Point(1.87,-3.23),
                new Point(-6.01,-4.24),
                new Point(8.79,-3.73),
                new Point(2.57,8.89),
                new Point(-5.98,4.66),
                new Point(8.30,3.23),
                new Point(-2.93,2.66),
                new Point(1.45,-8.43),
                new Point(-4.28,8.60),
                new Point(7.96,6.53),
        };
        Main.LCM = new int[][]
                {
                        {AND, AND, OR, AND, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED},
                        {AND, AND, OR, OR, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED},
                        {OR, OR, AND, AND, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED},
                        {AND, OR, AND, AND, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED},
                        {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED},
                        {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED},
                        {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED},
                        {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED},
                        {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED},
                        {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED},
                        {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED},
                        {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED},
                        {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED},
                        {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED},
                        {NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED,
                                NOTUSED, NOTUSED, NOTUSED, NOTUSED, NOTUSED},

                };


        assertTrue(Main.decide());



    }
}