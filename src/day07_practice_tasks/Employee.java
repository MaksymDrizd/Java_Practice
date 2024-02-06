package day07_practice_tasks;

public class Employee {

    String name;
    int age;
    char gender;
    String jobTitle;
    double salary;

    public void work(){
        System.out.println(jobTitle + " " + name + " is working");
    }
    public void income(){
        System.out.println(name + " is making $" + salary + " a year, at age of " + age);
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
