package day6;

public class Motorbike {
    private String model;
    private String color;
    private int year;

    public Motorbike(String model, String color, int year){
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void info(){
     System.out.println("Это мотоцикл");
 }

    public int yearDifference(int inputYear) {
        int result;
        if (this.year < inputYear) {
            result = inputYear - this.year;
        } else {
            result = this.year - inputYear;
        }
        System.out.println("Мотоциклу " + result + " лет");
        return result;
    }
}