package homeWork_4;

//Урок 4. Хранение и обработка данных ч1: приоритетные коллекции
//        Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;

public class reverseLinkedList {

    public static void main(String[] args) {

        // создаем список

        LinkedList<String> list = new LinkedList<>();


        // добавляем элементы в список

        list.add("A");

        list.add("B");

        list.add("C");

        list.add("D");


        // выводим начальный список

        System.out.println("Исходный список: " + list);


        // вызываем метод, возвращающий перевернутый список

        LinkedList<String> reversedList = reverseLinkedList(list);


        // выводим перевернутый список

        System.out.println("Перевернутый список: " + reversedList);

    }


    public static LinkedList<String> reverseLinkedList(LinkedList<String> list) {

        // создаем новый LinkedList для хранения перевернутого списка

        LinkedList<String> reversedList = new LinkedList<>();


        // проходим по элементам исходного списка в обратном порядке

        // и добавляем их в новый список

        for (int i = list.size() - 1; i >= 0; i--) {

            String element = list.get(i);

            reversedList.add(element);

        }


        // возвращаем перевернутый список

        return reversedList;

    }

}