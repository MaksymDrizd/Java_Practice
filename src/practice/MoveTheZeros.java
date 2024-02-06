package practice;
import java.util.Arrays;
public class MoveTheZeros {

    public static void main(String[] args) {
        //SECOND SOLUTION:

        int[] array1 = {10, 0, 5, 0, 1, 0};
        swapZeros(array1);
        System.out.println("Reversed Order: " + Arrays.toString(array1));
    }

    private static void swapZeros(int[] arr) {
        int nonZeroContainer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {

                //for swapping

                int temp = arr[i];
                arr[i] = arr[nonZeroContainer];
                arr[nonZeroContainer] = temp;
                nonZeroContainer++;

            }

        }

    }
}
