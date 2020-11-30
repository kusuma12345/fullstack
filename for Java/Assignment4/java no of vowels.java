package assignment4;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Java_no_of_vowels_in_given_file {
	public static boolean isVowel(char ch)
	{
		ch=Character.toLowerCase(ch);
		String s="";
		s=ch+"";
		s.trim();
		char[] chi = s.toCharArray(); 
		for(char c : chi)
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			  return true;
		return false;
	}

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		FileInputStream fin = null;
		try{ fin = new FileInputStream("E://rightstroketraining/file_to_check_vowels.txt");}
		catch(FileNotFoundException e) {	System.out.println("File not found"); }
		
		int val, count = 0;
		while((val = fin.read()) != -1)
		{
		    char ch = (char)val;
		    if(isVowel(ch))
		    	count++;
		}
		System.out.println("The no of vowels are :"+count);

	}


}


/*The text containing in the file_to_check_vowels.txt is mentioned above */
/*This is the file having containing text. Iam checking how many vowels are there....
i,i,e,i,e,a,i,o,a,i,i,e,i,a,e,i,o,a,o,e,a,e,e,e */

/*Output of the program*/
/*
 The no of vowels are :48
 */
 