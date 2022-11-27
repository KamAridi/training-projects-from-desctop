package task1;

import java.util.Queue;

public class ProducerThread implements Runnable{
    private final Queue<Integer> queue;

    public ProducerThread(Queue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        synchronized (queue) {
            while (true) {
                if (queue.size() < 10) {
                    int random = RandomUtil.getRandom();
                    System.out.println("Producer adding a value: " + random);
                    queue.add(random);
                }
            }
        }
    }
}
