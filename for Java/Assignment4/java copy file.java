package assignment4;

import java.io.*;
public class Java_copy_file {

	public static void main(String[] args) throws IOException
	{
		int i;
		FileInputStream fin = null;
        FileOutputStream fout = null;
        
        //opening Input file
        try
        {
        	fin=new FileInputStream("E://rightstroketraining/file_to_check_vowels.txt");
        }
        catch(FileNotFoundException e) {System.out.println("File not found");}
        
        //opening output file
        try
        {
        	fout=new FileOutputStream("E://rightstroketraining/file_to_check_vowels1.txt");
        }
        catch(FileNotFoundException e) {System.out.print("File unable to open");}
        
        //copying file
        try
        {
        	do
        	{
        		i=fin.read();
        		if(i!=-1)
        			fout.write(i);
        	}while(i!=-1);
        }
        catch(FileNotFoundException e) {System.out.println("File unable to copy");}
        fin.close();
        fout.close();
        
	}

}

/*This above text will be copied to file_to_check_vowels1.txt*/
/*This is the file having containing text. Iam checking how many vowels are there....
i,i,e,i,e,a,i,o,a,i,i,e,i,a,e,i,o,a,o,e,a,e,e,e */