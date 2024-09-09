package abstract1;

public class K5 extends Car {
    private String name;
    private int tripDistance;
    public K5(int tripDistance) {
        name = "K5";
        this.tripDistance = tripDistance;
    }

    @Override
    double getDistancePerLiter() {
        return 13.0;
    }

    @Override
    double getTripDistance() {
        return tripDistance;
    }

    @Override
    String getName() {
        return this.name;
    }
}
