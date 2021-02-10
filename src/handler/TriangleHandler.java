package handler;

import service.ArrayTriangeleService;
import utility.RepeatBlock;

import java.io.IOException;

public class TriangleHandler extends RepeatBlock {

    public void manualInput() throws IOException {
        ArrayTriangeleService arrayTriangeleService = new ArrayTriangeleService();
        arrayTriangeleService.repeatEnter();
        arrayTriangeleService.sortAndPrint();
        if (TriangleHandler.restart()) manualInput();
    }
}