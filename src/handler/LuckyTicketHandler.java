package handler;

import service.LuckyTicketServiceImplementation;
import utility.ConsoleUtils;
import utility.FileUtils;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class LuckyTicketHandler implements Handler {
    public void manualInput() throws IOException {
        boolean result = true;
        final String MOSCOW_TYPE = "mosсow";
        final String PITER_TYPE = "piter";
        String message = "Введите номер билета (6 цыфр):";
        final String regex = "\\d\\d\\d\\d\\d\\d";
        String fromConsole = ConsoleUtils.checkFormat(message, regex);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите путь к файлу: ");
        String path1 = scanner.next();
        if (FileUtils.validationFile(path1)) {
            List<String> list = ConsoleUtils.parsFile(path1);
            String methodName = list.get(0).toLowerCase(Locale.ROOT);
            System.out.println(methodName);
            switch (methodName) {
                case MOSCOW_TYPE:
                    result = new LuckyTicketServiceImplementation().methodMoscow(new LuckyTicketServiceImplementation().getUnit(fromConsole));
                    break;
                case PITER_TYPE:
                    result = new LuckyTicketServiceImplementation().methodPiter(new LuckyTicketServiceImplementation().getUnit(fromConsole));
                    break;
            }
        } else manualInput();
        if (result) System.out.println("Счастливый билетик!");
        if (!result) System.out.println("Не счастливый билет");

        if (ConsoleUtils.restart("\nЖелаете повторить? (Yes/No):")) manualInput();

    }


}

