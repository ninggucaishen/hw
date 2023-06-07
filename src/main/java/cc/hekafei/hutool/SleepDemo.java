package cc.hekafei.hutool;

public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("main start");
        ThreadSleep threadSleep = new ThreadSleep();
        threadSleep.start();
        try {
            threadSleep.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("main end");
    }

    static class ThreadSleep extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(getName() + "------------" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
