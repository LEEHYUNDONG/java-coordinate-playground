package distance.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LineTest {
    private Line firstLine;
    private Line secondLine;
    private Line thirdLine;

    @BeforeEach
    void setUp() {
        firstLine = new Line(new Coordinate(new Point(1), new Point(1)), new Coordinate(new Point(4), new Point(1)));
        secondLine = new Line(new Coordinate(new Point(1), new Point(5)), new Coordinate(new Point(4), new Point(5)));
        thirdLine = new Line(new Coordinate(new Point(1), new Point(2)), new Coordinate(new Point(1), new Point(5)));
    }

    @Test
    @DisplayName("직선 생성 테스트 - 두개의 좌표를 이용하여 직선을 테스트한다.")
    void line_create() {
        Line expected = new Line(new Coordinate(new Point(1), new Point(1)), new Coordinate(new Point(4), new Point(1)));

        assertThat(firstLine.equals(expected)).isTrue();
    }

    @Test
    @DisplayName("평행 - x축에 평행한 직선 확인")
    void line_isParalell() {
        assertThat(secondLine.isParallelLine()).isTrue();
        assertThat(firstLine.isParallelLine()).isTrue();
    }

    @Test
    @DisplayName(("수직 - y축에 평행한 직선 확인"))
    void line_isVertical() {
        assertThat(thirdLine.isVerticalLine()).isTrue();
    }

    @Test
    @DisplayName("교차하지 않는지 확인")
    void isSquare() {
        assertThat(firstLine.isNotCrossed(secondLine)).isTrue();
    }

}
