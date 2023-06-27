package app.service;

import app.dao.CarDao;
import app.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }


    public List<Car> GetCarsByNumb(int number) {
        return carDao.GetCarsByNumb(number);
    }

}
