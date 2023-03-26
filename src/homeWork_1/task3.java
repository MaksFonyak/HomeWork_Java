package homeWork_1;
//Вывести все простые числа от 1 до 1000 простое число - то число которое
//        делится без остатка только на 1 и на само себя (1 - это не простое число);
public class task3 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

}
