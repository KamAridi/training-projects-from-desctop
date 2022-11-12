package lesson1;

import java.util.Comparator;

public class LambdaTraining {
    public static void main(String[] args) {
        Comparator<Integer> comparator = Integer::compare;

        System.out.println(comparator.compare(1,10));

    }


}
//class IntegerComparator implements Comparator<Integer>{
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        return Integer.compare(o1, o2);
//    }
//}
