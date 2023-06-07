package cc.hekafei.concurrent;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TimeTest {
    public static void main(String[] args) throws InterruptedException {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = dateFormat.format(date);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("当前时间：" + format + "n" + "线程名称：" + Thread.currentThread().getName());
            }
        };
        System.out.println("当前时间：" + format + "n" + "线程名称：" + Thread.currentThread().getName());

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);
        //Timer timer = new Timer("Timer");
        long delay = 1000l;
        long period = 1000l;
        //timer.schedule(task, delay);
        executorService.scheduleAtFixedRate(task, delay, period, TimeUnit.MICROSECONDS);
        Thread.sleep(delay + period * 5);
        executorService.shutdown();
    }
}
