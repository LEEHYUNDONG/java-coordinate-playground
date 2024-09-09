package abstract1;

public class Sonata extends Car {
    private String name;
    private int tripDistance;
    private int engineEfficiency;

    public Sonata(int tripDistance) {
        this.name = "Sonata";
        this.tripDistance = tripDistance;
    }

    @Override
    double getDistancePerLiter() {
        return 10;
    }

    @Override
    double getTripDistance() {
        return tripDistance;
    }

    @Override
    String getName() {
        return "Sonata";
    }
}
