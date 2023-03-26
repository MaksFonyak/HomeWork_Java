package homeWork_1;
//Реализовать простой калькулятор
import java.util.Scanner;
public class task4 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            System.out.println("Выберите действие (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double result;

            switch(operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operator!");
                    return;
            }

            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
    }


