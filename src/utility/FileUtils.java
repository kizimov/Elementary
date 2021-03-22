package utility;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileUtils {
    public static boolean validationFile(String path) throws IOException {
        Path file1 = Path.of(path);
        if (Files.exists(file1)) {
            List<String> list = Files.readAllLines(file1);
            if (list.size() > 0) {
                return true;
            } else {
                System.out.println("файл пустой. ");
                return false;
            }
        } else {
            System.out.printf("файла %s не существует. ", path);
            return false;
        }
    }

    public void parsFile(String PATH, String findString, String replacementString) throws IOException {
        if (validationFile(PATH)) {
            Path file1 = Path.of(PATH);
            List<String> fileContent = Files.readAllLines(file1);

            for (int i = 0; i < fileContent.size(); i++) {
                if (fileContent.get(i).equals(findString)) {
                    fileContent.set(i, replacementString);
                }
            }
            Files.write(Path.of(PATH), fileContent, StandardCharsets.UTF_8);
            System.out.printf("произведена замена %s на %s", findString, replacementString);
        }
    }
}