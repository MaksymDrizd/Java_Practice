package day07_practice_tasks;

public class ItemClients {

    public static void main(String[] args) {

        Item item1 = new Item();
        item1.itemName = "Orange";
        item1.unitPrice = 1.25;
        item1.quantity = 5;

        item1.calcCost();
        System.out.println(item1);

        System.out.println("--------------------------");

        Item item2 = new Item();
        item2.itemName = "Nike Air Max";
        item2.unitPrice = 149.99;
        item2.quantity = 3;

        item2.calcCost();
        System.out.println(item2);

        }


    }
