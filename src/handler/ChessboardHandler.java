package handler;

import model.Chessboard;
import service.ChessboardService;
import utility.ConsoleUtils;
import utility.RepeatBlock;

import java.io.IOException;

public class ChessboardHandler extends RepeatBlock {
    public void manualInput() throws IOException {
        System.out.println("Введите параметры шахмотной доски:");
        byte height = ConsoleUtils.getPositiveByteMinValue("Введите высоту доски:", (byte) 2);
        byte width = ConsoleUtils.getPositiveByteMinValue("Введите ширину доски:", (byte) 2);
        String cell = ConsoleUtils.getSingleCharString("Введите значение для одиночный символ для заполнения:");
        System.out.print(new ChessboardService(new Chessboard(height, width, cell)).build());
        if (ChessboardHandler.restart()) manualInput();
    }
}