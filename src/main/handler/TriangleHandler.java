package main.handler;

import main.service.ArrayTriangleService;
import main.utility.ConsoleUtils;

import java.io.IOException;

public class TriangleHandler implements Handler{

    public void handle() {
        ArrayTriangleService arrayTriangleService = new ArrayTriangleService();
        try {
            arrayTriangleService.repeatEnter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        arrayTriangleService.sortAndPrint();
        if (ConsoleUtils.isConfirmed("\nЖелаете повторить? (Yes/No):")) handle();
    }
}