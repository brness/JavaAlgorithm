package brness.pac31.MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteDemo {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(3);

        executorService.execute(new PrintChar('a',10000));
        executorService.execute(new PrintChar('b',10000));
        executorService.execute(new PrintNum(10000));

        executorService.shutdown();
    }
}
