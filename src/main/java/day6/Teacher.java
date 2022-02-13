package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    Teacher(String name, String subject){
    this.name = name;
    this.subject = subject;
    }
    public void evaluate(Student student){
        Random r = new Random();
        String grade = "";
        switch ((r.nextInt(4) + 2)) {
            case 2: {
                grade = "неудовлетворительно";
                break;
            }
            case 3: {
                grade = "удовлетворительно";
                break;
            }
            case 4: {
                grade = "хорошо";
                break;
            }
            case 5: {
                grade = "отлично";
                break;
            }
        }

        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() +
                " по предмету " + this.subject + " на оценку " + grade);
    }

}
