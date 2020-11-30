package assignment1;
import java.util.*;
public class JavaNumberPalindrome {
	boolean ispalindrome(int n) {
		String s =String.valueOf(n);
		char[] arr = s.toCharArray();
	    for(int i=0;i<arr.length;i++) {
	    	if(arr[i]!=arr[arr.length-1-i]) 
	    		return false;
	    }
	    return true;
	}
	public static void main(String args[]) {
		JavaNumberPalindrome jsc =new JavaNumberPalindrome();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		if(jsc.ispalindrome(n))
			System.out.print("The number "+n+" is palindrome");
		else 
			System.out.print("The number "+n+" is not a palindrome");
        sc.close();
	}

}

/*    OUTPUT OF THE PALINDROME NUMBER  */
/***************************************/
/*   Enter the number : 1221           */
/*   The number 1221 is palindrome     */
/***************************************/

