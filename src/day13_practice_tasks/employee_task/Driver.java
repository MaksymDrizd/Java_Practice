package day13_practice_tasks.employee_task;

public class Driver extends Employee{

    public Driver(String name, String employeeId, String jobTitle, int salary, String companyName) {
        super(name, employeeId, jobTitle, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is driving.");
    }
}
/*
2.4 Driver:
       - work(): Displays "[name] is driving".

   - Add any additional fields or methods as necessary.
 */
