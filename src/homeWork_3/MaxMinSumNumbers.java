package homeWork_3;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class MaxMinSumNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 5 целых чисел:");
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }
//        System.out.println("Вот то, что Вы ввели: " + numbers);
        // Находим минимальное и максимальное значение в списке
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        // Находим среднее значение в списке
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += numbers.get(i);
        }
        double average = (double) sum / numbers.size();

        System.out.println("Полученный список: " + numbers);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }
}
