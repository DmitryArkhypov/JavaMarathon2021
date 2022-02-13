package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boing",2012, 24, 5000);
        Airplane airplane2 = new Airplane("Antonov",2018, 24, 15000);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}