package Dao;
import Model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class CarDaoImpl implements CarDao {

    List<Car> carList;

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
    public List<Car> CarsByNumb(int number) {
        return number >= carList.size()? carList : carList.stream().limit(number).collect(Collectors.toList());
    }
}
