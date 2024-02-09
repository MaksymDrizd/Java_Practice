package day13_practice_tasks.student_task;

public class StudentClients {

    public static void main(String[] args) {

        Student student = new Student("Robert",35,"Male");
        System.out.println(student);
        System.out.println();

        StudentSubClass student1 = new StudentSubClass("Paul",30,"Male","12445","Engineering",'A',"University Of Houston");
        System.out.println(student1);
        student1.study();
        System.out.println();

        GraduateStudent grad = new GraduateStudent("Monica",25,"Female","63463","Economics and Management",'A',"Boston Economics University");
        System.out.println(grad);
        grad.study();
        System.out.println();

        CydeoStudent cydeoStudent = new CydeoStudent("Rebecca",28,"Female","2352","SDET",'A',"Cydeo",33,11,"Java");
        System.out.println(cydeoStudent);
        cydeoStudent.study();

    }

}
