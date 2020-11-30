package assignment4;

public class Java_Generics_stack<T> 
{
   private int size=30;
   private T[] stack;
  
   private int stackTop;
   
   //Constructor of the stack
   @SuppressWarnings("unchecked")
Java_Generics_stack(T  []d)
   {
	   stack=d;
	   stack = (T[]) new Object[size]; 

	   stackTop=-1;
   }
   
   //Pushing elements into stack
   int count=0;
   public void push(T t)
   {
	   
	   if(stackTop+1==size)
		   System.out.println("Stack is full");
	   else
	   {
		   count+=1;
		   stackTop+=1;
		   stack[stackTop]=t;
	   }
		   
   }
   
   
public void pop()
   {
	   if(stack.length==0)
		   System.out.print("Stack is empty");	   
	   else
	   {
		   System.out.println("Popped element is :"+stack[stackTop]);
	       stack[stackTop] = null; 
	       stackTop--;
	       count-=1;
	   }
	   
   }
   
public void peek()
   {
	   if(stack.length==0)
		   System.out.print("Stack is empty");
	   else
	   {
		   System.out.println("The peek element is "+stack[stackTop]);
	   }   
   }
   
public void display()
{
	System.out.print("The elements in the stack are: ");
	for(int i=0;i<count-1;i++)
	{
		if(stack[i]!=null)
			System.out.print(stack[i]+" , ");
	}
	System.out.print(stack[count-1]+".");
	System.out.println();
}
   public static void main(String[] args)
   {
	  System.out.println("Adding string elements");
	  String arr1[]= {""};
      Java_Generics_stack<String> s = new Java_Generics_stack<String>(arr1);
      s.push("Hii");s.push("are");s.push("you");s.push("they");s.push("good");
      s.display();
      s.pop();s.pop();
      s.peek();
      s.display();
      
      System.out.println();

	  System.out.println("Adding Integer elements");
	  Integer[] arr2 = null;
      Java_Generics_stack<Integer> i = new Java_Generics_stack<Integer>(arr2);
      i.push(20);i.push(45);i.push(90);i.push(34);
      i.display();
      i.pop();i.pop();
      i.peek();
      i.display();
      
      System.out.println();
      
      System.out.println("Adding Character elements");
	  Character[] arr3 = null;
      Java_Generics_stack<Character> c = new Java_Generics_stack<Character>(arr3);
      c.push('a');c.push('b');c.push('c');c.push('v');
      c.display();
      c.pop();c.pop();
      c.peek();
      c.display();
  

   }
}
   

/*Output of the program*/
/*
 Adding string elements
The elements in the stack are: Hii , are , you , they , good.
Popped element is :good
Popped element is :they
The peek element is you
The elements in the stack are: Hii , are , you.
Adding Integer elements
The elements in the stack are: 20 , 45 , 90 , 34.
Popped element is :34
Popped element is :90
The peek element is 45
The elements in the stack are: 20 , 45.
Adding Character elements
The elements in the stack are: a , b , c , v.
Popped element is :v
Popped element is :c
The peek element is b
The elements in the stack are: a , b.
 */
 