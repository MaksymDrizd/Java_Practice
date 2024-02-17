package day14_practice_tasks.task2_device;

public class Google extends Phone implements Downloadable,AndroidApps{
    public Google(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public String AppStoreName() {
        return "Google Play";
    }

    @Override
    public String OS() {
        return "Android";
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " is downloading app");
    }
}
