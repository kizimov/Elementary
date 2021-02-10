package handler;

import utility.RepeatBlock;

import java.io.IOException;
import java.util.Scanner;

public class ParseHandler extends RepeatBlock {
    public void choiceMode() throws IOException {
        Scanner sc = new Scanner(System.in);/*используем класс Scanner*/
        System.out.println("Выбирите режим:");
        System.out.println("1.\tСчитать количество вхождений строки в текстовом файле.");
        System.out.println("2.\tДелать замену строки на другую в указанном файле.");
        System.out.print("Введите \"1\" или \"2\" :");

        if (sc.hasNextInt()) { /*смотрим в будущее*/
            int choice = sc.nextInt();/*считывает из консоли и использует как Int*/
            sc.close();
            switch (choice) {
                case 1:
                    CountEntryHandler.manualInput();
                    break;
                case 2:
                    ChangeStringHandler.manualInput();
                    break;
                default:
                    System.out.println("Не верный ввод.");
                    choiceMode();
            }
        } else {
            System.out.println("не верный ввод:");
            choiceMode();
        }
        if (ParseHandler.restart()) choiceMode();
    }
}