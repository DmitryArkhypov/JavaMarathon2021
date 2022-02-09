package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int m = 12;
        int n = 8;
        int sumLine = 0;
        int maxDigitOfLine = 0;
        int indexOfLine = 0;
        int[][] numbers = new int[m][n];
        int[] index = new int[m];

        // Заполняем массив
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(51);
            }
        }

        // Сумма каждой строки
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sumLine += numbers[i][j];
            }
            index[i] = sumLine;
            System.out.println(Arrays.toString(numbers[i]) + "      // Сумма - " + sumLine);
            sumLine = 0;
        }
        System.out.println();
        System.out.println(Arrays.toString(index));

        // Выводим индекс строки, сумма чисел в которой максимальна
        for (int i = 0; i < index.length; i++) {
            if (index[i] >= maxDigitOfLine){
                maxDigitOfLine = index[i];
                indexOfLine = i;
            }
        }
        System.out.println("Максимальное число: " + maxDigitOfLine);
        System.out.println("Ответ: " + indexOfLine + " (индекс строки, сумма чисел в которой максимальна)");
    }
}
