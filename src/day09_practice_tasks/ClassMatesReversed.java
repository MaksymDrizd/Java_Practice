package day09_practice_tasks;

import java.util.Arrays;

public class ClassMatesReversed {

    public static void main(String[] args) {

        String [] classmates = {"Robert Pattison", "Liza Cudrow", "Mattew Perry", "Nick Johnson", "Monica Beluchi",
                "Will Smith", "Jack Sparrow", "Johny Depp", "Angelina Jolly", "Sarah Conor"};
        String [] reversed = new String[classmates.length];


            for (int i = classmates.length- 1, j = 0; i >= 0; i--, j++) {
                reversed[j] = "\n" + classmates[i].substring(classmates[i].indexOf(" ") + 1) + " "
                        + classmates[i].substring(0,classmates[i].indexOf(" "));

        }
            System.out.println(Arrays.toString(reversed));
    }
}
/*
6. Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.
 */
