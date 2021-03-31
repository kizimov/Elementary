package main.handler;

import main.model.Chessboard;
import main.service.ChessboardService;
import main.utility.ConsoleUtils;

import java.io.IOException;

public class ChessboardHandler implements Handler{
    public void handle() throws IOException {
        System.out.println("Введите параметры шахмотной доски:");
        byte height = ConsoleUtils.getPositiveByteMinValue("Введите высоту доски:", (byte) 2);
        byte width = ConsoleUtils.getPositiveByteMinValue("Введите ширину доски:", (byte) 2);
        String cell = ConsoleUtils.getSingleCharString("Введите значение для одиночный символ для заполнения:");
        System.out.print(new ChessboardService(new Chessboard(height, width, cell)).build());
        if (ConsoleUtils.isConfirmed("\nЖелаете повторить? (Yes/No):")) handle();
    }
}