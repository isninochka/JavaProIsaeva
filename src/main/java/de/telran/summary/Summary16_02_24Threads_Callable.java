package de.telran.summary;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Summary16_02_24Threads_Callable implements Callable {
    @Override
    public Object call() throws Exception {
        Random generator = new Random();
        Integer num = generator.nextInt(5);

        Thread.sleep(num*1000);

        return num;
    }

}

class CallableTest{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask[] futureTasks = new FutureTask[5];

        for (int i = 0; i < 5; i++) {
            Summary16_02_24Threads_Callable callable = new Summary16_02_24Threads_Callable();
            Thread thread = new Thread(futureTasks[i]);
            thread.start();

        }
     
    }
}
