package cc.hekafei.Quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerException;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class HelloJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        Object tv1 = jobExecutionContext.getTrigger().getJobDataMap().get("t1");
        Object tv2 = jobExecutionContext.getTrigger().getJobDataMap().get("t2");
        Object jv1 = jobExecutionContext.getJobDetail().getJobDataMap().get("j1");
        Object jv2 = jobExecutionContext.getJobDetail().getJobDataMap().get("j2");
        Object sv = null;

        try {
            sv = jobExecutionContext.getScheduler().getContext().get("skey");
        } catch (SchedulerException e) {
            e.printStackTrace();
        }

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-ss hh:mm:ss");
        String format = dateFormat.format(date);

        System.out.println(tv1 + ":" + tv2);
        System.out.println(jv1 + ":" + jv2);
        System.out.println(sv);
        System.out.println("hello:"+ format);
    }
}
