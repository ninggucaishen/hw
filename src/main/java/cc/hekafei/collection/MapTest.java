package cc.hekafei.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "zhangsan");
        map.put(2, "lisi");
        map.put(3, "wangwu");
        map.put(4, "zhaoliu");

        //二次取值
        System.out.println("通过Map.ketSet遍历key和value:");
        for (Integer key : map.keySet()) {
            System.out.println("key:" + key + " and value:" + map.get(key));
        }

        //第二种
        System.out.println("通过Map.enterySet使用iterator遍历key和value：");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("key:" + entry.getKey() + " and value:" + entry.getValue());
        }

        //
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("key:" + entry.getKey() + " and value:" + entry.getValue());
        }

        //第四种，只能遍历value
        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for (String v : map.values()) {
            System.out.println("values:" + v);
        }

        //
        System.out.println("1.8之后");
        map.forEach((key, value) -> {
            System.out.println("key:" + key + " and value:" + value);
        });
    }
}
