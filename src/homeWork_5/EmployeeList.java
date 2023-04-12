package homeWork_5;
//2) Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина,
//        Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Иван Иванов, Петр Чернышов, Мария Федорова,
//        Марина Светлова, Мария Савина, Иван Иванов, Мария Рыкова, Анна Крутова, Марина Лугова, Анна Владимирова,
//        Петр Лыков, Иван Мечников, Петр Петин, Петр Лыков, Иван Ежов.
//        Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
//        Отсортировать по убыванию популярности.
import java.util.*;

public class EmployeeList {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
                "Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков",
                "Павел Чернов", "Иван Иванов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Иван Иванов", "Мария Рыкова",
                "Анна Крутова", "Марина Лугова", "Анна Владимирова", "Петр Лыков",
                "Иван Мечников", "Петр Петин", "Петр Лыков", "Иван Ежов"
        );

        // Создаем HashMap для хранения количества повторений каждого имени
        Map<String, Integer> nameCounts = new HashMap<>();

        // Перебираем список сотрудников и увеличиваем счетчик для каждого имени
        for (String name : employees) {
            Integer count = nameCounts.get(name);
            if (count == null) {
                count = 0;
            }
            nameCounts.put(name, count + 1);
        }

        // Создаем список пар (имя, количество повторений) из HashMap
        List<Map.Entry<String, Integer>> nameCountsList = new ArrayList<>(nameCounts.entrySet());

        // Сортируем список по убыванию количества повторений
        Collections.sort(nameCountsList, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return b.getValue().compareTo(a.getValue());
            }
        });

        // Выводим результаты
        System.out.println("Повторяющиеся имена:");
        for (Map.Entry<String, Integer> entry : nameCountsList) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " раз(а)");
            }
        }
    }
}
