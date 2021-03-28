package IntroductionToJavaGeneralProgramming.BasicsOfSoftwareCodeDevelopment.BranchingPrograms;

import java.util.Scanner;

/**
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A(x1, y1): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("Enter B(x2, y2): ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.println("Enter C(x3, y3): ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        scanner.close();

        if ((x1 == x2 && x2 == x3) || (y1 == y2 && y2 == y3)) {
            System.out.println("Points are located on one straight line.");
        } else {
            System.out.println("Points are not located on one straight line.");
        }
    }
}
