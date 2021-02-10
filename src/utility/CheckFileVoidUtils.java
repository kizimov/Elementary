package utility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CheckFileVoidUtils {
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
}