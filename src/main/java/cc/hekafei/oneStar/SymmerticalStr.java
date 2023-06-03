package cc.hekafei.oneStar;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class SymmerticalStr {
    public static void main(String[] args) {


        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        Solution solution = new Solution();
        int shuliang = sc.nextInt();
        for (int i = 0; i < shuliang; i++) {
            long a = sc.nextLong();
            double b = sc.nextDouble();
            if (solution.f(a, b) == 'R') {
                System.out.println("red");
            } else {
                System.out.println("blue");
            }
        }


    }

    private static int doProcess(long count, long cur, int reverse) {
        if (count == 1) {
            return reverse;
        }
        long half = count / 2;
        if (cur < half) {
            reverse++;
            return doProcess(half, cur, reverse);
        } else {
            return doProcess(half, cur - half, reverse);
        }
    }

    public static class Solution {
        char f(long a, double b) {
            if (a == 1) {
                return 'R';
            }
            if (a == 2) {
                if (b == 0) return 'B';
                else return 'R';
            }
            double sz = pow(a);
            if (b < sz) {
                if (f(a - 1, b) == 'R') {
                    return 'B';
                } else {
                    return 'R';
                }

            }
            if (b >= sz) {
                double index = b - sz;
                return f(a - 1, index);
            }
            return 0;
        }

        double pow(long x) {
            return 1L << (x - 2);
        }
    }
}
