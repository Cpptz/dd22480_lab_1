package main;

class Line {
    double k, m;

    private Point p1;
    private Point p2;

    Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        getK(p1, p2);
        getM(p1, p2);
    }

    void getK(Point p1, Point p2) {
        this.k = (p1.y-p2.y) / (p1.x-p2.x);
    }

    void getM(Point p1, Point p2) {
        this.m = p1.y - this.k * p1.x;
    }

    boolean isVerticalLine(){
        return this.p1.x == this.p2.x;
    }

    double getHorizontalOffset(){
        return this.p1.x;
    }

}
