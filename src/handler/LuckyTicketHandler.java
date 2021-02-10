package handler;

import service.LuckyTicketService;
import utility.CheckFileVoidUtils;
import utility.ConsoleUtils;
import utility.LuckyTicketUtils;
import utility.RepeatBlock;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class LuckyTicketHandler extends RepeatBlock {
    public void manualInput() throws IOException {
        final String MOSCOW_TYPE = "mosсow";
        final String PITER_TYPE = "piter";
        String message = "Введите номер билета (6 цыфр):";
        final String regex = "\\d\\d\\d\\d\\d\\d";
        String fromConsole = ConsoleUtils.checkFormat(message, regex);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите путь к файлу: ");
        String path1 = scanner.next();
        scanner.close();
        if (CheckFileVoidUtils.validationFile(path1)) {
            List<String> list = ConsoleUtils.parsFile(path1);
            String methodName = list.get(0).toLowerCase(Locale.ROOT);
            System.out.println(methodName);
            switch (methodName) {
                case MOSCOW_TYPE:
                    new LuckyTicketService().methodMoscow(new LuckyTicketUtils().getUnit(fromConsole));
                    break;
                case PITER_TYPE:
                    new LuckyTicketService().methodPiter(new LuckyTicketUtils().getUnit(fromConsole));
                    break;
            }
        } else new LuckyTicketHandler().manualInput();
        if (LuckyTicketHandler.restart()) manualInput();
    }
}

