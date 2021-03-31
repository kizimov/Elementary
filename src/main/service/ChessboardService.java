package main.service;

import main.model.Chessboard;

public class ChessboardService {

    private Chessboard chessboard;

    public ChessboardService(Chessboard chessboard) {
        this.chessboard = chessboard;
    }

    public String build() {

        StringBuffer buffer = new StringBuffer();//    для минимизации использования памяти будем пользоваться StringBuilder
        buffer.append((" " + chessboard.getCell()).repeat(Math.max(0, chessboard.getWidth() / 2)));
        if (buffer.length() < chessboard.getWidth()) {
            buffer.append(" ");
        }
        String oddString = new String(buffer);//формироване первой строки(нечетной)
        String evenString = new String(buffer.insert(0, chessboard.getCell()).delete(buffer.length() - 1, buffer.length()));//формироване второй строки(четной)
        StringBuilder stringBuilder = new StringBuilder();
// форимирование шахмотной доски путем поочередного добавления чет.и нечет.строки со знаком разделения строк.
        for (int i = 1; i < chessboard.getHeight() + 1; i++) {
            if (i % 2 > 0) {
                stringBuilder.append(oddString);
            } else {
                stringBuilder.append(evenString);
            }
            if (i < chessboard.getHeight()) stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}