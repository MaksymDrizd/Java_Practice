package day11_practice_tasks;

public class CydeoStudentClients {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Max",30,235,'A',"B33",11);
        System.out.println(student1);
        student1.study();
        student1.attendClass();
        student1.printSchoolName();
        student1.printProgLanguage();

    }

}
