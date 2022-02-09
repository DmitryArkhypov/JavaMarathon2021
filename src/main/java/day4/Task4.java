package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[100];
        int maxSum = 0;
        int indexOfElement = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10001);
        }

        for (int i = 1; i < numbers.length -1; i++){
            int sum = numbers[i-1] + numbers[i] + numbers[i+1];
            if (sum > maxSum) {
                maxSum = sum;
                indexOfElement = i-1;
            }
        }
        System.out.println("Сумма тройки: " + maxSum);
        System.out.println("Индекс первого элемента тройки: " + indexOfElement);
        }
    }

