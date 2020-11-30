package assignment2;
import java.util.*;
public class JavaMatrixAddition {
 public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("Enter the rows : ");
	 int rows = sc.nextInt();
	 
	 System.out.print("Enter the cols : ");
	 int cols = sc.nextInt();
	 
	 int[][] arr1 = new int[rows][cols];
	 int[][] arr2 = new int[rows][cols];
	 int[][] sum  = new int[rows][cols];
	 
	 System.out.println("Enter the first array elements : ");
	 for(int i=0;i<rows;i++) 
	 {
		 for(int j=0;j<cols;j++) 
			 arr1[i][j]=sc.nextInt();
	 }
	 
	 System.out.println("Enter the second array elements : ");
	 for(int i=0;i<rows;i++) 
	 {
		 for(int j=0;j<cols;j++) 
			 arr2[i][j]=sc.nextInt();
	 }
	 
	 for(int i=0;i<rows;i++) 
	 {
		 for(int j=0;j<cols;j++) 
			 sum[i][j]=arr1[i][j]+arr2[i][j];
	 }
	 
	 System.out.println("The addition of the two matrix elements : ");
	 for(int i=0;i<rows;i++) 
	 {
		 for(int j=0;j<cols;j++) 
			 System.out.print(sum[i][j]+"  ");
		 System.out.println();
	 }
	 sc.close();
	 
	 
 }
}


/*Enter the rows : 3
Enter the cols : 3
Enter the first array elements : 
2
2
2
3
3
3
2
2
2
Enter the second array elements : 
2
2
2
3
3
3
2
2
2
The addition of the two matrix elements : 
4  4  4  
6  6  6  
4  4  4  
*/

