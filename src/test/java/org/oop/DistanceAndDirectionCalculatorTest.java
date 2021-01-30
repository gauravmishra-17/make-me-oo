package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PointTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);
        double expectedDistance = 0;

        double actualDistance = origin.distance(origin);

        Assertions.assertEquals(expectedDistance, actualDistance);
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);
        double expectedDistancePoint1 = 1;
        double expectedDistancePoint2 = 1;

        double distancePoint1 = origin.distance(point1);
        double distancePoint2 = origin.distance(point2);

        Assertions.assertEquals(expectedDistancePoint1, distancePoint1);
        Assertions.assertEquals(expectedDistancePoint2, distancePoint2);
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);
        double expectedDistance = 2;

        double actualDistance = point1.distance(point2);

        Assertions.assertEquals(expectedDistance, actualDistance);
    }

    @Test
    void originAndPointOnPositiveXAxisShouldBeZeroRadiansAway() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);
        Point origin = new Point(0, 0);
        double expectedDirectionPoint1 = 0;
        double expectedDirectionPoint2 = 0;

        double actualDirectionPoint1 = origin.direction(point1);
        double actualDirectionPoint2 = origin.direction(point2);

        Assertions.assertEquals(expectedDirectionPoint1, actualDirectionPoint1);
        Assertions.assertEquals(expectedDirectionPoint2, actualDirectionPoint2);
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);
        double expectedDirectionPoint1 = Math.PI;
        double expectedDirectionPoint2 = Math.PI;

        double actualDirectionPoint1 = origin.direction(point1);
        double actualDirectionPoint2 = origin.direction(point2);

        Assertions.assertEquals(expectedDirectionPoint1, actualDirectionPoint1);
        Assertions.assertEquals(expectedDirectionPoint2, actualDirectionPoint2);
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);
        double expectedDirectionPoint1 = Math.PI / 2;
        double expectedDirectionPoint2 = Math.PI / 2;

        double actualDirectionPoint1 = origin.direction(point1);
        double actualDirectionPoint2 = origin.direction(point2);

        Assertions.assertEquals(expectedDirectionPoint1, actualDirectionPoint1);
        Assertions.assertEquals(expectedDirectionPoint2, actualDirectionPoint2);
    }
}