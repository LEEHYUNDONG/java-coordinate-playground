package abstract1;

public class Avante extends Car {
    private String name;
    private int tripDistance;

    public Avante(int tripDistance) {
        name = "Avante";
        this.tripDistance = tripDistance;
    }

    @Override
    double getDistancePerLiter() {
        return 15;
    }

    @Override
    double getTripDistance() {
        return this.tripDistance;
    }

    @Override
    String getName() {
        return this.name;
    }
}
