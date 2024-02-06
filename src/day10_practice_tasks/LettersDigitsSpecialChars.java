package day10_practice_tasks;

public class LettersDigitsSpecialChars {

    public static void main(String[] args) {

        String str = "Wooden Spoon123!";
        String letters = "";
        String digits = "";
        String specialChars = "";
        for (char each : str.toCharArray()) {
            if (Character.isLetter(each)) {
                letters += each;
            }if (Character.isDigit(each)){
                digits += each;
            }if (!Character.isLetterOrDigit(each)){
                specialChars += each;
            }
        }
        System.out.println("letters = \"" + letters + "\";");
        System.out.println("digit = \"" + digits + "\";");
        System.out.println("specialChar = \"" + specialChars + "\";");


    }

}
/*
1. Create a class called LettersDigitsSpecialChars and write a program with the following specifications:
   1.1 Given a string, retrieve and display the letters, digits, and special characters separately.
   Example:

	        Example:
	            str = "Wooden Spoon123!"

	        output:
	            letters= "WoodenSpoon";
	            Digits = "123";
	            specialChars = " !";
 */
