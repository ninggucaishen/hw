package cc.hekafei.oneStar;

import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String res = "";
        String temp = "";       //用来拼接字符的临时容器

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {    //判断是否是字母
                temp += c;
            } else if (c == ' ') {
                res += reverse(temp) + " ";     //遇到空格，对temp进行反转，需要加上空格
                temp = "";
            } else {
                if (temp != "") {
                    res += reverse(temp);       //如果temp不为空则需要反转后拼接
                    temp = "";      //对temp进行置空
                }
                res += c;       //标点符号直接拼接
            }

            if (i == str.length() - 1 && temp != "") {
                res += reverse(temp);       //如果最后一个字符是字母
            }
        }
        System.out.println(res);
    }

    /**
     * 反转字符串中的字符
     * @param str
     * @return
     */
    private static String reverse(String str) {
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }
        return res;
    }
}
