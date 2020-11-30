package assignment4;
class thread1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Thread1");
				Thread.sleep(500);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);

		}
	}
}
class thread2 implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Thread2");
				Thread.sleep(500);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);

		}
	}
}
public class Java_two_threads 
{
	public static void main(String a[])
	{
	      thread1 t1 = new thread1();
	      t1.start();
	      
	      thread2 t2 = new thread2();
	      Thread m = new Thread(t2);
	      m.start();
	}
 
}


/*We are getting random order inputs*/
/*1) output of the program-1*/
/*
 Thread1
Thread2
Thread1
Thread2
Thread2
Thread1
Thread2
Thread1
Thread2
Thread1
 */
/*2) Output of the program-1*/
/*
 Thread1
Thread2
Thread1
Thread2
Thread1
Thread2
Thread2
Thread1
Thread1
Thread2
 */
 
