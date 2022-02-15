package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Vova", "Group 1");
        Teacher teacher = new Teacher("Lisa","Math");

        System.out.println("название учебной группы - " + student.getGroupName());
        System.out.println("Название предмета - " + teacher.getSubjectName());
        System.out.println();

        student.printInfo();
        System.out.println();
        teacher.printInfo();
    }
}
