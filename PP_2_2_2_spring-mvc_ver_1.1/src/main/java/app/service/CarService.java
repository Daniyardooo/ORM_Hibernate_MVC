package app.service;

import app.model.Car;

import java.util.List;

public interface CarService {
    List<Car> GetCarsByNumb(int number);

}
