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

}
