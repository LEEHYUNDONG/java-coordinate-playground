package distance.entity;

import java.util.Objects;

public class Line {
    private final Coordinate first;
    private final Coordinate second;

    public Line(Coordinate first, Coordinate second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(first, line.first) && Objects.equals(second, line.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    public boolean isParallelLine() {
        return this.first.isTwoCoordinateParellel(second);
    }

    public boolean isVerticalLine() {
        return this.first.isTwoCoordinateVertical(this.second);
    }

    public boolean isNotCrossed(Line secondLine) {
        // 기울기가 0 이거나 무한이어야함.
        return false;
    }
}
