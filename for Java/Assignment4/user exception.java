class  PayOutOfBoundsException extends Exception
{
        private int amount;
        PayOutOfBoundsException(int amount)
        {
            this.amount=amount;
        }
        public String toString()
        {
                  return("The amount "+ amount + " is having pay out of bounds");
        }
} 
public class userexception
{
      public static void main(String a[])
      {
                   int amount  = Integer.parseInt(a[0]);
                   try
                   {
                              if(amount < 10000 || amount > 30000) throw new PayOutOfBoundsException(amount);
                              {
                                          System.out.println("The amount " + amount+ " is not having pay out of bounds");
                              }
                   }
                   catch(PayOutOfBoundsException e)
                   {
                          System.out.println(e);
                   }
      }
}

/*Output of the program*/
/*
Java userexception 9000
The amount 9000 is having pay out of bounds
 */
