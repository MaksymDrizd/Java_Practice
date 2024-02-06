package day03_practice_tasks.m11_12_13_operators_practice_tasks;

public class SalaryCalculator {

    public static void main(String[] args) {
        
        double hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate = 0.06;
        double federalTaxRate = 0.26;
        int workWeeks = 52;
        
        double salaryBeforeTax = hourlyRate * weeklyHours * workWeeks;
        double stateTax = salaryBeforeTax * stateTaxRate;
        double federalTax = salaryBeforeTax * federalTaxRate;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is: $" + salaryBeforeTax);
        System.out.println("State Tax is: $" + stateTax);
        System.out.println("Federal Tax is: $" + federalTax);
        System.out.println("Total tax is: $" + totalTax);
        System.out.println("Net income is: $" + salaryAfterTax);

    }
}
