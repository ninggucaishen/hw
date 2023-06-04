package cc.hekafei.hutool;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("zhangsan");
        //MyThread thread2 = new MyThread("lisi");

        thread1.start();

        Thread thread2 = Thread.currentThread();
        String name = thread2.getName();
        System.out.println("name:" + name);
    }

    static class MyThread extends Thread {
        public MyThread(String name) {
            this.setName(name);
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(getName() + "----------" + i);
            }
        }
    }

}
