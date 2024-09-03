package abstract1;

import java.util.ArrayList;
import java.util.List;

public abstract class RentCompany {
    private final List<Car> cars = new ArrayList<>();

    
    public static RentCompany create() {
        return new CarCompany();
    }
    
    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        return "";
    }
}
