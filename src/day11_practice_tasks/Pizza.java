package day11_practice_tasks;

public class Pizza {

    public String size;
    public int numberOfCheeseToppings,
            numberOfPepperoniToppings;

    public Pizza(String size, int numberOfCheeseToppings, int numberOfPepperoniToppings) {
        this.size = size;
        this.numberOfCheeseToppings = numberOfCheeseToppings;
        this.numberOfPepperoniToppings = numberOfPepperoniToppings;
    }

    public int calCost() {
        int sizePrice = 0;
        if (size.equalsIgnoreCase("Small")) {
            sizePrice = 10;
        } else if (size.equalsIgnoreCase("Medium")) {
            sizePrice = 12;
        } else {
            sizePrice = 14;
        }
        int toppings = (numberOfCheeseToppings + numberOfPepperoniToppings) * 2;
        return sizePrice + toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseToppings=" + numberOfCheeseToppings +
                ", numberOfPepperoniToppings=" + numberOfPepperoniToppings +
                ", Pizza cost=" + calCost() +
                '}';
    }
}
