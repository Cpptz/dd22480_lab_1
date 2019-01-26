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

    // quadrant

    // distance
    public static double computeDistance(Point a, Point b){
        return Math.sqrt(Math.pow((a.x-b.x),2)+Math.pow(a.y-b.y,2));
    }

    // Calculate the radius needed of a circle to envelop a triangle. (Use for lic#8)
    public static double computeRadiusTriInCircle(double side_a, double side_b, double side_c){
        return ((side_a*side_b*side_c)/(Math.sqrt((side_a + side_b + side_c)*(side_b + side_c - side_a)*(side_c + side_a - side_b)*(side_a + side_b - side_c))));
    }

}
