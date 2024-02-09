package day13_practice_tasks.employee_task;

public class Developer extends Employee{

    private String programmingLanguage;

    public Developer(String name, String employeeId, String jobTitle, int salary, String companyName, String programmingLanguage) {
        super(name, employeeId, jobTitle, salary, companyName);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+ getName()+" is coding in " + programmingLanguage);
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                "} ";
    }
}
/*
2.2 Developer:
       - Extra Variable:
           - programmingLanguage: String
       - work(): Displays "[jobTitle] [name] is coding in [programmingLanguage]".
 */
