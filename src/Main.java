import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        ExecutorService execute = Executors.newFixedThreadPool(2);

        CountDownLatch countDownLatch1 = new CountDownLatch(10);
        CountDownLatch countDownLatch2 = new CountDownLatch(10);
        CountDownLatch countDownLatch3 = new CountDownLatch(10);
        CountDownLatch countDownLatch4 = new CountDownLatch(10);
        CountDownLatch countDownLatch5 = new CountDownLatch(10);
        CountDownLatch countDownLatch6 = new CountDownLatch(10);
        CountDownLatch countDownLatch7 = new CountDownLatch(10);
        CountDownLatch countDownLatch8 = new CountDownLatch(10);
        CountDownLatch countDownLatch9 = new CountDownLatch(10);
        CountDownLatch countDownLatch10 = new CountDownLatch(10);

        Thread thread1 = new Thread("Thread 1", countDownLatch1);
        Thread thread2 = new Thread("Thread 2", countDownLatch2);
        Thread thread3 = new Thread("Thread 3", countDownLatch3);
        Thread thread4 = new Thread("Thread 4", countDownLatch4);
        Thread thread5 = new Thread("Thread 5", countDownLatch5);
        Thread thread6 = new Thread("Thread 6", countDownLatch6);
        Thread thread7 = new Thread("Thread 7", countDownLatch7);
        Thread thread8 = new Thread("Thread 8", countDownLatch8);
        Thread thread9 = new Thread("Thread 9", countDownLatch9);
        Thread thread10 = new Thread("Thread 10", countDownLatch10);

        execute.execute(thread1);
        execute.execute(thread2);
        execute.execute(thread3);
        execute.execute(thread4);
        execute.execute(thread5);
        execute.execute(thread6);
        execute.execute(thread7);
        execute.execute(thread8);
        execute.execute(thread9);
        execute.execute(thread10);
        
        try {
            countDownLatch1.await();
            countDownLatch2.await();
            countDownLatch3.await();
            countDownLatch4.await();
            countDownLatch5.await();
            countDownLatch6.await();
            countDownLatch7.await();
            countDownLatch8.await();
            countDownLatch9.await();
            countDownLatch10.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
