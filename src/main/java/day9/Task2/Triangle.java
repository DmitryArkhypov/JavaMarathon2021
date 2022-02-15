package day9.Task2;

public class Triangle extends Figure{
    private double a;
    private double b;
    private double c;

    public Triangle(double lengthA, double lengthB, double lengthC, String color) {
        super(color);
        this.a = lengthA;
        this.b = lengthB;
        this.c = lengthC;
    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
