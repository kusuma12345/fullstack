package AssignmentPart1;
import java.util.*;

public class JavaStringAnagram {
	public boolean isAnagram(char[] s1,char[] s2) {
		int n1=s1.length;
		int n2=s2.length;
		if(n1!=n2)
			return false;
		else {
			for(int i=0;i<n1;i++) {
				if(s1[i]!=s2[i])
					return false;
			}
			return true;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first String: ");
		String s1 = sc.next();
		s1.toLowerCase();
		char arr1[]=s1.toCharArray();
		Arrays.sort(arr1);
		
		System.out.print("Enter the second String: ");
		String s2= sc.next();
		s2.toLowerCase();
		char arr2[]=s2.toCharArray();
		Arrays.sort(arr2);
		
		JavaStringAnagram jsc = new JavaStringAnagram();
		if(jsc.isAnagram(arr1,arr2))
		    System.out.print("The Strings "+s1+" and "+s2+" are anagrams ");
		else
			System.out.print("The Strings "+s1+" and "+s2+" are not  anagrams ");
		sc.close();
		
	}

}