package Model;

public class Car {

    private String model;

    private String series;

    private int number;

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
}
