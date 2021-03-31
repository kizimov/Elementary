package main.handler;

import main.service.PowService;
import main.utility.ConsoleUtils;

public class PowHandler implements Handler{
    public void handle() {
        int[] powParams;
        int base;
        int exponent;
        String message = "Введите через запятую число для возведения и степень числа <a,n>";
        final String regex = "\\d*,\\d*"; /*шаблон для проверки*/
        powParams = PowService.getParams(ConsoleUtils.checkFormat(message, regex));/*отправляем на проверку соответствия типа*/
        base = powParams[0];
        exponent = powParams[1];
        System.out.println(PowService.pow(base, exponent));
        if (ConsoleUtils.isConfirmed("\nЖелаете повторить? (Yes/No):")) handle();
    }
}