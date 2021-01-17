package org.oop;

public class Point {
    final double x;
    final double y;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    private static double difference(double firstCoordinate, double secondCoordinate) {
        return firstCoordinate - secondCoordinate;
    }

    public static double distance(Point to, Point from) {
        double xDistance = difference(to.x, from.x);
        double yDistance = difference(to.y, from.y);
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public static double direction(Point to, Point from) {
        double xDistance = difference(from.x, to.x);
        double yDistance = difference(from.y, to.y);
        return Math.atan2(yDistance, xDistance);
    }


}
