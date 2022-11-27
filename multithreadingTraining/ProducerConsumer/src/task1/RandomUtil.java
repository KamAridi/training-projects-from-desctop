package task1;

import java.util.Random;

public final class RandomUtil {
    private static final Random RANDOM = new Random();

    public static int getRandom(){
        return RANDOM.nextInt(10);
    }
}
