package utility;

import java.util.Locale;
import java.util.Scanner;

public class RepeatBlock {
    public static boolean restart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nЖелаете повторить? (Yes/No): ");
        String answer = scanner.next().toLowerCase(Locale.ROOT);/*полученный ответ приводим к Lower*/

        while (!(answer.equals("y") || answer.equals("yes") || answer.equals("n") || answer.equals("no"))) {
            System.out.println("Не верный выбор. Укажите (Yes/No) ");/*проверяем,до тех пор пока не введут yes/no в любом размере*/
            answer = scanner.next().toLowerCase(Locale.ROOT);
        }
        if (answer.equals("y") || answer.equals("yes")) return true;
        return false;
    }

    public static byte start() {
        byte answer = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сделайте свой выбор (0-9): ");
        if (scanner.hasNextByte()) {
            answer = scanner.nextByte();
        } else {
            String badAnswer = scanner.next();
            System.out.println("Не верный выбор"+badAnswer);
            RepeatBlock.start();
        }
        return answer;
    }

    public static boolean restartMain() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nЖелаете другую программу? (Yes/No): ");
        String answer = scanner.next().toLowerCase(Locale.ROOT);/*полученный ответ приводим к Lower*/

        while (!(answer.equals("y") || answer.equals("yes") || answer.equals("n") || answer.equals("no"))) {
            System.out.println("Не верный выбор. Укажите (Yes/No) ");/*проверяем,до тех пор пока не введут yes/no в любом размере*/
            answer = scanner.next().toLowerCase(Locale.ROOT);
        }
        if (answer.equals("y") || answer.equals("yes")) return true;
        return false;
    }
}
