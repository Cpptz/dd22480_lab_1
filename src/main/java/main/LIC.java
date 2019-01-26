package main;

public class LIC {
    static double LENGTH1;
    static double RADIUS1;
    static double EPSILON;
    static double AREA1;
    static int Q_PTS;
    static int QUADS;
    static double DIST;
    static int N_PTS;
    static int K_PTS;
    static int A_PTS;
    static int B_PTS;
    static int C_PTS;
    static int D_PTS;
    static int E_PTS;
    static int F_PTS;
    static int G_PTS;
    static double LENGTH2;
    static double RADIUS2;
    static double AREA2;

    public static boolean LIC_0(Point[] points, int numPoints) {

        // make sure input is correct
        if (LENGTH1 < 0) return false;

        // base case
        if (numPoints < 2) return false;

        for (int i = 0; i < numPoints - 1; i++) {
            double distance = Calculator.computeDistance(points[i], points[i + 1]);
            if (distance > LENGTH1) return true;
        }
        return false;
    }

    public static boolean LIC_1(Point[] points, int numPoints) {
        // make sure input is correct
        if (RADIUS1 < 0) return false;

        // base case
        if (numPoints < 3) return false;


        // compute radius for the first two points
        double distance_1 = Calculator.computeRadius(points[0]);
        double distance_2 = Calculator.computeRadius(points[1]);
        for (int i = 2; i < numPoints; i++) {
            //compute radius of the current point
            double distance_3 = Calculator.computeRadius(points[i]);
            if (distance_1 <= RADIUS1 && distance_2 <= RADIUS1 && distance_3 <= RADIUS1) return true;


            // store the two previous ones
            distance_1 = distance_2;
            distance_2 = distance_3;
        }
        return false;
    }



    public static boolean LIC_3(Point[] points, int numPoints) {
        if (AREA1 <= 0) { return false; }
        for (int i = 0; i < numPoints - 2; i++) {
            double triangleArea = Calculator.computeArea(points[i], points[i + 1], points[i + 2]);
            if (triangleArea > AREA1) return true;
        }
        return false;
    }

    public static boolean LIC_5(Point[] points, int numPoints) {
        for (int i = 0; i < numPoints - 1; i++) {
            if (points[i+1].x - points[i].x < 0) return true;
        }
        return false;
    }

    static boolean LIC_6(Point[] points, int numPoints) {
        if(numPoints < 3 || N_PTS < 3 || DIST < 0) {
            return false;
        }
        int first = 0;
        int last = N_PTS-1;

        while(last < numPoints) {
            Line line = new Line(points[first], points[last]);
            for (int i = first + 1; i < last; i++) {
                double dist;
                if (Calculator.areIdentical(points[first], points[last])) {
                    dist = Calculator.computeDistance(points[first], points[i]);

                } else {
                    dist = Calculator.distToLine(line, points[i]);
                    // System.out.println(dist);

                }
                if (dist > DIST) {
                    return true;
                }
            }
            ++first;
            ++last;
        }
        return false;
    }


    public static boolean LIC_7(Point[] points, int numPoints) {

        if (numPoints < 3 || K_PTS < 1 || K_PTS > numPoints - 2)  return false;
        for(int i = 0; i < numPoints-K_PTS-1; i++){
            if(Calculator.computeDistance(points[i], points[i + K_PTS + 1]) > LENGTH1) return true;
        }
        return false;
    }

    public static boolean LIC_11(Point[] points, int numPoints) {
        if (numPoints < 3 || G_PTS < 1 || G_PTS > numPoints - 2)  return false;
        for (int i = 0; i < numPoints - G_PTS - 1; i++) {
            if (points[i+G_PTS+1].x - points[i].x < 0) return true;
        }
        return false;
    }
}
