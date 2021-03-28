package IntroductionToJavaGeneralProgramming.BasicsOfSoftwareCodeDevelopment.CyclesPrograms;

import java.util.Scanner;

/**
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
 * заданному е. Общий член ряда имеет вид:
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        double a;
        System.out.print("Enter N (count of number): ");
        int N = scanner.nextInt();
        System.out.print("Enter e: ");
        double e = scanner.nextDouble();
        scanner.close();

        for (int i = 1; i <= N; i++) {
            a = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
            if (Math.abs(a) >= e) {
                result += a;
            }
        }

        System.out.println("Result: " + result);
    }
}
