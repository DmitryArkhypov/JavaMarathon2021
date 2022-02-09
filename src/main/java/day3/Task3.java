package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int i = 0; i <5; i++) {
            System.out.println("Введите делимое: ");
            double a = in.nextDouble();
            System.out.println("Введите делитель: ");
            int b = in.nextInt();
            if (b == 0){
                System.out.println("Деление на ноль!");
                continue;
            }
            System.out.println("Ваш результат: " + (a/b));
        }
    }
}
