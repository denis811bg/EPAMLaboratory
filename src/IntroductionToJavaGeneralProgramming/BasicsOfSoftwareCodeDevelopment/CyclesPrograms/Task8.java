package IntroductionToJavaGeneralProgramming.BasicsOfSoftwareCodeDevelopment.CyclesPrograms;

import java.util.Scanner;

/**
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */
public class Task8 {
    public static final int COUNT_DIGIT = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a and b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int[] arrayA = new int[COUNT_DIGIT];
        while (a != 0) {
            arrayA[a % 10]++;
            a = a / 10;
        }

        int[] arrayB = new int[COUNT_DIGIT];
        while (b != 0) {
            arrayB[b % 10]++;
            b = b / 10;
        }

        System.out.print("Result: ");
        for (int i = 0; i < COUNT_DIGIT; i++){
            if (arrayA[i] > 0 && arrayB[i] > 0){
                System.out.print(i + " ");
            }
        }
    }
}
