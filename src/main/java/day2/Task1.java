package day2;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите этажность дома:  ");
        byte n = enter.nextByte();
        if (n > 0 && n < 5) {
            System.out.println("Малоэтажный дом");
        } else if (n >= 5 && n <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (n >8){
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Не верное значение!");
        }
    }
}
