package IntroductionToJavaGeneralProgramming.BasicsOfSoftwareCodeDevelopment.BranchingPrograms;

import java.util.Scanner;

/**
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
 * отверстие
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A and B: ");
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        System.out.println("Enter length, width and height: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        scanner.close();

        if (x <= A && y <= B || y <= A && x <= B ||
                x <= A && z <= B || z <= A && x <= B ||
                z <= A && y <= B || y <= A && z <= B) {
            System.out.println("Brick will pass.");
        } else {
            System.out.println("Brick won't pass.");
        }
    }
}
