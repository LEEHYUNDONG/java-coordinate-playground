package distance.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoordinateTest {
    private Point point1;
    private Point point2;
    private Coordinate coordinate;

    @BeforeEach
    void setUp() {
        point1 = new Point(1);
        point2 = new Point(2);
        coordinate = new Coordinate(point1, point2);
    }

    @Test
    void makeOnePoint() {
        assertThat(point1.samePoint(1)).isTrue();
    }

    @Test
    void makeTwoPoints() {
        assertThat(coordinate.equals(new Coordinate(point1, point2))).isTrue();
    }
}
