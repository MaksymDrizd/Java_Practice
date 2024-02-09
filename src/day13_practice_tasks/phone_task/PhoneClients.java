package day13_practice_tasks.phone_task;

public class PhoneClients {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone("Apple","15 Pro", "512MB",1300,"Silver");
        System.out.println(iPhone);
        iPhone.call("457_295_3713");
        iPhone.text("457_295_3713");

        Samsung samsung = new Samsung("Samsung","Galaxy","256MB",900,"Black");
        System.out.println(samsung);
        samsung.call("457_295_3713");
        samsung.text("457_295_3713");
        samsung.faceTime("457_295_3713");

        Nokia nokia = new Nokia("Nokia","5530","128MB",300,"Navy Blue");
        System.out.println(nokia);
        nokia.call("457_295_3713");
        nokia.text("457_295_3713");
    }

}
/*
4. Create a class named "PhoneClients":
   - Create multiple objects representing different phones.
   - Test the methods and variables of each object.
 */
