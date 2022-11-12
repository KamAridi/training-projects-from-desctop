package lesson1;

import java.util.List;

public class StreamTraining {
    public static void main(String[] args) {

        List<String> strings = List.of("11", "22", "33", "44", "55", "66", "77");

        strings.stream()
                .map(string -> string + string)
                .map(Integer::valueOf)
                .filter(integer -> integer % 2 == 0)
                .forEach(System.out::println);

//        for (String string : strings) {
//            String value = string + string;
//            Integer integer = Integer.valueOf(value);
//            if(integer%2 == 0) {
//                System.out.println(integer);
//            }
//        }
    }
}
