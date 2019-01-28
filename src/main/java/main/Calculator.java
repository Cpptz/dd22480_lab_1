package main;


// add different functions for calculating stuff which is needed for the different condition checks

class Calculator {



    /**
     * All points should be different
     * @param a
     * @param b
     * @param c
     * @return return angle in [0;pi]
     */
    static double computeAngle(Point a, Point b, Point c){
        double scalarProduct = (a.x - b.x)*(c.x- b.x)+(a.y-b.y)*(c.y -b.y);
        double productOfNorms = computeDistance(a,b)*computeDistance(b,c);
        return Math.acos(scalarProduct/productOfNorms);
    }

    /**
     *
     * @param a
     * @param b
     * @param c
     * @return area of a triangle defined by the three points
     */
    static double computeArea(Point a, Point b, Point c) {
        return Math.abs((a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2);

    }

    /**
     *
     * @param a
     * @param b
     * @return distance between two points
     */
    static double computeDistance(Point a, Point b){
        return Math.sqrt(Math.pow((a.x-b.x),2)+Math.pow(a.y-b.y,2));
    }

    /**
     *
     * @param line
     * @param current
     * @return distance between current and the line
     */
    static double distToLine(Line line, Point current) {
        // if point is on line
        if(current.y == line.k * current.x + line.m){
            return 0;
        }

        // if k == 0 (cannot divide with 0)
        if(line.k == 0) {
            return current.y - line.m;
        }

        // otherwise obtain orthogonal line and calculate distance
        double newK = -1/line.k;
        double newM = current.y - newK* current.x;

        double newX = (line.m - newM) / (newK - line.k);
        double newY = newK * newX + newM;
        Point newPoint = new Point(newX, newY);
        return computeDistance(current, newPoint);
    }

    /**
     *
     * @param a
     * @param b
     * @return true if the two points are identical
     */
    static boolean areIdentical(Point a, Point b) {
        if((a.x == b.x) && (a.y == b.y)) {
            return true;
        }
        else
            return false;

    }



    /**
     *
     * @param side_a
     * @param side_b
     * @param side_c
     * @return the radius of circumscribed circle of the triangle defined by the three points
     *     // https://en.wikipedia.org/wiki/Circumscribed_circle#Triangle_centers_on_the_circumcircle_of_triangle_ABC
     */
    static double computeRadiusTriInCircle(double side_a, double side_b, double side_c){
        return ((side_a*side_b*side_c)/(Math.sqrt((side_a + side_b + side_c)*(side_b + side_c - side_a)*(side_c + side_a - side_b)*(side_a + side_b - side_c))));
    }


    /**
     *
     * @param a
     * @param b
     * @param c
     * @return Calculate the radius needed of a circle to envelop a triangle. (Use for lic#8)
     * or max pairwise distance if they are on the same line
     */
    static double computeRadiusTriInCircleFromPoints(Point a, Point b, Point c){

        // all points are on the same line or one is the same as another
        if(computeArea(a,b,c)==0){
            double maxDistance =  Math.max(Math.max(computeDistance(a,b),computeDistance(a,c)), computeDistance(b,c))/2;
            return maxDistance;
        }

        // check if triangle is obtusangle
        double angle1 = computeAngle(a,b,c);
        double angle2 = computeAngle(a,c,b);
        double angle3 = computeAngle(b,a,c);

        if(angle1 > Math.PI/2 || angle2 > Math.PI/2 || angle3 > Math.PI/2)
            return Math.max(Math.max(computeDistance(a,b),computeDistance(a,c)), computeDistance(b,c))/2;

        else{
            // compute radius of the circumcircle of triangle ABC
            double side_a = computeDistance(a,b);
            double side_b = computeDistance(a,c);
            double side_c= computeDistance(b,c);
            return computeRadiusTriInCircle(side_a,side_b,side_c);
        }


    }

    /**
     * 
     * @param a
     * @return the quadrant in which the point is
     */
    static int calcQuadrant(Point a) {
        if(a.x >= 0 && a.y >= 0){
            return 1;
        } 
        if(a.x < 0 && a.y >= 0) {
            return 2;
        }
        if(a.x <= 0 && a.y < 0 ){
            return 3;
        }
        return 4;

    }

}

