package cc.hekafei.oneStar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WordsPuzzle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //谜面
        String[] riddle = in.nextLine().split(",");
        //谜底
        String[] answer = in.nextLine().split(",");

        List<String> resList = new ArrayList<>();

        //遍历谜面
        for (int i = 0; i < riddle.length; i++) {
            String r = riddle[i];

            boolean isFound = false;

            //遍历谜底
            for (int j = 0; j < answer.length; j++) {
                String a = answer[j];

                //变换顺序
                if (change(r, a)) {
                    resList.add(a);
                    isFound = true;
                    //去重
                } else if (dist(r, a)) {
                    resList.add(a);
                    isFound = true;
                }
            }
            if (!isFound) {
                resList.add("not found");
            }
        }

        String res = "";
        for (int i = 0; i < resList.size(); i++) {
            res += resList.get(i) + ",";
        }
        System.out.println(res.substring(0, res.length() - 1));
    }

    public static boolean dist(String riddle, String answer) {
        List<Character> qList = new ArrayList<>();
        for (int i = 0; i < riddle.length(); i++) {
            char c = riddle.charAt(i);
            if (!qList.contains(c)) {
                qList.add(c);
            }
        }
        List<Character> aList = new ArrayList<>();
        for (int i = 0; i < answer.length(); i++) {
            char c = answer.charAt(i);
            if (!aList.contains(c)) {
                aList.add(c);
            }
        }
        if (qList.equals(aList)) {
            return true;
        }
        return false;

    }

    public static boolean change(String riddle, String answer) {
        String[] qStr = riddle.split("");
        Arrays.sort(qStr);
        String[] aStr = answer.split("");
        Arrays.sort(aStr);
        if (Arrays.equals(qStr, aStr)) {
            return true;
        }
        return false;
    }
}
