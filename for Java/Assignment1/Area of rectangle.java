package assignment1;
import java.util.Scanner;
public class JavaAreaOfRectangle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the rectangle : ");
		int l=sc.nextInt();
		System.out.print("Enter the breadth of the rectangle : ");
		int b=sc.nextInt();
		System.out.print("The area of the rectangle : "+ l*b);
		sc.close();
	
	}
	
}

/*      OUTPUT OF THE AREA OF RECTANGLE          */
/*************************************************/
/*  Enter the length of the rectangle : 65       */
/*  Enter the breadth of the rectangle : 2       */
/*  The area of the rectangle : 130              */      
/*************************************************/