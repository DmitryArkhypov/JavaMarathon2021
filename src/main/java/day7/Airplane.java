package day7;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    // Methods
    public void info(){
        System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %d, вес: %d, количество топлива в баке: %d \n",
                this.manufacturer, this.year, this.length, this.weight, this.fuel);
//        System.out.println("Изготовитель: " + this.manufacturer +
//                        ", год выпуска: " + this.year +
//                        ", длина: " + this.length + ", вес: " + this.weight +
//                        ", количество топлива в баке: " + this.fuel);
    }

    public int fillUp(int n){
        this.fuel += n;
        return fuel;
    }

    public static void compareAirplanes(Airplane airplaneA, Airplane airplaneB) {
        if (airplaneA.getLength() > airplaneB.getLength()){
            System.out.println("The first airplane is longer.");
        } else if (airplaneA.getLength() < airplaneB.getLength()){
            System.out.println("The second airplane is longer.");
        } else if (airplaneA.getLength() == airplaneB.getLength()){
            System.out.println("Airplanes are equal.");
        }
    }



    // seters and geters
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }
}
