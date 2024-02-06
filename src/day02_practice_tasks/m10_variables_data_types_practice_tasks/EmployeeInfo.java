package m10_variables_data_types.m10_variables_data_types_practice_tasks;

public class EmployeeInfo {

    public static void main(String[] args) {

        String employeeName = "Shay";
        int age = 24;
        char gender = 'F';
        String companyName = "Apple Inc";
        String jobTitle = "SDET";
        double yearsOfExperience = 2.5;
        int salary = 120_000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeId = "B101";

        System.out.println("Employee name: " + employeeName);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Company Name: " + companyName);
        System.out.println("Full time: " + isFullTime);
        System.out.println("Years of experience: " + yearsOfExperience);
        System.out.println("Salary: $" + salary);
        System.out.println("Married: " + isMarried);
    }
}
