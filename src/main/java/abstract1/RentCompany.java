package abstract1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class RentCompany {
    private final List<Car> cars = new ArrayList<>();

    
    public static RentCompany create() {
        return new CarCompany();
    }
    
    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        StringBuilder res = new StringBuilder();
        for (Car car : cars) {
            res.append(car.getName()).append(" : ").append((int) car.getChargeQuantity()).append("리터\n");
        }
        return res.toString();
    }
}
