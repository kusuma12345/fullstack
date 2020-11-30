package assignment1;
import java.util.*;
public class JavaEvenNumberRange {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to get the range of Even numbers : ");
		int n = sc.nextInt();
		System.out.println("The even numbers are : ");
		for(int i=2;i<=n;i++) {
			if(i%2==0)
				System.out.print(i+" ");
		}
		sc.close();
	}

}

/*                 OUTPUT OF THE EVEN NUMBER                                */
/****************************************************************************/
/*   Enter the number to get the range of Even numbers : 50                 */
/*   The even numbers are :                                                 */
/*   2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 */                             
/****************************************************************************/
