package assignment3;
class parentClass
{
   public void display()
   {
	   System.out.println("The parent class is displaying and iam a overidden method ");
   }
}
class childClass extends parentClass
{
	public void display()
	   {
		   System.out.println("The child class is displaying and iam a overiding method ");
	   }
}
public class Java_method_overiding {
	public static void main(String arg[])
	{
		childClass obj = new childClass();
		obj.display();
	}

}


/**************OUTPUT OF THE PROGRAM***************/
/*The child class is displaying and iam a overiding method */
 
