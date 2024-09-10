package distance.entity;

import java.util.Objects;

public class Coordinate {
    private final Point x;
    private final Point y;

    public Coordinate(Point x, Point y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Coordinate coordinate2) {
        return Math.sqrt(Math.pow(this.x.minus(coordinate2.getX()), 2) + Math.pow(this.y.minus(coordinate2.getY()), 2));
    }

    private Point getX() {
        return x;
    }

    private Point getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return Objects.equals(x, that.x) && Objects.equals(y, that.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

}
