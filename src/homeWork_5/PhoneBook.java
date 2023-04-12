import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<String, ArrayList<String>>();
    }

    public void addPhoneNumber(String name, String phoneNumber) {
        if (phoneBook.containsKey(name)) {
            ArrayList<String> phoneNumbers = phoneBook.get(name);
            phoneNumbers.add(phoneNumber);
        } else {
            ArrayList<String> phoneNumbers = new ArrayList<String>();
            phoneNumbers.add(phoneNumber);
            phoneBook.put(name, phoneNumbers);
        }
    }

    public ArrayList<String> getPhoneNumbers(String name) {
        return phoneBook.get(name);
    }

    public void removePhoneNumber(String name, String phoneNumber) {
        if (phoneBook.containsKey(name)) {
            ArrayList<String> phoneNumbers = phoneBook.get(name);
            phoneNumbers.remove(phoneNumber);
            if (phoneNumbers.isEmpty()) {
                phoneBook.remove(name);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        while (true) {
            System.out.println("Выберите операцию: ");
            System.out.println("1. Добавить номер телефона");
            System.out.println("2. Найти номер телефона");
            System.out.println("3. Удалить номер телефона");
            System.out.println("4. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Ввведите имя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите номер телефона: ");
                    String phoneNumber = scanner.nextLine();
                    phoneBook.addPhoneNumber(name, phoneNumber);
                    break;
                case 2:
                    System.out.print("Введите имя: ");
                    name = scanner.nextLine();
                    ArrayList<String> phoneNumbers = phoneBook.getPhoneNumbers(name);
                    if (phoneNumbers != null) {
                        System.out.println(name + "номер телефона: ");
                        for (String number : phoneNumbers) {
                            System.out.println(number);
                        }
                    } else {
                        System.out.println("Не найдено номера телефона для " + name);
                    }
                    break;
                case 3:
                    System.out.print("Введите имя: ");
                    name = scanner.nextLine();
                    System.out.print("Введите номер телефона: ");
                    phoneNumber = scanner.nextLine();
                    phoneBook.removePhoneNumber(name, phoneNumber);
                    break;
                case 4:
                    System.out.println("Выход...");
                    System.exit(0);
                default:
                    System.out.println("Не верный выбор, попробуйте еще раз.");
            }
        }
    }
}
