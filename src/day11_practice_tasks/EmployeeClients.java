package day11_practice_tasks;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Max", 30,'M',"SDET",140_000);
        System.out.println(employee1);
        employee1.work();

        Employee employee2 = new Employee("Ciara",28,'F',"Developer");
        System.out.println(employee2);
        employee2.work();

    }

}
