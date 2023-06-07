package cc.hekafei.collection;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("重地", 3);
        map.put("通话", 3);
        System.out.println(map);

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
    }
}
