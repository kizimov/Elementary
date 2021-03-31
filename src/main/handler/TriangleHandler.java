package main.handler;

import main.service.ArrayTriangeleService;
import main.utility.ConsoleUtils;

import java.io.IOException;

public class TriangleHandler implements Handler{

    public void handle() {
        ArrayTriangeleService arrayTriangeleService = new ArrayTriangeleService();
        try {
            arrayTriangeleService.repeatEnter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        arrayTriangeleService.sortAndPrint();
        if (ConsoleUtils.isConfirmed("\nЖелаете повторить? (Yes/No):")) handle();
    }
}