package day4;
import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        // Инициализация массива
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000);
        }

        int maxValue = numbers[0];
        int minValue = numbers[0];
        int amountElemNull = 0;
        int sumElemNull = 0;

        System.out.println("Массив: " + Arrays.toString(numbers) + "\n");

        // наибольший элемент массива
        for (int number: numbers) {
            if (number > maxValue){
                maxValue = number;
            }
        }
        System.out.println("Наибольший элемент массива: " + maxValue);

        // наименьший элемент массива
         for (int number: numbers) {
            if (number < minValue) {
                minValue = number;
            }
        }
        System.out.println("Наименьший элемент массива: " + minValue);

        // количество элементов массива, оканчивающихся на 0
        // сумму элементов массива, оканчивающихся на 0
        for (int number: numbers) {
            if (number %10 == 0) {
                amountElemNull++;
                sumElemNull += number;
            }
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + amountElemNull);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sumElemNull);



    }
}