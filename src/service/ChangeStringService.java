package service;

import utility.CheckFileVoidUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ChangeStringService {
    public void parsFile(String PATH, String findString, String replaceableString) throws IOException {
        if (CheckFileVoidUtils.validationFile(PATH)) {
            Path file1 = Path.of(PATH);
            List<String> fileContent = Files.readAllLines(file1);
            for (int i = 0; i < fileContent.size(); i++) {
                if (fileContent.get(i).equals(findString)) fileContent.set(i, replaceableString);
            }
            Files.write(Path.of(PATH), fileContent, StandardCharsets.UTF_8);
            System.out.printf("произведена замена %s на %s", findString, replaceableString);
        }
    }
}