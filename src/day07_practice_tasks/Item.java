package day07_practice_tasks;

public class Item {

    String itemName;
    double unitPrice;
    int quantity;


    public void calcCost(){
        double total = unitPrice * quantity;
        System.out.println("Total cost of the " + itemName + ": $" + total);

    }

    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }
}
