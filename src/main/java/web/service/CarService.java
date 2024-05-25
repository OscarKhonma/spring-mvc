package web.service;

import lombok.Data;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Service
public class CarService {
    private List<Car> cars = Arrays.asList(new Car(1, "MERCEDES", "WHITE"),
            new Car(2, "BMW", "WHITE"),
            new Car(3, "AUDI", "WHITE"),
            new Car(4, "JAGUAR", "WHITE"),
            new Car(5, "JEEP", "WHITE"));

    public List<Car> getCars(int count) {
        if (count < 5) {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
        return cars;

    }

}
