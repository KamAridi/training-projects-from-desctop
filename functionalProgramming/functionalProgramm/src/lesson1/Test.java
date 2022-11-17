package lesson1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        getTime(list);
    }
    public static void getTime(List<Integer> list ){
        long l1 = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            list.add( 0, i);

        }

        long l2 = System.currentTimeMillis();

        System.out.println(l2-l1);
    }
}
