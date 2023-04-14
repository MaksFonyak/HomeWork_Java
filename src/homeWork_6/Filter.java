package homeWork_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Filter {
    public static void filterLaptops(Set<Laptop> laptops, Map<String, Object> filter) {
        List<Laptop> filteredLaptops = new ArrayList<>();
        for (Laptop laptop : laptops) {
            boolean add = true;
            for (Map.Entry<String, Object> entry : filter.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                switch (key) {
                    case "ОЗУ":
                        if (laptop.getRam() < (int) value) {
                            add = false;
                        }
                        break;
                    case "Обьем ЖД":
                        if (laptop.getStorage() < (int) value) {
                            add = false;
                        }
                        break;
                    case "ОС":
                        if (!laptop.getOs().equals(value)) {
                            add = false;
                        }
                        break;
                    case "Цвет":
                        if (!laptop.getColor().equals(value)) {
                            add = false;
                        }
                        break;
                    default:
                        System.out.println("Неверный критерий фильтрации: " + key);
                }
            }
            if (add) {
                filteredLaptops.add(laptop);
            }
        }
        if (filteredLaptops.isEmpty()) {
            System.out.println("Ноутбуки по заданным критериям не найдены");
        } else {
            System.out.println("Найдено ноутбуков: " + filteredLaptops.size());
            for (Laptop laptop : filteredLaptops) {
                laptop.displayInfo();
            }
        }
    }
}
