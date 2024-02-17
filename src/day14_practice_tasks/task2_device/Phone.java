package day14_practice_tasks.task2_device;

public abstract class Phone extends Device{

    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }
    public void call(long phoneNum){
        System.out.println("Calling: " + phoneNum);
    }
    public void text(long phoneNum){
        System.out.println("Texting: " + phoneNum);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " is turning off");
    }

    @Override
    public String toString() {
        return "Phone{} " + super.toString();
    }
}
