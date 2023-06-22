package Model;

public class Car {

     String model;

     String series;

     int number;

    public Car(String model, String series, int number) {
        this.model = model;
        this.series = series;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", number=" + number +
                '}';
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
}
