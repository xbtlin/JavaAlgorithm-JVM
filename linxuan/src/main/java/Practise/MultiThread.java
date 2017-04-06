package Practise;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by linxuan on 17/03/2017.
 */
public class MultiThread {


    public static void noName() {

        Math.random();

        Runnable r = new Runnable() {

            public void run() {
                System.out.println("");
            }
        };

        Executor exec = Executors.newFixedThreadPool(10);

        exec.execute(r);
    }
}
