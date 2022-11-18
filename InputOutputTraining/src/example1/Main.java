package example1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        File dir = Path.of("resources").toFile();
        dir.mkdir();
        File file = Path.of("resources", "test").toFile();
        file.createNewFile();
        FileInputStream fis = new FileInputStream(file);
        byte[] bytesFromTest = fis.readAllBytes();
        String fileString = new String(bytesFromTest);
        System.out.println(fileString);

    }
}
