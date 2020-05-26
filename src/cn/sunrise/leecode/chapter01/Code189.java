package cn.sunrise.leecode.chapter01;

public class Code189 {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};

        rotate(a, 2);

        for (int i : a) {
            System.out.println(i);
        }
    }

    public static void rotate(int[] nums, int k) {
        int temp;
        for (int i = 0; i < k; i++) {
            temp = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j -1];
            }
            nums[0] = temp;
        }
    }
}
