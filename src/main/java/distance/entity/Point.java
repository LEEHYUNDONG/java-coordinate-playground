package distance.entity;

public class Point {
    private double x;

    public Point(double x) {
        this.x = x;
    }

    public boolean samePoint(int number) {
        return x == number;
    }
    public double minus(Point other){
        return x - other.getX();
    }

    private double getX() {
        return x;
    }
}
