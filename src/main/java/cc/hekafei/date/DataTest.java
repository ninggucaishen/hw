package cc.hekafei.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(dateFormat.format(date));
    }

}
