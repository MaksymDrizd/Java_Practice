package day05_practice_tasks;

public class LabelPractice {

    public static void main(String[] args) {

        int counter = 0;

        outer:
        for (int i = 0; i <= 10; i++) {

            inner:
            for (int j = 4; j >= 0; j++) {

                if (i == j) {

                    break outer;
                } else {

                    counter++;
                    break inner;
                }
            }

        }
        System.out.println(counter);
    }
}
