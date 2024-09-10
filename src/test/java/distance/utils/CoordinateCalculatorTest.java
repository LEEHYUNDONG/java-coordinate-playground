package distance.utils;

import distance.entity.Coordinate;
import distance.entity.Point;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoordinateCalculatorTest {
    private Coordinate coordinate1;
    private Coordinate coordinate2;
    private static double EXPECTED = 6.403124;


    @BeforeEach
    void setUp() {
        Point point1 = new Point(10);
        Point point2 = new Point(10);
        Point point3 = new Point(14);
        Point point4 = new Point(15);
        coordinate1 = new Coordinate(point1, point2);
        coordinate2 = new Coordinate(point3, point4);
    }

    @Test
    void getDistance() {
        double res = coordinate1.getDistance(coordinate2);
        double expected = 6.403124;

        assertEquals(res, EXPECTED, 0.000001);
    }

}
