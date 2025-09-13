import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Dictionary;
import java.util.Formatter;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.abs;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}

class CalculateSum extends Tailor {
    public static double calculateSum(double x, double resultE) {
        double sum = 1;
        double newAddend = 1;
        int n = 1;
        boolean checkSum = true;

        while (checkSum) {
            newAddend *= (Math.pow(-1, n)) * (((2.0 * n) - 1.0) / (2.0 * n) * x);

            if (abs(newAddend) >= resultE) {
                sum += newAddend;
                n++;
            }
            else {
                checkSum = false;
                }

                /*Formatter fmtFoo = new Formatter();
                fmtFoo.format("Число с плавающей точкой, используя спецификаторы: %" + 8 + "." + precision + "f", sum);
                System.out.println(fmtFoo);
                fmtFoo.flush();
                System.out.print("Число с флагами (положительное): ");
                System.out.printf("%0(+#15.2f%n", sum);
                System.out.print("Число с флагами (отрицательное): ");
                System.out.printf("%0(+#15.2f%n", -sum);
                checkSum = false;*/
        }

        return sum;
    }

    public static void printResults(double x, double sum, int precision) {
        Formatter fmtFoo = new Formatter();
        fmtFoo.format("Число с плавающей точкой, используя спецификаторы: %" + 8 + "." + precision + "f", sum);
        System.out.println(fmtFoo);
        fmtFoo.flush();
        System.out.print("Число с флагами (положительное): ");
        System.out.printf("%0(+#15.2f%n", sum);
        System.out.print("Число с флагами (отрицательное): ");
        System.out.printf("%0(+#15.2f%n", -sum);
        double exact = 1 / Math.sqrt(1 + x);
        System.out.printf("Точное значение через Math.sqrt: %." + precision + "f%n", exact);
        fmtFoo.close();
    }
}

class BigTailor {

    public static BigDecimal calculateE(BigInteger doubleK) {
        int k = doubleK.intValueExact();
        return BigDecimal.ONE.divide(BigDecimal.TEN.pow(k));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        boolean checkX = true;
        String input;
        BigDecimal x = null;
        System.out.print("Введите значение числа Х в диапазоне (-1; 1): ");
        while (checkX) {
            input = in.readLine();
            x = new BigDecimal(input);
            input = "";
            if (x.compareTo(BigDecimal.ONE) >= 0 || x.compareTo(BigDecimal.ONE.negate()) <= 0) {
                System.out.print("Вы ввели некорректное число, введите число из диапазона (-1; 1): ");
            } else {
                checkX = false;
            }
        }
        System.out.print("Введите значение числа k: ");
        input = in.readLine();
        BigInteger k = new BigInteger(input);
        BigDecimal e = new BigDecimal(0);
        e = calculateE(k);
        BigCalculateSum.printBigRes(x, BigCalculateSum.calculateBigSum(x, e));
    }
}

class BigCalculateSum extends BigTailor {
    public static BigDecimal calculateBigSum(BigDecimal x, BigDecimal e) {
        BigDecimal resultSum = new BigDecimal(1);
        BigDecimal newAdd = new BigDecimal(1);
        BigDecimal sign = BigDecimal.ONE;
        long n = 1;
        boolean check = true;
        MathContext mc = MathContext.DECIMAL128;

        while (true) {
            sign = sign.negate();
            BigDecimal fraction = BigDecimal.valueOf(2L * n - 1)
                    .divide(BigDecimal.valueOf(2L * n), mc);
            newAdd = newAdd.multiply(sign)
                    .multiply(fraction)
                    .multiply(x);
            resultSum = resultSum.add(newAdd);
            if (newAdd.abs().compareTo(e) < 0) break;
            n++;
        }
        return resultSum;
    }

    public static void printBigRes(BigDecimal x, BigDecimal resultSum) {
        MathContext mc = MathContext.DECIMAL128;
        System.out.println("Сумма = " + resultSum);

        BigDecimal exact = BigDecimal.ONE.divide(
                BigDecimal.ONE.add(x).sqrt(mc), mc
        );
        System.out.println("Точное значение через sqrt: " + exact);
    }
}