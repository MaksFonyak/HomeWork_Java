package homeWork_2;
//1.Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.
//        (через FileWriter).

import java.io.FileWriter;
import java.io.IOException;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        try {
            FileWriter writer = new FileWriter("log.txt");
            writer.write("Исходный массив: ");
            printArray(arr, writer);
            writer.write("\n");

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;

                        writer.write("Итерация " + (i * (arr.length - 1) + j + 1) + ": ");
                        printArray(arr, writer);
                        writer.write("\n");
                    }
                }
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printArray(int[] arr, FileWriter writer) throws IOException {
        for (int i = 0; i < arr.length; i++) {
            writer.write(arr[i] + " ");
        }
    }
}

