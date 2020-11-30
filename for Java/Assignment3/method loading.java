package assignment3;
class publication
{
   private String title;
   private int price;
   publication(String title)
   {
	   this(title,90);
   }
   publication(String title,int price)
   {
	 this.title = title;
	 this.price = price;
   }
   void display()
   {
	   System.out.println("Title: "+title);
	   System.out.println("Price: "+price);
   }
}
class Book extends publication
{
    private int pages;
    Book(String title,int pages)
    {
    	super(title);
    	this.pages=pages;
    }
    void display()
    {
    	super.display();
    	System.out.println("Pages: "+pages);
    }
}

class CD extends publication
{
    private int size;
    CD(String title,int size)
    {
    	super(title);
    	this.size=size;
    }
    void display()
    {
    	super.display();
    	System.out.println("Size: "+size);
    }
}
public class JavaSuper_and_MethodOveriding_program 
{
	public static void main(String arg[])
	{
         publication p,k;
         
         p=new Book("Java",1500);
         p.display();
         System.out.println("******************************");
         k=new CD("C",7);
         k.display();
	}

}


/**************OUTPUT OF THE PROGRAM***************/
/*
Title: Java
Price: 90
Pages: 1500
******************************
Title: C
Price: 90
Size: 7
*/