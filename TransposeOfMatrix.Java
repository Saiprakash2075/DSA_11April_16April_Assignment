package week2;

public class transposeofmatrix {

	public static void main(String[] args) {
		int[][] a={{1,2,3},
                {4,5,6},
                {7,8,9}
               };
     printtransposeofmatrix(a);
 }
 private static void printtransposeofmatrix(int[][] a) {
     System.out.println("The matrix after Transpose is: ");
     int row=a.length;
     int column=a[0].length;
     for( int i = 0; i < column; i++)
     {
         for( int j = 0; j < row; j++)
         {
             System.out.print(a[j][i]+" ");
         }
         System.out.println(" ");
     }

	}

}
