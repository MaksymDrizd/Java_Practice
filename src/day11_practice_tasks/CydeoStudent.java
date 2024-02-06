package day11_practice_tasks;

public class CydeoStudent {

    public String name;

    public int age, id;
    public char grade;
    public String batchNumber;
    public int groupNumber;

    public static final String schoolName = "Cydeo",
            programmingLanguage = "Java";

    public CydeoStudent(String name, int age, int id, char grade, String batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }
    public void study(){
        System.out.println(name + " is studying.");
    }
    public void attendClass(){
        System.out.println(name + " is attending the live class.");
    }
    public void printSchoolName(){
        System.out.println(schoolName);
    }
    public void printProgLanguage(){
        System.out.println(programmingLanguage);
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", grade=" + grade +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
