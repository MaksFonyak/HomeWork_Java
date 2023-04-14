package homeWork_6;

public class Laptop {
    private String brand; // марка ноутбука
    private String model; // модель ноутбука
    private int ram; // объем оперативной памяти (в гигабайтах)
    private int storage; // объем жесткого диска (в гигабайтах)
    private String os; // операционная система
    private String color; // цвет

    // конструктор
    public Laptop(String brand, String model, int ram, int storage, String os, String color) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }

    // геттеры и сеттеры для всех полей

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // метод для вывода информации о ноутбуке
    public void displayInfo() {
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Оперативная память: " + ram + " ГБ");
        System.out.println("Жесткий диск: " + storage + " ГБ");
        System.out.println("Операционная система: " + os);
        System.out.println("Цвет: " + color);
    }
}
