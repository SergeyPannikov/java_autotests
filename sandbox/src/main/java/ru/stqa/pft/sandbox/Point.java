package ru.stqa.pft.sandbox;

public class Point {

    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public double distance(Point p1, Point p2) {
        double sqrt = Math.sqrt(Math.pow(p2.x - p1.x, 2) + (Math.pow(p2.y - p1.y, 2)));
        return sqrt;
    }
}
