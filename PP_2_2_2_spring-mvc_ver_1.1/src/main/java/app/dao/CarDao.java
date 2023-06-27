package app.dao;

import app.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> GetCarsByNumb(int number);
}
