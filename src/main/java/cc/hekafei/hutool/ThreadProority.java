package cc.hekafei.hutool;

public class ThreadProority {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        MyThread myThread4 = new MyThread();

        myThread1.setPriority(Thread.MIN_PRIORITY);
        myThread2.setPriority(Thread.NORM_PRIORITY);
        myThread3.setPriority(Thread.MAX_PRIORITY);
        myThread4.setPriority(3);

        myThread1.start();
        myThread2.start();
        myThread3.start();
    }

}
