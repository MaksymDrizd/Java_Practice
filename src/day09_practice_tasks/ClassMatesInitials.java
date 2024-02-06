package day09_practice_tasks;

import java.util.Arrays;

public class ClassMatesInitials {

    public static void main(String[] args) {

        //2.1 Create an array of strings named classmates.
        //2.2 Store full names of 10 classmates.
        String [] classmates = {"Robert Pattison", "Liza Cudrow", "Mattew Perry", "Nick Johnson", "Monica Beluchi",
        "Will Smith", "Jack Sparrow", "Johny Depp", "Angelina Jolly", "Sarah Conor"};
        String [] initials = new String[classmates.length];

        //2.3 Print the initials of each student's name in separate lines.
        for (int i = 0; i < classmates.length; i++) {
            String eachName = classmates[i];
            initials[i] = "\n" + eachName.charAt(0) + "." + eachName.charAt(eachName.lastIndexOf(" ")+ 1)+ ".";

        }
        System.out.println(Arrays.toString(initials));

    }

}
