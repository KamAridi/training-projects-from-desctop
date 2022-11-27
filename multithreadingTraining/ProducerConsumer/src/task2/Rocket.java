package task2;

import java.util.concurrent.CountDownLatch;

public class Rocket implements Runnable{
    private CountDownLatch countDownLatch;

    public Rocket(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        try {

            countDownLatch.await();

            System.out.println("PUSK!!");


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
