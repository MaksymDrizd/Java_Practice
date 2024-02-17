package day14_practice_tasks.task2_device;

public abstract class Device {

    private final String brand, model;
    private double price;
    private String color;
    private final String size;
    private boolean hasBattery;
    private boolean hasPowerButton;

    public Device(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        setBrand(brand);
        this.brand = brand;
        setModel(model);
        this.model = model;
        setPrice(price);
        setColor(color);
        setSize(size);
        this.size = size;
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0)
            throw new RuntimeException("Price must be positive");
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank() || color.isEmpty())
            throw new RuntimeException("Please provide input");
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }
    public void setBrand(String brand){
        if (brand == null || brand.isBlank() || brand.isEmpty())
            throw new RuntimeException("Please provide input");
    }
    public void setModel(String model){
        if (model == null || model.isBlank() ||model.isEmpty())
            throw new RuntimeException("Please provide input");
    }
    public void setSize(String size){
        if (size == null || size.isBlank() || size.isEmpty())
            throw new RuntimeException("Please provide input");
    }
    public abstract void turnOn();
    public abstract void turnOff();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
