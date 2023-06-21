package Service;

import Dao.CarDaoImpl;
import Model.Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla","Plaid",999);
        Car car2 = new Car("Tesla","X",432);
        Car car3 = new Car("Tesla","Cybertruck",543);
        Car car4 = new Car("Tesla","Roadster",888);
        Car car5 = new Car("Tesla","Y",116);

        List<Car> carList = new ArrayList<>();
        Collections.addAll(carList,car1,car2,car3,car4,car5);





    }
}
