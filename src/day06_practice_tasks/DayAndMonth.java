package day06_practice_tasks;

public class DayAndMonth {

    public static void main(String[] args) {

        System.out.println(day(5));
        System.out.println(monthName(8));
        System.out.println(daysInMonth(8));

    }
    public static String day(int num1){

        String theDay;
        switch (num1) {
            case 1 -> theDay = "Monday";
            case 2 -> theDay = "Tuesday";
            case 3 -> theDay = "Wednesday";
            case 4 -> theDay = "Thursday";
            case 5 -> theDay = "Friday";
            case 6 -> theDay = "Saturday";
            case 7 -> theDay = "Sunday";
            default -> theDay = "Invalid Number";
        }return theDay;
    }
    public static String monthName(int num1){

        String theMonth;

        switch (num1){
            case 1 -> theMonth = "January";
            case 2 -> theMonth = "February";
            case 3 -> theMonth = "March";
            case 4 -> theMonth = "April";
            case 5 -> theMonth = "May";
            case 6 -> theMonth = "June";
            case 7 -> theMonth = "July";
            case 8 -> theMonth = "August";
            case 9 -> theMonth = "September";
            case 10 -> theMonth = "October";
            case 11 -> theMonth = "November";
            case 12 -> theMonth = "December";
            default -> theMonth = "Invalid Number";
        }return theMonth;
    }
    public static String daysInMonth (int num1){

        String theMonth;
        switch (num1){
            case 1 -> theMonth = "January has 31 days";
            case 2 -> theMonth = "February has 29 days";
            case 3 -> theMonth = "March has 31 days";
            case 4 -> theMonth = "April has 30 days";
            case 5 -> theMonth = "May has 31 days";
            case 6 -> theMonth = "June has 30 days";
            case 7 -> theMonth = "July has 31 days";
            case 8 -> theMonth = "August has 31 days";
            case 9 -> theMonth = "September has 30 days";
            case 10 -> theMonth = "October has 31 days";
            case 11 -> theMonth = "November has 30 days";
            case 12 -> theMonth = "December has 31 days";
            default -> theMonth = "Invalid Number";
        }return theMonth;
    }
}
