package day09_practice_tasks;
import java.util.Arrays;
public class practice {

    public static void main(String[] args) {

        // 6.1 Create an array of strings named classmates.
        // 6.2 Store full names of 10 classmates.
        String[] classmates = {"Daniel Novak", "James Connor", "Joseph Adelman",
                "Lucas Barr", "Liam Lum", "William Forbis", "Michael Johnson",
                "Ava Carter", "Robert Peterson", "Brian Long"};

        String[] classmatesReversed = new String[classmates.length];

        // 6.3 Reverse each student's name and print them on separate lines.
        for (int i = 0, j = 0; i < classmates.length; i++, j++) {

            classmatesReversed[j] = classmates[i].substring(classmates[i].indexOf(" ")) + " " + classmates[i].substring(0, classmates[i].indexOf(" "));
            System.out.println(classmatesReversed[i]);

        }


    }
}
