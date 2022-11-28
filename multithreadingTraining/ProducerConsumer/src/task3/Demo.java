package task3;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(2);
        Scanner scanner = new Scanner(System.in);
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

        while(scanner.hasNextInt()){
            int nextInt = scanner.nextInt();
            if(nextInt<0){
                break;
            }
            pool.submit(()->{
                try {

                    Integer count = threadLocal.get();
                    threadLocal.set(count==null ? 1 : ++count);

                    Thread.sleep(nextInt*1000L);

                    System.out.println(String.format("Thread: '%s' sleeped: '%d' sec, count: '%d' times",
                            Thread.currentThread().getName(),
                            nextInt, threadLocal.get()));

                    return nextInt;

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        pool.shutdown();
    }
}
