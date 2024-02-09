package day13_practice_tasks.state_task;

public class StateClients {

    public static void main(String[] args) {

        Florida florida  = new Florida("Florida","FL","Republican","Ron DeSantis","Marco Rubio", 21_780_000,"Tallahassee");
        System.out.println(florida);
        florida.founded();
        System.out.println();

        California california = new California("California","CA","Democratic","Gavin Newsom"," Laphonza Butler ",39_240_000,"Sacramento");
        System.out.println(california);
        california.founded();
        System.out.println();

        Virginia virginia = new Virginia("Virginia","VA","Democratic","Glenn Youngkin"," Mark Warner",8_642_000,"Richmond");
        System.out.println(virginia);
        virginia.founded();
        System.out.println();

        Texas texas = new Texas("Texas","TX","Republican","Greg Abbott","Ted Cruz",30_029_572,"Austin");
        System.out.println(texas);
        texas.founded();

    }

}
