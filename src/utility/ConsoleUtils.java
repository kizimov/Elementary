package utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ConsoleUtils {

    private static final Scanner scanner = new Scanner(System.in);

    public static byte getPositiveByteMinValue(String message, byte min) {
        byte value = 0;
        boolean shouldContinue = true;
        while (shouldContinue) {
            System.out.print(message);
            try {
                value = scanner.nextByte();
                if (value < min) throw new InputMismatchException("Value is lower then minimum.");
                shouldContinue = false;
            } catch (InputMismatchException exception) {
                System.out.println(exception.getMessage());
            }
        }
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

}