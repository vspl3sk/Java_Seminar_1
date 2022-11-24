import java.util.Scanner;

// 1. Вычислить n-ое треугольное число (сумма чисел
// от 1 до n), n! (произведение чисел от 1 до n)

public class javaSeminar1task1 {

    public static int sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static int nFactorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    public static void main(String args[]) {
        System.out.println("Введите число N: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Сумма чисел"
                + " от 1 до " + n + " равна "
                + sum(n));
        System.out.println("Факториал числа " + n
                + " равен " + nFactorial(n));
        sc.close();
    }
}