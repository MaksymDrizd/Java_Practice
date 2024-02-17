package day14_practice_tasks.task1_Cars;

public abstract class Car {

    private final String make,model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        setMake(make);
        this.make = make;
        setModel(model);
        this.model = model;
        setYear(year);
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0)
            throw new RuntimeException("Price can not be negative");
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank())
            throw new RuntimeException("No input");
        this.color = color;
    }
    public void setMake(String make){
        if (make == null || make.isEmpty() || make.isBlank())
            throw new RuntimeException("No input");
    }
    public void setModel(String model){
        if (model == null || model.isEmpty() || model.isBlank())
            throw new RuntimeException("No input");
    }
    public void setYear(int year){
        if (year < 1886)
            throw new RuntimeException("Year can not be less than 1886");
    }
    public abstract void start();
    public abstract void drive();

    public void stop(){
        System.out.println( getMake() + " is stopping");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
