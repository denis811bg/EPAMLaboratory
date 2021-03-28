package IntroductionToJavaGeneralProgramming.BasicsOfSoftwareCodeDevelopment.LinePrograms;

import java.util.Scanner;

/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * ((𝑏 + √𝑏2 + 4𝑎𝑐) / 2𝑎) − 𝑎3𝑐 + 𝑏−2
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a = ");
        double a = scanner.nextDouble();
        System.out.print("Enter b = ");
        double b = scanner.nextDouble();
        System.out.print("Enter c = ");
        double c = scanner.nextDouble();
        scanner.close();

        System.out.println("Result = " +
                ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2)));
    }
}
