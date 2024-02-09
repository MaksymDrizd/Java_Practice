package day13_practice_tasks.student_task;

public class UndergraduateStudent extends StudentSubClass{
    public UndergraduateStudent(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        super.study();
    }
}
/*
3.2 UndergraduateStudent:
       - Same as GraduateStudent.
 */
