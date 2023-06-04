package cc.hekafei.hutool;

public class Demo {
    public static void main(String[] args) {
        //创建子类对象
        MyThread myThread = new MyThread();
        //启动线程
        myThread.start();
        //myThread.run();
    }

    static class MyThread extends Thread {
        //重写run()
        @Override
        public void run() {
            System.out.println("开启子线程");
        }
    }

}
