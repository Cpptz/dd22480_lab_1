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


    public static double distToLine(Line line, Point current) {
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

    public static boolean areIdentical(Point a, Point b) {
        if((a.x == b.x) && (a.y == b.y)) {
            return true;
        }
        else
            return false;

    }
}
