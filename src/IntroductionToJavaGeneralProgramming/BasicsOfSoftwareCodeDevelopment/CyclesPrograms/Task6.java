package IntroductionToJavaGeneralProgramming.BasicsOfSoftwareCodeDevelopment.CyclesPrograms;

/**
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */
public class Task6 {
    public static void main(String[] args) {
        for (int i = 0; i < 256; i++) {
            System.out.println((char) i + " " + i);
        }
    }
}
