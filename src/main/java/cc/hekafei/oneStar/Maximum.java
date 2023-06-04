package cc.hekafei.oneStar;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(",");
        int len = str.length;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (Integer.parseInt(str[i] + str[j]) < Integer.parseInt(str[j] + str[i])) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        String res = "";
        for (int i = 0; i < len; i++) {
            res += str[i];
        }

        System.out.println(res);
    }
}
