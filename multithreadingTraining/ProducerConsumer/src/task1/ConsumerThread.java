package task1;

import java.util.Queue;

public class ConsumerThread implements Runnable{
    private final Queue<Integer> queue;

    public ConsumerThread(Queue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("begin consumer Thread");
        synchronized (queue) {
            while (true) {
                if (!queue.isEmpty()) {
                    Integer val = queue.remove();
                    System.out.println("Consumer is getting and working... on value " + val);
                    try {
                        this.wait(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                } else {
                    System.out.println("Queue is empty");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
