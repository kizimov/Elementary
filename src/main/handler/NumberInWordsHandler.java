package main.handler;

import main.service.NumberInWordsService;
import main.utility.ConsoleUtils;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberInWordsHandler implements Handler{
    public void handle() throws IOException {
        int number = 0;
        int max = 999999999;
        int min = -999999999;
        boolean shouldContinue = true;
        String massage = "Введите натуральное число (меньше одного миллиарда): ";
        String value = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print(massage);
        while (shouldContinue) {

            try {
                if (!scanner.hasNextInt()) {
                    value = scanner.next();
                    System.out.println("Не верный ввод." + massage);
                } else {
                    number = scanner.nextInt();
                    if (number < min) throw new InputMismatchException("Число меньше допустимого.");
                    if (number > max) throw new InputMismatchException("Число больше допустимого.");
                    shouldContinue = false;
                    System.out.println(new NumberInWordsService().clearingSpace(new main.service.NumberInWordsService().numberInWords(number)));
                }
            } catch (InputMismatchException exception) {
                System.out.println(exception.getMessage());
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Число выходит за параметры.");
            }
        }
        if (ConsoleUtils.isConfirmed("\nЖелаете повторить? (Yes/No):")) handle();
    }
}