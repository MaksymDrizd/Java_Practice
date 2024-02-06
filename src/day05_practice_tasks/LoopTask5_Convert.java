package day05_practice_tasks;

public class LoopTask5_Convert {

    public static void main(String[] args) {

        System.out.println("KPH\t\tMPH");
        System.out.println("------------");

        for (int i = 20; i <= 140; i += 10) {
            int kph = i;
            double mph = kph * 0.62;

            System.out.println( kph + "\t\t" + (int)mph);
        }
    }
}
