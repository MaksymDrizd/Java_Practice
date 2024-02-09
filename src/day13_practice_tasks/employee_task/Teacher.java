package day13_practice_tasks.employee_task;

public class Teacher extends Employee{
    public Teacher(String name, String employeeId, String jobTitle, int salary, String companyName) {
        super(name, employeeId, jobTitle, salary, companyName);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is teaching.");
    }
}
/*
2.3 Teacher:
       - work(): Displays "[name] is teaching".
 */
