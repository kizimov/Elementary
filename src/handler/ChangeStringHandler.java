package handler;

import service.ChangeStringService;
import utility.CheckFileVoidUtils;

import java.io.IOException;
import java.util.Scanner;

public class ChangeStringHandler {
    public static void manualInput() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите путь к файлу: ");
        String path2 = scanner.next();
        System.out.print("Введите строку для поиска: ");
        String findString = scanner.next();
        System.out.print("Введите строку для замены: ");
        String replacementString = scanner.next();
        if (CheckFileVoidUtils.validationFile(path2)) {
            new ChangeStringService().parsFile(path2, findString, replacementString);
        } else manualInput();
    }
}
