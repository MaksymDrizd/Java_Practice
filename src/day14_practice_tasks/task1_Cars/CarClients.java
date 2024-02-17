package day14_practice_tasks.task1_Cars;

public class CarClients {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Toyota","Land Cruiser",2017,100_000,"Gray");
        BMW bmw = new BMW("BMW","M3",2022,200_000,"Black");
        Honda honda = new Honda("Honda","Accord",2018,23_000,"Blue");
        Mercedes mercedes = new Mercedes("Mercedes","Sl 450",2020,60_000,"Silver");
        Audi audi = new Audi("Audi","RS 7",2024,150_000,"Grey");
        Tesla tesla = new Tesla("Tesla","Y",2021,50_000,"White");
        Nio nio = new Nio("Nio","ES6",2020,60_000,"Blue");
        CydeoCar cydeoCar = new CydeoCar("Cydeo","B33",2024,240_000,"Red");

        System.out.println(toyota);
        System.out.println(mercedes);
        System.out.println(tesla);
        System.out.println(cydeoCar);

        testFunctions(toyota);
        testFunctions(bmw);
        testFunctions(honda);
        testFunctions(mercedes);
        testFunctions(audi);
        testFunctions(tesla);
        testFunctions(nio);
        testFunctions(cydeoCar);


    }
    public static void testFunctions(Car car){
        car.start();
        car.drive();
        car.stop();
        if (car instanceof AutoPark)
            ((AutoPark)car).autoPark();

        if (car instanceof AutoPilot)
            ((AutoPilot) car).selfDrive();
        if (car instanceof Flyable)
            ((Flyable) car).fly();
        System.out.println();
    }
}
