package homeWork_3;
//Урок 3. Коллекции JAVA: Введение
//        1. Реализовать алгоритм сортировки слиянием
import java.util.Arrays;


public class MergeSort {

    public static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            // Разбиваем массив на две половины
            int mid = arr.length / 2;
            int[] leftArr = Arrays.copyOfRange(arr, 0, mid);
            int[] rightArr = Arrays.copyOfRange(arr, mid, arr.length);

            // Рекурсивно сортируем каждую половину
            mergeSort(leftArr);
            mergeSort(rightArr);

            // Объединяем отсортированные половины в один массив
            int i = 0, j = 0, k = 0;
            while (i < leftArr.length && j < rightArr.length) {
                if (leftArr[i] < rightArr[j]) {
                    arr[k] = leftArr[i];
                    i++;
                } else {
                    arr[k] = rightArr[j];
                    j++;
                }
                k++;
            }
            while (i < leftArr.length) {
                arr[k] = leftArr[i];
                i++;
                k++;
            }
            while (j < rightArr.length) {
                arr[k] = rightArr[j];
                j++;
                k++;
            }
        }
    }

}
