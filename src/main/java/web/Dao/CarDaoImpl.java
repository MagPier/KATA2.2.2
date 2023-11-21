package web.Dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    private List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> create5Car() {
        cars.add(new Car("Toyota", "Black", 444));
        cars.add(new Car("Mersedes", "White", 333));
        cars.add(new Car("Porshe", "Purple", 111));
        cars.add(new Car("Subaru", "Green", 666));
        cars.add(new Car("Ford", "Yellow", 777));
        return cars;
    }
}
