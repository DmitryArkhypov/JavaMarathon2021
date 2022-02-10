package day6;


public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        Motorbike motorbike = new Motorbike("Yamaha","Blue", 2017);

        car.info();
        car.yearDifference(2000);
        motorbike.info();
        motorbike.yearDifference(2000);
    }
}
