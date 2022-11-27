package task2;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LatchDemo {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(RocketPart.values().length);
        ExecutorService pool = Executors.newFixedThreadPool(3);
        pool.submit(new Rocket(countDownLatch));

        Arrays.stream(RocketPart.values())
                        .map(part-> new RocketPartRunnable(countDownLatch, part))
                        .forEach(pool::submit);

        pool.shutdown();
    }
}
