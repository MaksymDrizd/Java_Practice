package m10_variables_data_types;

public class GuessResultOfVariable {

    public static void main(String[] args) {

        int a, b, c;

        a = 10;
        b = 20;

        c = a;
        a = b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
