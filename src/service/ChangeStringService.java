package service;

import utility.CheckFileVoidUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ChangeStringService {
    public void parsFile(String PATH, String FINDSTRING, String REPLACEMENTSTRING) throws IOException {
        if (CheckFileVoidUtils.validationFile(PATH)) {
            Path file1 = Path.of(PATH);
            List<String> fileContent = Files.readAllLines(file1);

            for (int i = 0; i < fileContent.size(); i++) {
                if (fileContent.get(i).equals(FINDSTRING)) {
                    fileContent.set(i, REPLACEMENTSTRING);
                }
            }
            Files.write(Path.of(PATH), fileContent, StandardCharsets.UTF_8);
            System.out.printf("произведена замена %s на %s", FINDSTRING, REPLACEMENTSTRING);
        }
    }
}