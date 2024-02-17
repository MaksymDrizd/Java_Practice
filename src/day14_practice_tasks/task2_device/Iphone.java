package day14_practice_tasks.task2_device;

public class Iphone extends Phone implements Downloadable, AppleApps{
    public Iphone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public String AppStoreName() {
        return "App Store";
    }

    @Override
    public String OS() {
        return "IOS";
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " is downloading app");
    }

}
