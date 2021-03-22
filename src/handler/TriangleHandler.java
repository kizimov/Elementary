package handler;

import service.ArrayTriangeleService;
import utility.ConsoleUtils;

import java.io.IOException;

public class TriangleHandler implements Handler{

    public void manualInput() throws IOException {
        ArrayTriangeleService arrayTriangeleService = new ArrayTriangeleService();
        arrayTriangeleService.repeatEnter();
        arrayTriangeleService.sortAndPrint();
        if (ConsoleUtils.restart("\nЖелаете повторить? (Yes/No):")) manualInput();
    }
}