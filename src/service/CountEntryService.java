package service;

import utility.FileUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CountEntryService {
    public void parsFile(String path, String sample) throws IOException {
        Path file1 = Path.of(path);
        int counter = 0;
        int countOfEntry = 0;
        int countAll = 0;
        int entry = 0;
        int i = 0;
        if (FileUtils.validationFile(path)) {
            List<String> list = Files.readAllLines(file1);

            for (String words : list) { /*сравниваем строки на содержание*/
                counter++;
                countOfEntry = 0;
                if (words.indexOf(sample, 0) > -1) {
                    entry = words.indexOf(sample, 0);

                    while (words.length() - words.indexOf(sample, entry) + 1 > sample.length()) {
                        if (words.indexOf(sample, entry) > 0) {
                            countOfEntry++;
                        }
                        entry = words.indexOf(sample, entry + 1);
                        if (entry < 0) {
                            break;
                        }
                    }
                }
                countAll = countAll + countOfEntry;
            }
            System.out.println("колличество вхождений: " + countAll);
        }
    }
}