package cc.hekafei.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {

    private static final int CORE_POOL_SIZE = 5;
    private static final int MAX_POOL_SIZE = 5;
    private static final int QUEUE_CAPACITY = 5;
    private static final long KEEP_ALIVE_TIME = 5;

    public static void main(String[] args) {
        //使用阿里巴巴推荐的创建线程池方式
        //通过ThreadPoolExecutor构造函数自定义参数创建
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                CORE_POOL_SIZE,
                MAX_POOL_SIZE,
                KEEP_ALIVE_TIME,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(QUEUE_CAPACITY),
                new ThreadPoolExecutor.CallerRunsPolicy()
        );

        for (int i = 0; i < 10; i++) {
            //创建WorkerThread对象
            Runnable worker = new MyRunnable("" + i);
            //执行RUnnable
            executor.execute(worker);
        }
        //终止线程池
        executor.shutdown();
        while (!executor.isTerminated()) {

        }
        System.out.println("Finished all threads");
    }

    private static class MyRunnable implements Runnable {
        public MyRunnable(String s) {
        }

        @Override
        public void run() {
            System.out.println("重写run()");
        }
    }
}
