package day07_practice_tasks;

public class Address {

    int buildingNumber;
    String street, city, state, zipCode;

    public String toString() {
        return "\t" + buildingNumber + " " + street +
                "\n\t" + city + " " + state + ", " + zipCode;
    }

}
