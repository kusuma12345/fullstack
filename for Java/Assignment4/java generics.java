package assignment4;

public class Java_Generics<T>
{
    T ob;
    Java_Generics(T o)
    {
    	ob=o;
    }
    T getob()
    {
    	return ob;
    }
    void showtype()
    {
    	System.out.println("Type of t is : " +ob.getClass().getName());
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Java_Generics<Integer> i = new Java_Generics<Integer>(10);
		i.showtype();
		int v =  i.getob();
		System.out.println("Value is :"+v);
		
		System.out.println();
		
		Java_Generics<String> i1 = new Java_Generics<String>("This is another generic method");
		i.showtype();
		String h =  i1.getob();
		System.out.println("Value is :"+h);
		
		
		

	}

}


/*Output of the program*/
/*
Type of t is : java.lang.Integer
Value is :10
Type of t is : java.lang.Integer
Value is :This is another generic method
 
 */