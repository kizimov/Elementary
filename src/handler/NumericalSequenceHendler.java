package handler;

import utility.ConsoleUtils;
import utility.NumericalSequenceUtils;

import java.io.IOException;

public class NumericalSequenceHendler implements Handler{
    public void manualInput() throws IOException {
        String message = "Введите натуральное число:";
        final String regex = "\\d*"; /*шаблон для проверки*/
        int number = Integer.parseInt(ConsoleUtils.checkFormat(message, regex)); /*отправляем на проверку соответствия типа*/
        System.out.println(NumericalSequenceUtils.printUnits(number).toString());
        if(ConsoleUtils.restart("\nЖелаете повторить? (Yes/No):")) manualInput();
    }
}
