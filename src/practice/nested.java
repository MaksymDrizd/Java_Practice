package practice;

public class nested {

    public static void main(String[] args) {

        int num = 10;
        num = add10(num);
        System.out.println(num);
        }

        public static int add10 (int num){

        num = num + 10;
        return num;
        }

}
