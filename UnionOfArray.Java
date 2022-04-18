package week2;

public class unionofarray {

	public static void main(String[] args) {
		int[] a={3,5,6,8,9};
        int[] b={5,7,9};
        int m=a.length;
        int n=b.length;
        printunionofarray(a,b,m,n);
    }
    private static int printunionofarray(int[] a, int[] b, int m, int n) {
        int i=0;
        int j=0;
        while (i < m && j < n) {
            if (a[i] < b[j])
                System.out.print(a[i++] + " ");
            else if (b[j] < a[i])
                System.out.print(b[j++] + " ");
            else {
                System.out.print(b[j++] + " ");
                i++;
            }
        }
        while (i < m)
            System.out.print(a[i++] + " ");
        while (j < n)
            System.out.print(b[j++] + " ");

        return 0;

	}
}
