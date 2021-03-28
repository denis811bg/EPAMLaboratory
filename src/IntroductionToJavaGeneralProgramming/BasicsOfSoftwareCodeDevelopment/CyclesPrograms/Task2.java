package IntroductionToJavaGeneralProgramming.BasicsOfSoftwareCodeDevelopment.CyclesPrograms;

import java.util.Scanner;

/**
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y;
        System.out.println("Enter boundaries [a, b] and step h: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        scanner.close();

        for (int i = a; i <= b; i += h) {
            if (i > 2) {
                y = i;
            } else {
                y = i * (-1);
            }
            System.out.println("For x = " + i + " y = " + y);
        }
    }
}
