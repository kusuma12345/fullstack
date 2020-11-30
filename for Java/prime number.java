package AssignmentPart1;
import java.util.Scanner;
public class JavaPrimeNumber {
	public boolean prime(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) 
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		JavaPrimeNumber jsc = new JavaPrimeNumber();
		if(jsc.prime(n)) 
		if(jsc.prime(n) && n>1) 
			System.out.println("The number "+n+" is prime number.");
		else 
			System.out.println("The number "+n+" is not a prime number.");
		sc.close();
	}
}