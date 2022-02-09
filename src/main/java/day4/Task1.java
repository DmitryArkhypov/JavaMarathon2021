package day4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        int sumlength = 0;
        int sum = 0;
        int sum8 = 0;
        int sum1 = 0;
        int sumchet = 0;
        int sumnechet =0;

        // Массив
        System.out.println("Введи размер массива: ");
        int[] numbers = new int[in.nextInt()];

        // Инициализация элементов массива
        for (int i=0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10);
            // Сортировка массива
            Arrays.sort(numbers);
        }

        for (int number:numbers) {
            // а) Длина массива
            sumlength++;
            // б) Количество чисел больше 8
            if (number > 8) {
                sum8++;
            }
            // в) Количество чисел равных 1
            if (number == 1) {
                sum1++;
            }
            // г) Количество четных чисел
            if (number % 2 == 0 && !(number == 0)) {
                sumchet++;
            }
            // д) Количество нечтных чисел
            if (!(number % 2 == 0)) {
                sumnechet++;
            }
            // е) Сумма всех элементов массива
            sum += number;

        }

        System.out.println("Массив: \n" + Arrays.toString(numbers) + "\n");
        System.out.println("Информация о массиве: ");
        System.out.println("а) Длина массива = " + sumlength);
        System.out.println("б) Количество чисел больше 8: " + sum8);
        System.out.println("в) Количество чисел равных 1: " + sum1);
        System.out.println("г) Количество четных чисел = " + sumchet);
        System.out.println("д) Количество нечтных чисел = " + sumnechet);
        System.out.println("е) Сумма всех элементов массива = " + sum);
        // Работа с массивами с пакетом Arrays
        System.out.println("е) Сумма всех элементов массива = " + Arrays.stream(numbers).sum());
        System.arraycopy(numbers, 1, numbers,  5,  4);
        System.out.println(Arrays.toString(numbers));
    }
}
