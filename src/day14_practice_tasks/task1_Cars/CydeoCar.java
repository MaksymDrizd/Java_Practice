package day14_practice_tasks.task1_Cars;

public class CydeoCar extends Car implements AutoPark,AutoPilot,Flyable{

    public CydeoCar(String make, String model, int year, double price, String color) {
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

    @Override
    public void selfDrive() {
        System.out.println(getMake() + " is self driving");
    }

    @Override
    public void fly() {
        System.out.println(getMake() + " is flying");
    }
}
