package AssignmentPart1;

public class JavaRemovingDuplicates {
	public static < E > void duplicate(E[] elements){
	       for(int i=0;i<(elements.length-1);i++)
	       {
	           if(elements[i]!=elements[i+1])
	               System.out.print(elements[i]+" ");  
	       }
	       System.out.print(elements[elements.length-1]);
	       System.out.println();  
	   }

	    public static void main( String args[] ) {  
	        Integer[] intArray = { 10, 20,20,30, 30, 40, 50,50,50};  
	        Character[] charArray = { 'J', 'J','A', 'V', 'A', 'T','P','O','I','N','T','T' };  
	        String[] strArray = {"Mat","Mat","To","House","House","Mango","Mango"};

	        System.out.println( "The integer array removing duplicates" );  
	        duplicate( intArray  );   

	        System.out.println( "The character array removing duplicates" );  
	        duplicate( charArray );   

	        System.out.println( "The string array removing duplicates" );  
	        duplicate( strArray );   


	    }

}