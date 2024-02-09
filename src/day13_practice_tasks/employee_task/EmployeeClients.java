package day13_practice_tasks.employee_task;

public class EmployeeClients {

    public static void main(String[] args) {

        Tester tester = new Tester("Richard Logan","23505","Tester",130_000,"Google");
        System.out.println(tester);
        tester.work();
        System.out.println();

        Developer developer = new Developer("Lora Loren","23425","Developer",150_000,"Apple","Java");
        System.out.println(developer);
        developer.work();
        System.out.println();

        Driver driver = new Driver("Nick Chuk Norris", "2342425","Driver",120_000, "Sparta Transport");
        System.out.println(driver);
        driver.work();
        System.out.println();

        Teacher teacher = new Teacher("Miranda Maradonna","35435","Teacher",100_000,"Broward College");
        System.out.println(teacher);
        teacher.work();
    }
}
