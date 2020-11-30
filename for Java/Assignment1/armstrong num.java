package assignment1;
import java.util.*;
public class JavaAmstrongNumber {
	boolean isamstrong(int n) {
		int copy = n;
		int sum=0,r;
		String s =String.valueOf(n);
		int Len = s.length();
		while(n>0) {
			r=n%10;
			sum=sum+((int)Math.pow(r, Len));
			n=(int)n/10;
		}
		if(copy==sum)return true;
		else return false;
	}
	public static void main(String args[]) {
		JavaAmstrongNumber jsc =new JavaAmstrongNumber();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		if(jsc.isamstrong(n))
			System.out.print("The given number "+n+" is armstrong");
		else
			System.out.print("The given number "+n+" is not  armstrong");
		sc.close();
	}

}

/*     OUTPUT OF THE ARMSTRONG NUMBER  */
/***************************************/
/*   Enter the number : 153            */
/*   The given number 153 is armstrong */
/***************************************/