package week2;

public class sumofboundaryelementsanddiagonalelements {

	public static void main(String[] args) {
		int[][] a = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 1, 3, 5},
                {7, 4, 8, 2}
               };
   printsumofboundaries(a);
   printsumofdiagonalelements(a);
}
private static void printsumofboundaries(int[][] a) {
   int sum = 0;
   for (int i = 0; i < a.length; i++) {
       for (int j = 0; j < a[0].length; j++) {
           if (i == 0 || j == 0 || i == a.length - 1 || j == a[0].length - 1) {
               System.out.print(a[i][j] + " ");
               sum = sum + a[i][j];
           } else {
               System.out.print("  ");
           }
       }
       System.out.println();
   }
   System.out.println("The sum of boundary elements: " + sum);
}
private static void printsumofdiagonalelements(int[][] a) {
      int sum=0;
       for (int i = 0; i <a.length ; i++) {
           for (int j = 0; j <a.length ; j++) {
               if(i==j){
                   System.out.println(a[i][j]+" ");
                   sum=sum+a[i][j];
               }
           }
       }
       System.out.println("The sum of diagonal elements: "+sum);

	}
}
