class Javaexceptionhandling{
	public static void main (String args[ ]){
		int number, CharacterCount = 0;
		for (int i = 0; i < args.length; i++)  
		{
			try 
                        {
				number = Integer.parseInt(args[i]);
			} catch (NumberFormatException e)
                        {
				CharacterCount++;
			}
		}
		System.out.println ("Character Count entries: " + CharacterCount);
		System.out.println ("Integer count entries: " +(args.length-CharacterCount));
	}
}

/********************OUTPUT OF THE PROGRAM****************/
/*java Javaexceptionhandling s r i n i v a s 3 4 5 h i i i 2 3 4*/
/*Character Count entries: 12*/
/*Integer count entries: 6*/
