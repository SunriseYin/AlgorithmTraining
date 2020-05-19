package cn.sunrise.leecode.chapter01;

/**
 * 2020 05 19 最佳解题思路
 * 面积 = 底 * 高
 * 则底最大的时候 高最高 则面积最大
 * 所以就可以从底最大开始遍历
 */
public class Code11 {

    public static void main(String[] args) {
        int[] a = {1,8,6,2,5,4,8,3,7};
        int i = maxArea(a);
        System.out.println(i);
    }

    private static int maxArea(int[] height) {
        int area = 0;
        for(int i = 0, j = height.length - 1; i < j; ){
            //这一步其实拆分了2步
            // 第一步就是返回较小的一个数
            // 第二步 移动下标 这一步 影响到了下一步计算底的时候 需要最后在 + 1 把移动误差弥补回来
            int heightDiff = height[i] < height[j] ? height[i ++] :height[j --];

            //!!! 这个地方 + 1 一定要注意
            int max = (j - i + 1) * heightDiff;
            area = Math.max(area, max);
        }
        return area;
    }
}
