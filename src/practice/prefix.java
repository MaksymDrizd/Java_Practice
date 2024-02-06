package practice;
import java.util.Scanner;
public class prefix {

    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        //WRITE YOUR CODE BELOW

        String pref = str.substring(0, n);
        String withoutPrefix = str.substring(pref.length());
        boolean result = true;
        if (withoutPrefix.contains(pref)) {
            System.out.println(result);
            System.out.println("\'" + pref + "\' is the prefix because n is " + n + ", and the character \'" + pref + "\' are found again in the String " + withoutPrefix);
        }else{
            System.out.println(!result);
            System.out.println("\'" + pref + "\' is the prefix because n is " + n + ", and the character \'" + pref + "\' are NOT found again in the String " + withoutPrefix);
        }
    }
}
