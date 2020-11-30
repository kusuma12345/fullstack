package assignment2;
import java.util.*;
public class JavaStaticProgram {
	public static void printfibonacciseries(int n) {
		int a=0,b=1,c;
		System.out.print(a+" "+b+" ");
		c=a+b;
		while((n-2)>0) {
			System.out.print(c+" ");
			a=b;
			b=c;
			c=a+b;
			n--;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		JavaStaticProgram.printfibonacciseries(n);
		sc.close();
	}

}

/*****************OUTPUT OF THE PROGRAM***********************/
/*****************     Enter the number : 10          ********/
/*****************     0 1 1 2 3 5 8 13 21 34          *******/
/*************************************************************/

