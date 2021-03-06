package main;

class LIC {


    static double PI;
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

    static boolean LIC_0(Point[] points, int numPoints) {

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

    static boolean LIC_1(Point[] points, int numPoints) {
        // make sure input is correct
        if (RADIUS1 < 0) return false;

        // base case
        if (numPoints < 3) return false;


        for (int i = 0; i < numPoints-2; i++) {
            //compute radius of the current point
            double maxDistance = Calculator.computeRadiusTriInCircleFromPoints(points[i], points[i + 1], points[i + 2]);
            if(maxDistance > RADIUS1)
                return true;

        }
        return false;
    }

    public static boolean LIC_2(Point[] points, int numPoints) {
        if(EPSILON < 0 || EPSILON >= Math.PI || numPoints < 3) {
            return false;
        }
        for(int i = 0; i < numPoints - 2; i++) {
            if(!Calculator.areIdentical(points[i], points[i+1]) && !Calculator.areIdentical(points[i+1], points[i+2])) {
                double angle = Calculator.computeAngle(points[i], points[i+1], points[i+2]);
                if(angle < Math.PI - EPSILON || angle > Math.PI + EPSILON) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean LIC_3(Point[] points, int numPoints) {
        if (AREA1 <= 0) { return false; }
        for (int i = 0; i < numPoints - 2; i++) {
            double triangleArea = Calculator.computeArea(points[i], points[i + 1], points[i + 2]);
            if (triangleArea > AREA1 ) return true;
        }
        return false;
    }

    static boolean LIC_4(Point[] points, int numPoints){
        //check the initial input
        if(numPoints < 2 || Q_PTS < 2 || Q_PTS > numPoints || QUADS < 1 || QUADS > 3) {
            return false;
        }
        // Loop through the points and for each point, loop through the consecutive points. This is ineffective.
        for(int i = 0; i < numPoints - (Q_PTS-1); i++){
            int quadsArray[] = {0,0,0,0};
            for(int j= 0; j < Q_PTS; j++){
                int tempQuad = Calculator.calcQuadrant(points[i+j]);
                quadsArray[tempQuad-1] = 1;
            }
            int sum = quadsArray[0] + quadsArray[1] + quadsArray[2] + quadsArray[3];
            if(sum > QUADS) { 
                return true;
            }
            
        }
        return false;
    }

    static boolean LIC_5(Point[] points, int numPoints) {
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

    static boolean LIC_7(Point[] points, int numPoints) {

        if (numPoints < 3 || K_PTS < 1 || K_PTS > numPoints - 2)  return false;
        for(int i = 0; i < numPoints-K_PTS-1; i++){
            if(Calculator.computeDistance(points[i], points[i + K_PTS + 1]) > LENGTH1) return true;
        }
        return false;
    }

    static boolean LIC_8(Point[] points, int numPoints) {

        if(RADIUS1 < 0 ) return false;

        return  setCannotBeContained(points, numPoints, RADIUS1);
    }

    static boolean LIC_9(Point[] points, int numPoints) {
        // base case
        if(numPoints < 5 || C_PTS < 1 || D_PTS < 1 || (C_PTS + D_PTS > numPoints - 3)) {
            return false;
        }

        int first = 0;
        int middle = first + C_PTS + 1;
        int last = middle + D_PTS + 1;

        while(last < numPoints) {
            if(!Calculator.areIdentical(points[first], points[middle]) && !Calculator.areIdentical(points[middle], points[last])) {
                double angle = Calculator.computeAngle(points[first], points[middle], points[last]);
                if (angle < PI - EPSILON || angle > PI + EPSILON) {
                    return true;
                }
            }
            ++first;
            ++middle;
            ++last;
        }
        return false;
    }

    static boolean LIC_10(Point[] points, int numPoints) {
        if (numPoints < 5 || E_PTS < 1 || F_PTS < 1 || E_PTS + F_PTS > numPoints - 3) {
            return false;
        }

        for (int i = 0; i < numPoints - E_PTS - F_PTS - 2; i++) {
            double area = Calculator.computeArea(points[i], points[i + E_PTS + 1], points[i + E_PTS + F_PTS + 2]);
            if (area > AREA1) {
                return true;
            }
        }
        return false;

    }

    static boolean LIC_11(Point[] points, int numPoints) {
        if (numPoints < 3 || G_PTS < 1 || G_PTS > numPoints - 2)  return false;
        for (int i = 0; i < numPoints - G_PTS - 1; i++) {
            if (points[i+G_PTS+1].x - points[i].x < 0) return true;
        }
        return false;
    }

    static boolean LIC_12(Point[] points, int numPoints) {
        if(numPoints < 3 || LENGTH2 < 0 || K_PTS < 1 || K_PTS > numPoints - 2) {
            return false;
        }
        boolean isGreaterThanLENGTH1 = false;
        boolean isLessThanLENGTH2 = false;
        for(int i = 0; i < numPoints - K_PTS - 1; i++) {
            double distance = Calculator.computeDistance(points[i], points[i + K_PTS + 1]);

            if(distance > LENGTH1) {
                isGreaterThanLENGTH1 = true;
            }
            if(distance < LENGTH2) {
                isLessThanLENGTH2 = true;
            }

            if(isGreaterThanLENGTH1 && isLessThanLENGTH2) {
                return true;
            }

        }

        return false;
    }

    static boolean LIC_13(Point[] points, int numPoints) {
        // cannot be contained AND can be contained
        if(RADIUS1 < 0 || RADIUS2 <0 ) return false;

        if(setCannotBeContained(points, numPoints, RADIUS1) && !setCannotBeContained(points, numPoints,RADIUS2)) {
            return true;
        }
        return false;
    }

    static boolean LIC_14(Point[] points, int numPoints){
        if(AREA1 < 0 || AREA2 <0 || E_PTS <1 || F_PTS < 1 || numPoints < 5 || E_PTS + F_PTS > numPoints - 3){
            return  false;
        }

        boolean isGreaterThanAREA1 = false;
        boolean isLessThanAREA2 = false;
        for(int i = 0; i < numPoints-E_PTS - F_PTS-2; i++){
            double area = Calculator.computeArea(points[i], points[i + E_PTS + 1], points[i + E_PTS + F_PTS + 2]);
            if(area > AREA1 )
            {
                isGreaterThanAREA1 = true;
            }
            if(area < AREA2 )
            {
                isLessThanAREA2 = true;
            }
            if(isGreaterThanAREA1 && isLessThanAREA2) return true;
        }
        return false;
    }


    private static Boolean setCannotBeContained(Point[] points, int numPoints, double radius_ref) {
        if(numPoints < 5 || (A_PTS + B_PTS) > (numPoints - 3) || A_PTS < 1 || B_PTS < 1){
            return false;
        }
        int first = 0;
        int middle = first + A_PTS + 1;
        int last = middle + B_PTS + 1;

        while(last < numPoints) {
            double radius = Calculator.computeRadiusTriInCircleFromPoints(points[first], points[middle], points[last]);


            if (radius > radius_ref) {
                return true;
            }

            ++first;
            ++middle;
            ++last;
        }
        return false;
    }
}
