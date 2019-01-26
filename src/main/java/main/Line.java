package main;

class Line {
    double k, m;

    Line(Point p1, Point p2) {
        getK(p1, p2);
        getM(p1, p2);
    }

    void getK(Point p1, Point p2) {
        this.k = (p1.y-p2.y) / (p1.x-p2.x);
    }

    void getM(Point p1, Point p2) {
        this.m = p1.y - this.k * p1.x;
    }

}
