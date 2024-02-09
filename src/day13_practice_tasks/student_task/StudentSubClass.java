package day13_practice_tasks.student_task;

public class StudentSubClass extends Student{
    private String studentId, fieldOfStudy;
    private char grade;
    private String schoolName;

    public StudentSubClass(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (studentId == null || studentId.isEmpty() || studentId.isBlank()){
            System.err.println("No input provided");
            System.exit(1);
        }
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy == null || fieldOfStudy.isEmpty() || fieldOfStudy.isBlank()){
            System.err.println("No input provided");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (grade < 'A' && grade >'F'){
            System.err.println("Invalid grade");
            System.exit(1);
        }
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if (schoolName == null || schoolName.isEmpty() || schoolName.isBlank()){
            System.err.println("No input provided");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }
    public void study(){
        System.out.println(getName() + " is a student of " + getSchoolName() + " school");
    }

    @Override
    public String toString() {
        return  super.toString() +
                "studentId='" + studentId + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                "} ";
    }
}
