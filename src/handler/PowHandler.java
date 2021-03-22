package handler;

import service.PowService;
import utility.ConsoleUtils;

public class PowHandler implements Handler{
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
        if (ConsoleUtils.restart("\nЖелаете повторить? (Yes/No):")) manualInput();
    }
}