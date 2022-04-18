package week2;

import java.util.Arrays;

public class rotatearrayntimes {

	public static void main(String[] args) {
		int[] a={1,2,3,4,5};
        int n=4;
        rotatearray(a,n);
        System.out.println(Arrays.toString(a));
    }
    private static void rotatearray(int[] a, int n) {
        if (n < 0 || n >= a.length) {
            return;
        }
        for (int i = 0; i < n; i++) {
            rightRotateByOne(a);
    }
}
    private static void rightRotateByOne(int[] a) {
        int last = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            a[i + 1] = a[i];
        }
        a[0] = last;

	}

}
