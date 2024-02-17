package day14_practice_tasks.task1_Cars;

public class Mercedes extends Car implements AutoPark{

    public Mercedes(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " is starting");
    }

    @Override
    public void drive() {
        System.out.println(getMake() + " is driving");
    }


    @Override
    public void autoPark() {
        System.out.println(getMake() + " has auto park");
    }
}
