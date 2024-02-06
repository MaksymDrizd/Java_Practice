package day10_practice_tasks;

import java.sql.PreparedStatement;

public class UpperCaseAndLowerCase {

    public static void main(String[] args) {

        String str = "JAVA java";
        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        for (char each : str.toCharArray()) {
            if (Character.isUpperCase(each)){
                upperCaseCount += 1;
            }if (Character.isLowerCase(each)){
                lowerCaseCount += 1;
            }
        }boolean result = upperCaseCount == lowerCaseCount;
       System.out.println(result);

    }

}
/*
2. Create a class called UpperCaseAndLowerCase and write a program with the following specifications:
   2.1 Given a string, return true if the total number of uppercase characters is equal to the total number of lowercase characters.

	        Eamplex:
	            str = "JAVA java";

	        output:
	            true
 */
