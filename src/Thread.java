import java.util.concurrent.CountDownLatch;

public class Thread implements Runnable{
    String nameThread;
    CountDownLatch countDownLatch;
    Thread (String name, CountDownLatch countDownLatch){
        this.nameThread = name;
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        for (int j = 0; j < 10; j++) {
            System.out.println(j + " " + this.nameThread);
        }
        countDownLatch.countDown();
    }
}
