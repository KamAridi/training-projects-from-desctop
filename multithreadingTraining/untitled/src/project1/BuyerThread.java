package project1;

import java.util.Queue;

public class BuyerThread  implements Runnable {
    private Queue<Cashbox> cashboxes;

    public BuyerThread(Queue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        while (true) {
            if (!cashboxes.isEmpty()) {
                Cashbox cashbox = cashboxes.remove();
                System.out.println(Thread.currentThread().getName() + " взял кассу " + cashbox);
                try {
                    Thread.sleep(5L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "  отдал кассу  " + cashbox);
                cashboxes.add(cashbox);
                break;
            } else {
                try {
                    Thread.sleep(5L);
                    System.out.println(Thread.currentThread().getName() + " жду кассу ");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}