package IntroductionToJavaGeneralProgramming.BasicsOfSoftwareCodeDevelopment.LinePrograms;

import java.util.Scanner;

/**
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
 * данное значение длительности в часах, минутах и секундах в следующей форме:
 * ННч ММмин SSc
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter T (time in seconds): ");
        int T = scanner.nextInt();
        scanner.close();

        int SS = T % 60;
        T = T / 60;
        int MM = T % 60;
        int HH = T / 60;

        System.out.println(HH + ":" + MM + ":" + SS);
    }
}
