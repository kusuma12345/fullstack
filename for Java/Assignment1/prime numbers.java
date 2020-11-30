package assignment1;
import java.util.*;
public class JavaPrimeNumbersRange {
	public boolean isprime(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String args[]) {
		JavaPrimeNumbersRange jsc = new JavaPrimeNumbersRange();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to get the range of prime numbers : ");
		int n = sc.nextInt();
		System.out.println("The prime numbers are : ");
		for(int i=2;i<=n;i++) {
			if(jsc.isprime(i))
				System.out.print(i+" ");
		}
		sc.close();
	}

}

/*                 OUTPUT OF THE PRIME NUMBER                          */
/***********************************************************************/
/*   Enter the number to get the range of prime numbers : 34           */
/*   The prime numbers are :                                           */
/*   2 3 5 7 11 13 17 19 23 29 31                                      */
/***********************************************************************/
