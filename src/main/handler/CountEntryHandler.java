package main.handler;

import main.service.CountEntryService;
import main.utility.FileUtils;

import java.io.IOException;
import java.util.Scanner;

public class CountEntryHandler implements Handler{
    public void handle() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите путь к файлу: ");
        String path1 = scanner.next();
        System.out.println("Введите образец для подсчета: ");
        String sample = scanner.next();
        if (FileUtils.validationFile(path1)) {
            new CountEntryService().parsFile(path1, sample);
        } else handle();
    }
}
