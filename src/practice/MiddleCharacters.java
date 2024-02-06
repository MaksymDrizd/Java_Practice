package practice;
import java.util.*;
public class MiddleCharacters {

    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW
        int midChar = word.length()/2;
        if(word.length()%2 == 0){
            System.out.println(word.substring(midChar - 1,midChar + 1));
        }else{
            System.out.println(word.substring(midChar,midChar + 1));
        }


    }
}
