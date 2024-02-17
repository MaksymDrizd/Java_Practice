package day14_practice_tasks.task3_car_shop;

public class Car {

    private String model,color;
    private int year;
    private double price;

    public Car(String model, String color, int year, double price) {
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
