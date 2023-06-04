package cc.hekafei.oneStar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int len = s.length();
        List<String> list = new ArrayList<>();

        String temp = "";
        Boolean yh = false;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != '_') {
                if (s.charAt(i) == '\"') {
                    yh = !yh;
                }
                temp += s.charAt(i);
                if (i == len - 1) {
                    list.add(temp);
                }
            } else {
                if (temp == "") {
                    continue;
                }
                if (yh) {
                    temp += s.charAt(i);
                } else {
                    list.add(temp);
                    temp = "";
                }
            }
        }
        int count = list.size();
        if (n > count) {
            System.out.println("ERROR");
        } else {
            String res = "";
            for (int i = 0; i < count; i++) {
                if (i == n) {
                    res += "******";
                } else {
                    res += list.get(i);
                }
                if (i != list.size() - 1) {
                    res += "_";
                }
            }
            System.out.println(res);
        }
    }
}
