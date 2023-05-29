package cc.hekafei.oneStar;

import java.util.Arrays;
import java.util.Scanner;

public class Board {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);

        while (m > 0) {
            m--;    //木材一段一段的截
            for (int i = 1; i < n; i++) {
                if (nums[i] > nums[i - 1]) {
                    nums[i - 1]++;   //碰到比后面的短的就加一截
                    break;
                }
                if (i == n - 1) {
                    nums[i]++; //所有木材一样长则在最后一根加一截
                }
            }
        }

        System.out.println(nums[0]);
    }

}
