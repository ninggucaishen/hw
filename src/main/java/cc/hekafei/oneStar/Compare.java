package cc.hekafei.oneStar;

import java.io.IOException;

public class Compare {

    public static void main(String[] args) throws IOException {

        String str1 = "hello1";
        String str2 = "hello";
        String str3 = "Hello";
        int result1 = str1.compareTo(str2);
        int result2 = str1.compareToIgnoreCase(str3);
        int result3 = str1.compareTo(str3);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
