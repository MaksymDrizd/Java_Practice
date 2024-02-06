package practice;

import java.util.Scanner;

public class ContainsJava {
    public static void main(String[] args) {

            //DO NOT TOUCH THESE LINE/LINES
            boolean exists = false;
        Scanner scan = new Scanner(System.in);
            String word = scan.next();

            //WRITE YOUR CODE BELOW:
            if (word.length() < 4) {
                System.out.println(exists);
            }
            else if (word.substring(0,5).contains("java")) {
                System.out.println(!exists);
            }else{
                System.out.println(exists);
            }
    }
}// || word.substring(1).contains("java")
