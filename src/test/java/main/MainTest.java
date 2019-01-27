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
                new Point(8.65, 8.65),
                new Point(8.88, 8.88),
                new Point(-7.02, -7.02),
                new Point(-4.40, -4.40),
                new Point(8.10, 8.10),
                new Point(8.31, 8.31),
                new Point(-0.42, -0.42),
                new Point(1.87, 1.87),
                new Point(-6.01, -6.01),
                new Point(8.79, 8.79),
                new Point(2.57, 2.57),
                new Point(-5.98, -5.98),
                new Point(8.30, 8.30),
                new Point(-2.93, -2.93),
                new Point(1.45, 1.45),
                new Point(-4.28, -4.28),
                new Point(7.96, 7.96),
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


        assertFalse(Main.decide());



    }
}