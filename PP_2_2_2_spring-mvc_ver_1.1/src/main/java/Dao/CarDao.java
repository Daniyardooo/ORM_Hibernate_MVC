package Dao;

import Model.Car;

import java.util.List;

public interface CarDao {
    List<Car> CarsByNumb(int number);
}
