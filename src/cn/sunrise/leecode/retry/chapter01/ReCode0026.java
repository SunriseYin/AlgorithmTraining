package cn.sunrise.leecode.retry.chapter01;

public class ReCode0026 {

    public int removeDuplicates(int[] a) {
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[k] != a[i]) {
                a[k + 1] = a[i];
                k ++;
            }
        }
        return k + 1;
    }
}
