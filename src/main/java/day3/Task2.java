package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            double a;
            int b;
            System.out.println("Введите делимое: ");
            a = in.nextDouble();
            System.out.println("Введите делитель: ");
            b = in.nextInt();
            if (b == 0){
                System.out.println("Нельзя делить на ноль!");
                break;
            }
            System.out.println("Ваш результат: " + (a/b));
        }
    }
}
