package cc.hekafei.hutool;

import java.util.concurrent.TimeUnit;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("main start");
        MyThread myThread = new MyThread();
        myThread.run();
        System.out.println("main end");

        //for (int i = 0; i < 10; i++) {
        //    System.out.println(i);
        //    try {
        //        TimeUnit.SECONDS.sleep(1);
        //    } catch (InterruptedException e) {
        //        e.printStackTrace();
        //    }
        //}
    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
