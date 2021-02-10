package handler;

import utility.ConsoleUtils;
import utility.NumericalSequenceUtils;
import utility.RepeatBlock;

import java.io.IOException;

public class NumericalSequenceHendler extends RepeatBlock {
    public void manualInput() throws IOException {
        String message = "Введите натуральное число:";
        final String regex = "\\d*"; /*шаблон для проверки*/
        int number = Integer.parseInt(ConsoleUtils.checkFormat(message, regex)); /*отправляем на проверку соответствия типа*/
        NumericalSequenceUtils.printUnits(number);
        if (NumericalSequenceHendler.restart()) manualInput();
    }
}
