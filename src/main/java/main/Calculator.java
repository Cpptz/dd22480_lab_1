package main;


// add different functions for calculating stuff which is needed for the different condition checks

public class Calculator {

    /**
     *
     * @param a
     * @return distance with the origin
     */
    public static double computeRadius(Point a){
        return computeDistance(new Point(0,0), a);
    }

    // calc angle

    // calc area
    public static double computeArea(Point a, Point b, Point c) {
        return Math.abs((a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2);
        // quadrant
    }
    // distance
    public static double computeDistance(Point a, Point b){
        return Math.sqrt(Math.pow((a.x-b.x),2)+Math.pow(a.y-b.y,2));
    }

    // Calculate the radius needed of a circle to envelop a triangle. (Use for lic#8)
    // https://en.wikipedia.org/wiki/Circumscribed_circle#Triangle_centers_on_the_circumcircle_of_triangle_ABC
    public static double computeRadiusTriInCircle(double side_a, double side_b, double side_c){
        return ((side_a*side_b*side_c)/(Math.sqrt((side_a + side_b + side_c)*(side_b + side_c - side_a)*(side_c + side_a - side_b)*(side_a + side_b - side_c))));
    }


    /**
     *
     * @param side_a
     * @param side_b
     * @param side_c
     * @return Calculate the radius needed of a circle to envelop a triangle. (Use for lic#8)
     * or max pairwise distance if they are on the same line
     */
    public static double computeRadiusTriInCircleFromPoints(Point a, Point b, Point c){

        // all points are on the same line
        if(computeArea(a,b,c)==0){
            double maxDistance =  Math.max(Math.max(computeDistance(a,b),computeDistance(a,c)), computeDistance(b,c));
            return maxDistance;
        }

        // compute radius of the circumcircle of triangle ABC
        double side_a = computeDistance(a,b);
        double side_b = computeDistance(a,c);
        double side_c= computeDistance(b,c);
        return ((side_a*side_b*side_c)/(Math.sqrt((side_a + side_b + side_c)*(side_b + side_c - side_a)*(side_c + side_a - side_b)*(side_a + side_b - side_c))));
    }

}
