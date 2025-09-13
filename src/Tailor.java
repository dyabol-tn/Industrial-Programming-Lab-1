import java.util.Formatter;
import java.util.InputMismatchException;
import java.util.Scanner;

class Tailor {
    public static double calculateE(double doubleK) {
        return Math.pow(10, -doubleK);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean xNum = true;
        double x = 0;
        while (xNum) {
            System.out.print("Введите число X в диапазоне (-1; +1): ");
            try {
                x = scanner.nextDouble();
            } catch (InputMismatchException err) {
                System.out.print("Введено некорректное число!");
                scanner.next();
                continue;
            }
            if (x <= (-1) || x >= 1) {
                System.out.print("Введено некорректное число, введите число в заданном диапазоне! ");
            } else {
                xNum = false;
            }
        }

        System.out.print("Введите число K: ");
        int k = scanner.nextInt();
        double doubleK = k;
        int precision = k + 1;
        double resultE = calculateE(doubleK);
        //CalculateSum.calculateSum(x, resultE);
        CalculateSum.printResults(x, CalculateSum.calculateSum(x, resultE), precision);
        Formatter fmt = new Formatter();
        fmt.format("Целое число в восьмеричной системе счисления: %o%nЦелое число в шестнадцатиричной системе счисления: %#x", k, k);
        System.out.println(fmt);
        fmt.flush();
        fmt.close();
        scanner.close();
    }
}