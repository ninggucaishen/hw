package cc.hekafei.collection;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //初始化一个String类型的ArrayList
        ArrayList<String> list = new ArrayList<>();
        //添加元素到ArrayList中
        list.add("good");
        list.add("haha");
        list.add(null);     //添加null
        list.add("");       //添加空字符串
        System.out.println(list);
        //修改ArrayList中的元素
        list.set(0, "hi");
        System.out.println(list);
        //删除ArrayList中的元素
        list.remove(0);
        System.out.println(list);
    }
}
