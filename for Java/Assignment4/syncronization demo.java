package assignment4;

class Display
{
	public synchronized void wish(String name)
	{
		for(int i=0;i<=5;i++)
		{
			System.out.print("Good morning:");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Error occured");
			}
			System.out.println(name);

		}
	}
}
class mythread extends Thread
{
	Display d;
	String name;
	mythread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
public class SynchornizationDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Display d = new Display();
		mythread t1 = new mythread(d,"Dhoni");
		mythread t2 = new mythread(d,"Yuvaraj");
		t1.start();
        t2.start();
	}

}


/*Output of the program*/
/*
Good morning:Dhoni
Good morning:Dhoni
Good morning:Dhoni
Good morning:Dhoni
Good morning:Dhoni
Good morning:Dhoni
Good morning:Yuvaraj
Good morning:Yuvaraj
Good morning:Yuvaraj
Good morning:Yuvaraj
Good morning:Yuvaraj
Good morning:Yuvaraj
 */
 