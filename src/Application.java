import handler.*;
import utility.RepeatBlock;

import java.io.IOException;

public class Application extends RepeatBlock {

    public static void main(String[] args) throws IOException {
        run();
    }

    public static void run() throws IOException {
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
        byte task = RepeatBlock.start();
        switch (task) {
            case 0 -> {
                System.out.println("Выход из программы....");
                System.exit(0);
            }
            case 1 -> new ChessboardHandler().manualInput();
            case 2 -> new EnvelopHandler().manualInput();
            case 3 -> new TriangleHandler().manualInput();
            case 4 -> new ParseHandler().choiceMode();
            case 5 -> new NumberInWordsHandler().manualInput();
            case 6 -> new LuckyTicketHandler().manualInput();
            case 7 -> new NumericalSequenceHendler().manualInput();
            case 8 -> new FibanacheHendler().manualInput();
            case 9 -> new PowHendler().manualInput();
            default -> System.out.println("Выбирите из существующих пунктов");
        }
        if (Application.restartMain()) run();
    }
}