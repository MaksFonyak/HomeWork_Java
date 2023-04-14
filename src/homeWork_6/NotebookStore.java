package homeWork_6;

import java.util.*;

public class NotebookStore {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("Lenovo", "IdeaPad", 8, 512, "Windows 10", "Серый"));
        laptops.add(new Laptop("Apple", "MacBook Air", 16, 512, "macOS", "Золотой"));
        laptops.add(new Laptop("ASUS", "VivoBook", 12, 256, "Windows 11", "Синий"));
        laptops.add(new Laptop("HP", "EliteBook", 6, 340, "Windows 10", "Серый"));
        laptops.add(new Laptop("Lenovo", "IdeaPad", 8, 512, "Windows 10", "Чёрный"));
        laptops.add(new Laptop("Apple", "MacBook Pro", 16, 256, "MacOS", "Тёмно серый"));
        laptops.add(new Laptop("Dell", "XPS 13", 16, 512, "Ubuntu", "Серебристый"));


    }
}


