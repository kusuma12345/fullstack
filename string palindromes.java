package AssignmentPart1;
import java.util.Scanner;
public class JavaStringPalindrome {
	   public boolean ispalindrome(char[] s) {
		   for(int i=0;i<s.length/2;i++) {
			  if(s[i] != s[s.length-i-1]) 
				  return false;
		   }
		   return true;
	   }
       public static void main(String[] args) {
    	   Scanner sc = new Scanner(System.in);
    	   System.out.print("Enter the string: ");
    	   String s = sc.nextLine();
    	   char[] arr = s.toCharArray();
    	   JavaStringPalindrome jsc = new JavaStringPalindrome();
    	   if(jsc.ispalindrome(arr))
    		   System.out.print("The string "+s+" is a palindrome");
    	   else
    		   System.out.print("The string "+s+" is not a palindrome");
    	   sc.close();
       }
}