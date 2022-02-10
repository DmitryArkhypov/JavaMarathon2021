package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Mriya", 2018, 35, 20000);
        airplane.info();

        Airplane airplane1 = new Airplane("Airbus", 2009, 15, 5000);
        airplane1.setYear(1999);
        airplane1.setLength(11);
        airplane1.fillUp(1000);
        airplane1.fillUp(500);
        airplane1.info();
    }
}
