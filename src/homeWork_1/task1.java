package homeWork_1;
import java.util.Scanner;

public class task1 {
    public static int triangularNumber(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число N : ");
        int n = Integer.parseInt(scanner.next());
//        int n = 5;
        int triangular = triangularNumber(n);
        System.out.println("Triangular number for n = " + n + " is " + triangular);
    }

}
