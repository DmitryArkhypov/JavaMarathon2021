package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Lisa", "English");
        Student student = new Student("Tom");

        teacher.evaluate(student);
    }
}
