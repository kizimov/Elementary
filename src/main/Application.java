package main;

import main.handler.*;
import main.utility.ConsoleUtils;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        new Application().run();
    }

    public void run() throws IOException {
        System.out.println("""
                1. Шахматная доска.
                2. Анализ конвертов.
                3. Сортировка треугольников.
                4. Файловый парсер.
                5. Число в пропись.
                6. Счастливые билеты.
                7. Числовая последовательность.
                8. Ряд Фибаначи для заданного диапазона.
                9. Возведение в степень.
                0. Закрыть программу.""");
        byte task = ConsoleUtils.getPositiveByte("Сделайте свой выбор (0-9): ");
        switch (task) {
            case 0 -> {
                System.out.println("Выход из программы....");
                System.exit(0);
            }
            case 1 -> new ChessboardHandler().handle();
            case 2 -> new EnvelopHandler().handle();
            case 3 -> new TriangleHandler().handle();
            case 4 -> new ParseHandler().choiceMode();
            case 5 -> new NumberInWordsHandler().handle();
            case 6 -> new LuckyTicketHandler().handle();
            case 7 -> new NumericalSequenceHendler().handle();
            case 8 -> new FibanacheHendler().handle();
            case 9 -> new PowHandler().handle();
            default -> System.out.println("Выбирите из существующих пунктов");
        }
        if (ConsoleUtils.isConfirmed("Желаете другую программу? (Yes/No):")) run();
    }
}