package cc.hekafei.collection;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        //初始化一个String类型的数组
        String[] strArr = new String[]{"hello", "world", "!"};

        //Scanner sc = new Scanner(System.in);
        //String[] strArr = sc.next().split(",");

        //修改数组元素的值
        strArr[0] = "good";
        System.out.println(Arrays.toString(strArr));
        //删除数组中的元素，需要手动移动后面的元素
        int len = strArr.length;
        for (int i = 0; i < len - 1; i++) {
            strArr[i] = strArr[i + 1];
        }
        strArr[len - 1] = null;
        System.out.println(Arrays.toString(strArr));
    }
}
