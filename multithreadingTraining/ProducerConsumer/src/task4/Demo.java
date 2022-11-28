package task4;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Demo {
    public static void main(String[] args) {

        Random random = new Random();
        int[] values = new int[100_000_000];
        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(300) + 1;
        }

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        trackTask(()-> findParallelMax(values, executorService));
        trackTask(()-> findMax(values));

        executorService.shutdown();
    }
    public static int trackTask(Supplier<Integer> task){
        long startTime = System.currentTimeMillis();
        Integer result = task.get();
        System.out.println(result + ": " + (System.currentTimeMillis() - startTime));
        return result;
    }
    public static int findMax(int[] arr) {
        return IntStream.of(arr)
                .max()
                .orElse(Integer.MIN_VALUE);
    }

    public static int findParallelMax(int[] arr, ExecutorService executorService) {
        try {
            return executorService.submit(()-> IntStream.of(arr)
                    .parallel()
                    .max()
                    .orElse(Integer.MIN_VALUE)).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
