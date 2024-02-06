package day07_practice_tasks;

public class EmployeeClients {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Josh";
        employee1.age = 29;
        employee1.gender = 'M';
        employee1.jobTitle = "Mechanic";
        employee1.salary = 85_000;

        employee1.work();
        employee1.income();
        System.out.println(employee1);

        Employee employee2 = new Employee();
        employee2.name = "Brenda";
        employee2.age = 24;
        employee2.gender = 'F';
        employee2.jobTitle = "Manager";
        employee2.salary = 90_000;

        employee2.work();
        employee2.income();
        System.out.println(employee2);

    }

}
