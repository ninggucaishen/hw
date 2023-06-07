package cc.hekafei.regx;

import java.util.regex.Pattern;

public class RegxTest {
    public static void main(String[] args) {
        String content = "I am ning" + "from heikafei.cc";

        String pattern = ".*heikafei.*";

        Boolean isMatch = Pattern.matches(pattern, content);
        System.out.println(isMatch);
    }
}
