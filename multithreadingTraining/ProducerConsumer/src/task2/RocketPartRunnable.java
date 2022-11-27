package task2;

import java.util.concurrent.CountDownLatch;

public class RocketPartRunnable implements Runnable{
    private CountDownLatch countDownLatch;
    private RocketPart rocketPart;

    public RocketPartRunnable(CountDownLatch countDownLatch, RocketPart rocketPart) {
        this.countDownLatch = countDownLatch;
        this.rocketPart = rocketPart;
    }

    @Override
    public void run() {
        System.out.println("Preparing rocket part: " + rocketPart);
        try {
            Thread.sleep(2000);

            System.out.println("Complete " + rocketPart);

            countDownLatch.countDown();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
