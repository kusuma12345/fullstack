package assignment4;

public class Java_generics_swap<T> {
	
	private T a,b,temp;
	Java_generics_swap(T a,T b,T temp)
	{
		this.a=a;
		this.b=b;
		this.temp=temp;
	}
	public void swap()
	{
		temp=a;
		a=b;
		b=temp;
	}
	public void display()
	{
		System.out.println("a:"+a+" ,"+"b:"+b);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Integer a1=12,b1=90,temp1=null;
		Java_generics_swap<Integer> i = new Java_generics_swap<Integer>(a1,b1,temp1);
		System.out.print("The elements before swap :");
		i.display();
		System.out.print("The elements after swap :");
		i.swap();
		i.display();
		
		System.out.println();
		
		String a2="sparrow",b2="parrot",temp2=null;
		Java_generics_swap<String> s = new Java_generics_swap<String>(a2,b2,temp2);
		System.out.print("The elements before swap :");
		s.display();
		System.out.print("The elements after swap :");
		s.swap();
		s.display();

	}

}


/*Output of the program*/
/*
The elements before swap :a:12 ,b:90
The elements after swap :a:90 ,b:12
The elements before swap :a:sparrow ,b:parrot
The elements after swap :a:parrot ,b:sparrow
 */
 
