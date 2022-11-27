package task1;

import java.util.LinkedList;
import java.util.Queue;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> queue = new LinkedList<>();

        Thread producerThread = new Thread(new ProducerThread(queue));
        Thread consumerThread = new Thread(new ConsumerThread(queue));

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();
    }
}
