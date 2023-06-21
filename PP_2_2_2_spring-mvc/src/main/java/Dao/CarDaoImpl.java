package Dao;

import Model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImpl implements CarDao {

    List<Car> carList;

    Car car1 = new Car("Tesla", "Plaid", 999);
    Car car2 = new Car("Tesla", "X", 432);
    Car car3 = new Car("Tesla", "Cybertruck", 543);
    Car car4 = new Car("Tesla", "Roadster", 888);
    Car car5 = new Car("Tesla", "Y", 116);


    public CarDaoImpl(Car car1, Car car2, Car car3, Car car4, Car car5) {
        Collections.addAll(carList, car1, car2, car3, car4, car5);
    }

    public CarDaoImpl() {
    }

    @Override
    public List<Car> CarsByNumb(int number) {
        return carList.stream().limit(number).collect(Collectors.toList());
    }
}
