package cn.sunrise.leecode.chapter01;

/**
 * 爬楼梯问题
 */
public class Code70 {

    /*
        最后的楼梯肯定是 前一节或者是 前 n（规定可跨越楼梯的个数）来到的
        动态规划？？
        TODO:稍后学习 ， 目前只能背诵了
        f(n) = f(n - 1) + f(n - 2)
     */
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }

    //说实话不明白只能背诵了
    public static int climbStairs(int n) {
        if ( n == 1 ) {
            return 1;
        }
        int[] a = new int[n + 1];
        a[1] = 1;
        a[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[n];
    }
}
