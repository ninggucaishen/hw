package cc.hekafei.function;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        String[] str = new String[]{"zhangsan", "lisi", "wangwu", "zhaoliu"};
        Optional<String> first = Arrays.stream(str).findFirst();
        System.out.println(first);
        Stream<String> stream = Arrays.stream(str);
        stream = Stream.of("zhangsan", "lisi");
        System.out.println(stream);
    }
}
