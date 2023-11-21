package web.model;

public class Car {
    private String model;
    private String color;
    private int number;

    public Car(String model, String color, int number) {
        this.model = model;
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", number=" + number +
                '}';
    }
}
