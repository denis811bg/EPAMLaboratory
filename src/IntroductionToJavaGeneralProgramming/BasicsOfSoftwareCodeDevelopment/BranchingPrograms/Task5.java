package IntroductionToJavaGeneralProgramming.BasicsOfSoftwareCodeDevelopment.BranchingPrograms;

import java.util.Scanner;

/**
 * Вычислить значение функции:
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        scanner.close();

        if (x <= 3) {
            System.out.println("F(x) = " + (Math.pow(x, 2) - 3 * x + 9));
        } else {
            System.out.println("F(x) = " + (1 / (Math.pow(x, 3) + 6)));
        }
    }
}
