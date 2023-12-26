package Exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {
    public static void readFile(String filePath) {
        try {
            String content = Files.readString(Paths.get(filePath));
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
            throw new CustomException("Error reading from file", e);
        }
    }
}
