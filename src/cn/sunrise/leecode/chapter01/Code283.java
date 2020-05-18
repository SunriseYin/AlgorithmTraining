package cn.sunrise.leecode.chapter01;

public class Code283 {

    public static void main(String[] args) {
        int[] a = {2,1};
        moveZeroes(a);
        for (int i : a) {
            System.out.println(i);
        }
    }

    //零移问题最优解 一个字都不能改
    public static void moveZeroes(int[] a) {
        int zeroIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] != 0) {
                if(zeroIndex != i){
                    a[zeroIndex] = a[i];
                    a[i] = 0;
                }
                zeroIndex ++;
            }
        }
    }
}
