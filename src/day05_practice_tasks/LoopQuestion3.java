package day05_practice_tasks;

public class LoopQuestion3 {

    public static void main(String[] args) {

    int k = 0;
    int m = 0;

        for (int i = 0; i <= 3 ; i++) {
          k++;
          if(i==2){
              i = 4;
          }
          m++;
        }
        System.out.println(k + "," + m);
}
            /*
            k   m   i
            0   0   0 initialisation
            1   1   1
            2   2   2
            3   3   4
            print
             */

}
