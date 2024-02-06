package day05_practice_tasks;

public class ExtraPractice2 {

    public static void main(String[] args) {



    int hour = 5;

    String result = (hour >= 6 && hour < 12)? "Good morning" : (hour >= 12 && hour < 15)? "Good afternoon"
            : (hour >= 15 && hour <= 22)? "Good evening" : !((hour > 0 && hour < 24))? "This is not a valid hour":
            "failed";
        System.out.println(result);
}
}