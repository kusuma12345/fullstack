package assignment4;

class cofeemachine
{
	int quantity=0;//Quantity in Litres
	synchronized void Deliveringcoffee(int quantity)
	{
		System.out.println("Going to fill the coffee in the cup....");
		if(this.quantity<quantity)
		{
			System.out.println("Sorry expected amount of coffee not present,please wait to fill coffee in the machine :( ");
		    try 
		    {
			   wait();
		    }
		    catch(Exception e)
			{
				System.out.println("Error occured");
			}
		}

		this.quantity-=quantity;
		System.out.println("Your coffee is ready to take :()");
	}
	
	synchronized void fillingcoffeemachine(int amount)
	{
		System.out.println("Filling the coffee machine....");
		this.quantity+=quantity;
		System.out.println("Coffee is dropped into the machine : )");
        notify();
	}
}
public class InterThreadcmmunication {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		cofeemachine c = new  cofeemachine();
		
        new Thread()
        {
        	public void run()
        	{
        		c.Deliveringcoffee(2);
        		
        	}
        }.start();
        
        new Thread()
        {
        	public void run()
        	{
        		c.fillingcoffeemachine(2);
        		
        	}
        }.start();
	}

}



/*Output of the program*/
 /*
Going to fill the coffee in the cup....
Sorry expected amount of coffee not present,please wait to fill coffee in the machine :( 
Filling the coffee machine....
Coffee is dropped into the machine : )
Your coffee is ready to take :()
*/
 