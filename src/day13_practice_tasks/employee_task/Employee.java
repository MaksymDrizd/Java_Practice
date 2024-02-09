package day13_practice_tasks.employee_task;

public class Employee {

    private String name, employeeId, jobTitle;
    private int salary;
    private String companyName;

    public Employee(String name, String employeeId, String jobTitle, int salary, String companyName) {
        setName(name);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
        setCompanyName(companyName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()){
            System.err.println("No input provided");
            System.exit(1);
        }
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        if (employeeId == null || employeeId.isEmpty() || employeeId.isBlank()){
            System.err.println("No input provided");
            System.exit(1);
        }
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle == null || jobTitle.isEmpty() || jobTitle.isBlank()){
            System.err.println("No input provided");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary <= 0){
            System.err.println("Salary can not be zero or negative");
            System.exit(1);
        }
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if (companyName == null || companyName.isEmpty() || companyName.isBlank()){
            System.err.println("No input provided");
            System.exit(1);
        }
        this.companyName = companyName;
    }
    public void work(){
        System.out.println(getJobTitle() + " " + getName() + " is working");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
/*
Employee Task Requirements:
1. Create a subclass of Person named "Employee" with the following specifications:
   Attributes:
       - employeeId: String
       - jobTitle: String
       - salary: double
       - companyName: String

   Encapsulation:
       - Same as previous tasks.

   Constructor:
       - Same as previous tasks.

   Methods:
       - work(): Displays the employee's job title and name.
       - toString(): Returns a string representation of the Employee object.
 */
