package cc.hekafei.oneStar;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Compare implements Serializable {


    public static void main(String[] args) throws IOException {

        //String str1 = "hello1";
        //String str2 = "hello";
        //String str3 = "Hello";
        //int result1 = str1.compareTo(str2);
        //int result2 = str1.compareToIgnoreCase(str3);
        //int result3 = str1.compareTo(str3);
        //System.out.println(result1);
        //System.out.println(result2);
        //System.out.println(result3);

        //Map<Integer, String> map = new HashMap<>();
        //map.put(1, "hello");
        //map.replace(1, "world");
        //boolean isContainsKey = map.containsKey(2);
        //boolean isContainsValue = map.containsValue("world");
        //if (isContainsKey) {
        //    System.out.println("包含");
        //} else {
        //    System.out.println("不包含");
        //}
        //System.out.println(isContainsValue);
        ////System.out.println(isContain);
        //System.out.println(map.get(1));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "zhangsan");
        map.put(2, "lisi");
        map.put(3, "wangwu");
        map.put(4, "zhaoliu");

        System.out.println(map.keySet());
        System.out.println(map.values());

        //遍历key
        for (Integer key : map.keySet()) {
            System.out.println("key:" + key);
        }

        //遍历value
        for (String value : map.values()) {
            System.out.println("value:" + value);
        }

        //遍历key,value
        //for (Map.Entry<Integer, String> entry : map.entrySet()) {
        //    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        //}

        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        boolean isContain = list.contains(2);
        System.out.println(list);
        System.out.println(isContain);

        Map<Integer, String> map1 = new HashMap<>();


    }
}
