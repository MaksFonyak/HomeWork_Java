package homeWork_3;

//2. Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.Scanner;
import java.util.ArrayList;

public class RemNum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 5 целых чисел:");
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }
        System.out.println("Вот то, что Вы ввели: " + numbers);


        // Удаление четных чисел из списка
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
                i--;
            }
        }

        System.out.println("Вот то, что получилось после удаления четных чисел: " + numbers);
    }
}
