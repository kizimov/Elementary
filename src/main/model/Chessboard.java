package main.model;

public class Chessboard {

    private byte height;
    private byte width;
    // заполнение клетки символом
    private String cell;

    // создаем конструктор
    public Chessboard(byte height, byte width, String cell) {
        this.height = height;
        this.width = width;
        this.cell = cell;
    }

    public byte getHeight() {
        return height;
    }

    public void setHeight(byte height) {
        this.height = height;
    }

    public byte getWidth() {
        return width;
    }

    public void setWidth(byte width) {
        this.width = width;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }
}