package example2;

import java.io.*;
import java.nio.file.Path;
import java.util.stream.Collectors;

/*
       Считать n и m строк, затем споставить эти строки между собой
       Если строка не совпала с какой то, вывезти знак вопроса
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "test").toFile();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String collected = bufferedReader.lines()
                    .;
            System.out.println(collected);
        }
    }
}
