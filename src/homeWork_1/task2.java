package homeWork_1;
//Вычислить n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class task2 {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число N : ");
        int n = Integer.parseInt(scanner.next());
        int factorial = factorial(n);
        System.out.println(n + "! = " + factorial);
    }


}
