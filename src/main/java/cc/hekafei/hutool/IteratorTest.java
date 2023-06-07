package cc.hekafei.hutool;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        list.add("zhaoliu");

        //获取迭代器
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String i = iterator.next();
            if (i == "lisi") {
                iterator.remove();
            }
        }

        System.out.println(list);
    }
}
