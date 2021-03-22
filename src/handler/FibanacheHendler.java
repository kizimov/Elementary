package handler;

import service.FibanacheService;
import utility.ConsoleUtils;
import utility.FibanacheUtils;

import java.io.IOException;

public class FibanacheHendler implements Handler{
    public void manualInput() throws IOException {
        int[] rangeFibanache;
        int[] numberFibanache;
        String message = "Введите дапазон натуральных чисел (два числа через запятую):";
        final String regex = "\\d*,\\d*"; /*шаблон для проверки*/
        String fromConsole = ConsoleUtils.checkFormat(message, regex);/*отправляем на проверку соответствия типа*/
        rangeFibanache = FibanacheService.getRange(fromConsole);
        numberFibanache = FibanacheService.fibanacheSeries(rangeFibanache);
        FibanacheUtils.printUnits(rangeFibanache, numberFibanache);
        if (ConsoleUtils.restart("\nЖелаете повторить? (Yes/No):")) manualInput();
    }
}