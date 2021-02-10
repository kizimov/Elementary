package handler;

import service.FibanacheService;
import utility.ConsoleUtils;
import utility.FibanacheUtils;
import utility.RepeatBlock;

import java.io.IOException;

public class FibanacheHendler extends RepeatBlock {
    public void manualInput() throws IOException {
        int[] rangeFibanache;
        int[] numberFibanache;
        String message = "Введите дапазон натуральных чисел (два числа через запятую):";
        final String regex = "\\d*,\\d*"; /*шаблон для проверки*/
        String fromConsole = ConsoleUtils.checkFormat(message, regex);/*отправляем на проверку соответствия типа*/
        rangeFibanache = FibanacheService.getRange(fromConsole);
        numberFibanache = FibanacheService.fibanacheSeries(rangeFibanache);
        //TODO вставить проверку на отрицательные и участок
        FibanacheUtils.printUnits(rangeFibanache, numberFibanache);
        if (FibanacheHendler.restart()) manualInput();
    }
}