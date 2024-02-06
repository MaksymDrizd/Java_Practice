package day03_practice_tasks;

public class LogicalOperatorsTask4 {

    public static void main(String[] args) {

        double age = 15.5;

        boolean hasLearningPermit = true;
        boolean hasDriverLicense = false;

        boolean isEligible = (age >= 18.0 && hasDriverLicense) || (age >= 15.5 && hasLearningPermit);

        System.out.println("Is Mike eligible to drive? " + isEligible);
    }
}
