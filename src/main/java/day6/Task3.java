package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Tom");
        Teacher teacher = new Teacher("Lisa", "English");

        teacher.evaluate(student.getName());
    }
}
