package cn.sunrise.leecode.chapter01;

public class Code26 {

    public static void main(String[] args) {
        int[] a = new int[]{1,1,2};

        int i = removeDuplicates(a);
        System.out.println(i);
    }

    public static int removeDuplicates(int[] a) {
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[k] != a[i]){
                a[k + 1] = a[i];
                k++;
            }
        }
        return k + 1;
    }
}
