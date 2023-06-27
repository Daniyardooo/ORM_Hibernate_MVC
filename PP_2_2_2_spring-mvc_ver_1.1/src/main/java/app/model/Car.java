package app.model;

import java.util.Objects;

public class Car {
    String model;
    String series;
    int number;

    public Car(String model, String series, int number) {
        this.model = model;
        this.series = series;
        this.number = number;
    }


    public String getModel() {
        return model;
    }

    public String getSeries() {
        return series;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "app.model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return number == car.number && Objects.equals(model, car.model) && Objects.equals(series, car.series);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, series, number);
    }
}
