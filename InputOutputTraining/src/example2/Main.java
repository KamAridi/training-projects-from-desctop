package example2;

import java.io.*;
import java.nio.file.Path;
import java.util.stream.Collectors;

/*
       ������� n � m �����, ����� ���������� ��� ������ ����� �����
       ���� ������ �� ������� � ����� ��, ������� ���� �������
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
