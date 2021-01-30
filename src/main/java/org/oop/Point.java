package org.oop;

public class Point {
    final double x;
    final double y;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    private double difference(double firstCoordinate, double secondCoordinate) {
        return firstCoordinate - secondCoordinate;
    }

    public double distance(Point point) {
        double xDistance = difference(this.x, point.x);
        double yDistance = difference(this.y, point.y);
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double direction(Point point) {
        double xDistance = difference(point.x, this.x);
        double yDistance = difference(point.y, this.y);
        return Math.atan2(yDistance, xDistance);
    }


}
