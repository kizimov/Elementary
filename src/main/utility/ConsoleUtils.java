package main.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ConsoleUtils {

    private static Scanner scanner = new Scanner(System.in);

    public static byte getPositiveByteMinValue(String message, byte min) {
        byte value = 0;
        boolean shouldContinue = true;
        while (shouldContinue) {
            System.out.print(message);
            try {
                value = scanner.nextByte();
                scanner.close();
                if (value < min) throw new InputMismatchException("Value is lower then minimum.");
                shouldContinue = false;
            } catch (InputMismatchException exception) {
                System.out.println(exception.getMessage());
            }
        }
        scanner.close();
        return value;
    }

    public static void checkIfPositive(double value) {
        if (value < 0) {
            throw new InputMismatchException("Value is negative!!!");
        }
    }

    public static String getSingleCharString(String message) {
        String str = "";
        boolean shouldContinue = true;
        while (shouldContinue) {
            System.out.print(message);
            try {
                str = scanner.next();
                if (str.length() > 1) throw new InputMismatchException("Line length is more than 1.");
                shouldContinue = false;
            } catch (InputMismatchException exception) {
                System.out.println(exception.getMessage());
            }
        }
        scanner.close();
        return str;
    }

    public static String checkFormat(String message, String regex) {
        String fromConsole = "";
        boolean shouldContinue = true;
        while (shouldContinue) {
            try {
                System.out.print(message);
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                fromConsole = reader.readLine().replace(" ", "").replace("    ", ""); //
                // считываеи строку из консоли и очищаем ее от пробелов и табов
                if (!fromConsole.matches(regex)) { /*проверка на соответствие шаблону */
                    throw new InputMismatchException("не верный формат ввода данных");
                }
                shouldContinue = false;
            } catch (InputMismatchException | IOException exception) {
                System.out.println(exception.getMessage());
            }
                    }
        return fromConsole;
    }

    public static List<String> parsFile(String path) throws IOException {
        Path file1 = Path.of(path);
        List<String> list = Files.readAllLines(file1);
        return list;
    }

        public static boolean isConfirmed(String message) {
            System.out.println(message);
            String answer = scanner.next().toLowerCase(Locale.ROOT);/*полученный ответ приводим к Lower*/
            while (!(answer.equals("y") || answer.equals("yes") || answer.equals("n") || answer.equals("no"))) {
                System.out.println("Не верный выбор. Укажите (Yes/No) ");/*проверяем,до тех пор пока не введут yes/no в любом размере*/
                answer = scanner.next().toLowerCase(Locale.ROOT);
            }
            if (answer.equals("y") || answer.equals("yes")) return true;
            return false;
        }

        public static byte getPositiveByte(String message) {
            byte answer = 0;
            System.out.print(message);
            if (scanner.hasNextByte()) {
                answer = scanner.nextByte();
            } else {
                String badAnswer = scanner.next();
                System.out.println("Не верный выбор" + badAnswer);
                ConsoleUtils.getPositiveByte(message);
            }
            return answer;
        }
}