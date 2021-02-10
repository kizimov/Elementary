package handler;

import service.PowService;
import utility.ConsoleUtils;
import utility.RepeatBlock;

import java.util.InputMismatchException;

public class PowHendler extends RepeatBlock {
    public void manualInput() {
        int[] powParams;
        int base;
        int exponent;
        String message = "Введите через запятую число для возведения и степень числа <a,n>";
        final String regex = "\\d*,\\d*"; /*шаблон для проверки*/
        powParams = PowService.getParams(ConsoleUtils.checkFormat(message, regex));/*отправляем на проверку соответствия типа*/
        base = powParams[0];
        exponent = powParams[1];
        System.out.println(PowService.pow(base, exponent));
        if (PowHendler.restart()) manualInput();
    }
}