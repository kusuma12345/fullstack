package assignment3;
interface shape
{
	double pi=3.14;
  	public double Calculatearea(double x,double y);
 
}
class circle implements shape
{
	public double Calculatearea(double x,double y)
	{
		return (pi*x*y);
	}
}
class square implements shape
{
	public double Calculatearea(double x,double y)
	{
		return (x*y);
	}
}
class triangle implements shape
{
	public double Calculatearea(double x,double y)
	{
		return (0.5*x*y);
	}
}
public class Java_Interface_shape 
{
  public static void main(String a[])
  {
	  shape s;
	  s= new circle();
	  System.out.println("The area of the circle : "+s.Calculatearea(10,10));
	  s= new triangle();
	  System.out.println("The area of the triangle : "+s.Calculatearea(10,70));
      s= new square();
      System.out.println("The area of the square : "+s.Calculatearea(70,70));
  }
}

/**************OUTPUT OF THE PROGRAM***************/
/*
The area of the circle : 314.0
The area of the triangle : 350.0
The area of the square : 4900.0
*/