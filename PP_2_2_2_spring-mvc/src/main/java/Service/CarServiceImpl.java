package Service;

import Dao.CarDaoImpl;
import Model.Car;

import java.util.List;

public class CarServiceImpl {
    CarDaoImpl carDao = new CarDaoImpl();


    public List<Car> CarsByNumb(int number){
        return carDao.CarsByNumb(number);
    }

}
