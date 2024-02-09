package day13_practice_tasks.employee_task;

public class Tester extends Employee{

    public Tester(String name, String employeeId, String jobTitle, int salary, String companyName) {
        super(name, employeeId, jobTitle, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+ getName()+" is testing.");
    }
}
/*
2. Create the following subclasses of Employee:
   2.1 Tester:
       - work(): Displays "[jobTitle] [name] is testing".
 */
