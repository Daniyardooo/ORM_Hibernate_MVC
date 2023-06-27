package app.dao;

import app.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> carList;

    Car car1 = new Car("Tesla", "Plaid", 999);
    Car car2 = new Car("Tesla", "X", 432);
    Car car3 = new Car("Tesla", "Cybertruck", 543);
    Car car4 = new Car("Tesla", "Roadster", 888);
    Car car5 = new Car("Tesla", "Y", 116);


    public CarDaoImpl() {
        carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
    }

    @Override
    public List<Car> GetCarsByNumb(int number) {
        return number >= carList.size() ? carList : carList.stream().limit(number).collect(Collectors.toList());
    }
}
