package org.procedural;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class DistanceAndDirectionCalculatorTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Assertions.assertEquals(0, DistanceAndDirectionCalculator.distance(0, 0, 0, 0));
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Assertions.assertEquals(1, DistanceAndDirectionCalculator.distance(0, 0, 1, 0));
        Assertions.assertEquals(1, DistanceAndDirectionCalculator.distance(0, 0, 0, 1));
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Assertions.assertEquals(2, DistanceAndDirectionCalculator.distance(-1, 0, 1, 0));
    }

    @Test
    void originAndPointOnPositiveXAxisShouldBeZeroRadiansAway() {
        Assertions.assertEquals(0, DistanceAndDirectionCalculator.direction(0, 0, 1, 0));
        Assertions.assertEquals(0, DistanceAndDirectionCalculator.direction(0, 0, 3, 0));
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Assertions.assertEquals(Math.PI, DistanceAndDirectionCalculator.direction(0, 0, -1, 0));
        Assertions.assertEquals(Math.PI, DistanceAndDirectionCalculator.direction(0, 0, -3, 0));
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Assertions.assertEquals(Math.PI / 2, DistanceAndDirectionCalculator.direction(0, 0, 0, 3));
        Assertions.assertEquals(Math.PI / 2, DistanceAndDirectionCalculator.direction(0, 0, 0, 1));
    }
}
